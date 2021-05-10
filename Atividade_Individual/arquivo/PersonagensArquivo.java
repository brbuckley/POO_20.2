package arquivo;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import game.Personagem;
import java.io.File;

/*      Ideia:
Salva os personagens em um arquivo binario. Eh chamado no inicio e no fim da
execucao para carregar e salvar o estado dos personagens. Funciona como um
CheckPoint ou SaveGame.*/

/*      Atividade Individual:
Como essa classe tratava excecoes do java eu tive que "joga-las" para a main 
tambem, alem disso criei excecoes novas para Arquivo Nao Encontrado, Personagem
Nao Encontrado, e Arquivo Vazio. Elas sao checadas no inicio dos metodos.
    Ao tratar essas excecoes percebi que seria util um novo metodo para criar
um novo arquivo com personagens lvl1, mas ainda nao implementei ele.*/
public class PersonagensArquivo {
    
    public static String caminho=System.getProperty("java.class.path")+System.getProperty("file.separator")+"arquivo"+System.getProperty("file.separator")+"Save.txt";
    
    /*ToDo: public static void novosPersonagens(ArrayList<Personagem> personagens){Guerreiro p1=new Guerreiro("GUERREIRO");personagens.add(p1);
        BlackMage p2=new BlackMage("MAGO");personagens.add(p2);
        WhiteMage p3=new WhiteMage("CLERIGO");personagens.add(p3);
        Rogue p4=new Rogue("ROGUE");personagens.add(p4);       
        PersonagensArquivo.salvaTodos(personagens);
    }*/
    
    public static Personagem carregaPersonagem(int index) throws ArquivoNaoEncontradoException, FileNotFoundException, IOException, ArquivoVazioException, ClassNotFoundException{
        
        Personagem retorno = null;
        
        //checa possiveis excecoes
        File teste=new File(caminho);
        if(teste.canRead()==false)throw new ArquivoNaoEncontradoException();
        if(teste.length()==0)throw new ArquivoVazioException();
        
        
        FileInputStream input;
        input = new FileInputStream(caminho);
        for(int i=0;i<=index;i++){
            ObjectInputStream lerInput = new ObjectInputStream(input);
            retorno =((Personagem)lerInput.readObject());
        }input.close();
        return retorno;
    }
    
    public static void carregaPersonagens(ArrayList<Personagem> personagens) throws ArquivoNaoEncontradoException, IOException, FileNotFoundException, ClassNotFoundException, ArquivoVazioException{
        personagens.clear();
        for(int i=0;i<4;i++){
                Personagem teste;
                teste = PersonagensArquivo.carregaPersonagem(i);
                personagens.add(teste);
            }
    }
    
    public static int salvaTodos(ArrayList<Personagem> personagens) throws ArquivoNaoEncontradoException, IOException, FileNotFoundException, PersonagemNaoEncontradoException{
        apaga();
        for(Personagem var:personagens){
            PersonagensArquivo.salvaPersonagem(var);
        }
        return 1;
    }
    
    
    public static int salvaPersonagem(Personagem personagem) throws ArquivoNaoEncontradoException, FileNotFoundException, IOException, PersonagemNaoEncontradoException{
        
        //checa possiveis excecoes
        File teste=new File(caminho);
        if(teste.canRead()==false)throw new ArquivoNaoEncontradoException();
        if(personagem==null)throw new PersonagemNaoEncontradoException();
        
        FileOutputStream arquivo = new FileOutputStream(caminho,true);
        ObjectOutputStream personagemSalvo= new ObjectOutputStream(arquivo);
        personagemSalvo.writeObject(personagem);
        personagemSalvo.flush();
        personagemSalvo.close();
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