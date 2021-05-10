package arquivo;

import game.Item;
import game.Mochila;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*      IMPORTANTE
Ainda nao esta funcionando.
ToDo: Resolver problemas de serializacao
ToDo: Salvar itens e gold separadamente e criar uma mochila dentro de carregaMochila
 */

/*      Atividade Individual:
Infelizmente esta classe ainda nao esta funcionando, mas ela segue a mesma ideia
de PersonagensArquivo, entao simulei onde seriam jogadas as excecoes.*/
public class MochilaArquivo {
    public static String caminho=System.getProperty("java.class.path")+System.getProperty("file.separator")+"arquivo"+System.getProperty("file.separator")+"Mochila.txt";
    
    public static Mochila carregaMochila() throws ArquivoNaoEncontradoException, IOException, ClassNotFoundException, ArquivoVazioException{
        Mochila retorno=new Mochila();
        Item temp = null;
        
        //checa possiveis excecoes
        File teste=new File(caminho);
        if(teste.canRead()==false)throw new ArquivoNaoEncontradoException();
        if(teste.length()==0)throw new ArquivoVazioException();
        
        FileInputStream input;
        input = new FileInputStream(caminho);
        ObjectInputStream lerInput = new ObjectInputStream(input);
        temp =((Item)lerInput.readObject());
        //le todos os itens
        while(temp!=null){//acredito que temp seria null caso nao houvesse mais itens a serem lidos
            retorno.adicionaItem(temp);//adiciona o item lido a nova mochila
            temp =((Item)lerInput.readObject());//tenta ler outro
        }
        input.close();
        return retorno;
    }
    
    public static int salvaMochila(Mochila mochila) throws IOException, FileNotFoundException, ArquivoNaoEncontradoException{
        apaga();
        for(int i=0;i<10;i++){
            Item temp=((Item)mochila.getItem(i));
            if(temp!=null)MochilaArquivo.salvaItem(temp);
            else break;
        }
        return 1;
    }
    
    
    public static int salvaItem(Item temp) throws FileNotFoundException, IOException, ArquivoNaoEncontradoException{
        
        //checa possiveis excecoes
        File teste=new File(caminho);
        if(teste.canRead()==false)throw new ArquivoNaoEncontradoException();
        //if(temp==null)throw new ItemNaoEncontradoException();
        
        FileOutputStream arquivo = new FileOutputStream(caminho,true);
        ObjectOutputStream itemSalvo= new ObjectOutputStream(arquivo);
        itemSalvo.writeObject(temp);
        itemSalvo.flush();
        itemSalvo.close();
        return 1;
    }
    
    public static void apaga() throws FileNotFoundException, IOException, ArquivoNaoEncontradoException{
        
        //checa possiveis excecoes
        File teste=new File(caminho);
        if(teste.canRead()==false)throw new ArquivoNaoEncontradoException();
        
        FileOutputStream writer = new FileOutputStream(caminho);
        writer.write(("").getBytes());
        writer.close();
    }
}
