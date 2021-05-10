package game;

import arquivo.ArquivoNaoEncontradoException;
import arquivo.ArquivoVazioException;
import arquivo.PersonagemNaoEncontradoException;
import arquivo.PersonagensArquivo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*      Atividade Individual:
    Adicionei os Try/Catchs necessarios para o programa funcionar, e printo as
mensagens referentes a cada erro. Linhas: 31 e 67
    Adicionei tambem um if parando o funcionamento do programa nos casos desses
erros, pois a leitura do arquivo eh essencial. Percebi que seria util um novo 
metodo  para criar um arquivo novo com personagens lvl 1 nesse caso, mas nao 
acho que cabe fazer isso nesta atividade.*/
public class GameMain {

    public static void main(String[] args) {
        
        ArrayList<Personagem> personagens=new ArrayList<Personagem>();
        Mochila mochila=new Mochila();
        
        //adiciona alguns itens na mochila ToDo:implementar MochilaArquivo
        PocaoFogo pocao1=new PocaoFogo();
        PocaoCura pocao2=new PocaoCura();
        mochila.adicionaItem(pocao1);mochila.adicionaItem(pocao1);
        mochila.adicionaItem(pocao2);mochila.adicionaItem(pocao2);
        
        try {//carrega os personagens do arquivo
            PersonagensArquivo.carregaPersonagens(personagens);
        } catch (ArquivoNaoEncontradoException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (ArquivoVazioException ex) {
            System.out.println(ex.getMessage());}
        if(personagens.isEmpty()){//checa se os personagens foram lidos com sucesso
            //ToDo: PersonagensArquivo.novosPersonagens(personagens);
            System.out.println("Erro na leitura do arquivo!");
            return;
        }
        
        Scanner teclado = new Scanner(System.in);
        int escolha;
        System.out.println("Bem vindo ao jogo!");
        while(true) {
            System.out.println("1.Procurar um combate\n2.Descansar na cidade\n3.Olhar os personagens\n4.Sair do jogo");
            escolha = teclado.nextInt();
            if(escolha==1) {
                AcharCombate.encontro(personagens,mochila);
            }
            if(escolha==2) {
                RegenChars.regenChars(personagens);//ToDo: loja
            }
            if(escolha==3) {
                for(int i=0;i<4;i++) {
                    personagens.get(i).imprime();
                }mochila.imprime();
            }
            if(escolha==4) {
                teclado.close();
                
                try {//salva o estado dos personagens
                    PersonagensArquivo.salvaTodos(personagens);
                } catch (ArquivoNaoEncontradoException ex) {
                    System.out.println(ex.getMessage());
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                } catch (PersonagemNaoEncontradoException ex) {
                    System.out.println(ex.getMessage());}
                return;
            }
        }
    }
}
