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
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import poo_ex5.Ex_56.Registro;

/*

 */

public class ArquivoFuncionario {
    public static void leitura(String Caminho){
        //ArrayList<Funcionario> registros=new ArrayList<Funcionario>();
        try {
            FileInputStream input = new FileInputStream(Caminho);
            ObjectInputStream lerInput = new ObjectInputStream(input);
            try {
                System.out.print(((Funcionario)lerInput.readObject()).nome);
                input.close();
                return;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return;
            }
            catch (ClassNotFoundException ex) {
                System.out.println("Erro: Classe nao existe!");
                return;
            }
        } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return;
            }
    }
    
    public static boolean escreve(String Caminho,Funcionario entrada){
        try {
            FileOutputStream arquivo = new FileOutputStream(Caminho);
            ObjectOutputStream funcionario= new ObjectOutputStream(arquivo);
            funcionario.writeObject(entrada);
            funcionario.flush();
            funcionario.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
