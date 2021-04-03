package poo_ex5.Ex_57;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import poo_ex5.Ex_56.Registro;

/*

 */

public class ArquivoFuncionario {
    public static void Read(String Caminho){
        //ArrayList<Funcionario> registros=new ArrayList<Funcionario>();
        try {
            FileInputStream input = new FileInputStream(Caminho);
            InputStreamReader lerInput = new InputStreamReader(input);
            BufferedReader lerArquivo = new BufferedReader(lerInput);
            char nome[] = null;
            int controle=1;
            try {
                controle = lerInput.read(nome, 4, 16);
                /*while(controle!=0){
                    System.out.print(nome+"\n");
                    controle = lerInput.read(nome, 4, 16);
                }*/
                input.close();
                return;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return;
        }
    }
    
    public static boolean Write(String Caminho,Funcionario entrada){
        try {
            FileOutputStream arquivo = new FileOutputStream(Caminho,true);
            OutputStreamWriter escreve = new OutputStreamWriter(arquivo);
            //escreve.append(entrada.nome.subSequence(0, entrada.nome.length()));
            escreve.write(entrada.nome);
            arquivo.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
