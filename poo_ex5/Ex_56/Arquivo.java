package poo_ex5.Ex_56;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/* IDEIA
Acho que ja existem funcoes similares em File, apenas adaptei para o exercicio.
A ideia de retornar um ArrayList de Registro nao parece muito boa, talvez eu 
devesse ter mantido em formato String e fazer uma funcao toRegistro(String) em 
Registro. Mas funcionou como esperado sem dar problemas entao continuei com essa
ideia.
O metodo Write foi feito em Windows, talvez gere problemas de quebra de linha
em outras linguagens.
 */
public class Arquivo {
    
    public static ArrayList<Registro> Read(String Caminho){
        String split[];
        ArrayList<Registro> registros=new ArrayList<Registro>();
        try {
            FileReader arquivo = new FileReader(Caminho);
            BufferedReader lerArquivo = new BufferedReader(arquivo);
            String linha;
            try {
                linha = lerArquivo.readLine();
                while(linha!=null){
                    split=linha.split(" ");
                    Registro registro=new Registro(split[0],split[1],split[2],split[3]);
                    registros.add(registro);
                    linha = lerArquivo.readLine();
                }
                arquivo.close();
                return registros;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return registros;
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return registros;
        }
    }
    
    public static boolean Write(String Caminho,Registro registro){
        try {
            FileWriter arquivo = new FileWriter(Caminho,true);
            PrintWriter gravarArq = new PrintWriter(arquivo,true);
            gravarArq.append(System.lineSeparator()+Integer.toString(registro.dia)+" "+Double.toString(registro.temperaturaMin)+" "+Double.toString(registro.temperaturaMax)+" "+Integer.toString(registro.indice));
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
}
