package poo_ex5.Ex_56;

import java.util.ArrayList;
import java.util.Scanner;

/* Enunciado
Considere a existência de um arquivo contendo registros formados por 
sequências de int, double, double, int correspondentes ao dia do mês, 
temperatura mínima, temperatura máxima e índice pluviométrico. Desenvolve uma 
classe capaz de representar essas informações. Desenvolva outrar classe capaz 
de ler as informações nesse arquivo e adicionar novas entradas.
 */
public class main_Ex56 {
    
    public static void main(String args[]){
        
        //Completar o caminho para funcionar corretamente
        String caminho= "C:\\ ... \\src\\poo_ex5\\Ex_56\\Registros.txt";
        ArrayList<Registro> registros=Arquivo.Read(caminho);
        
        for(Registro temp: registros){
            temp.imprimir();
        }
        
        String split[];
        Scanner scanner =new Scanner(System.in);
        
        //A escrita foi feita em Windows, talvez gere algum problema por quebra
        //de linhas em outros sistemas.
        System.out.print("Deseja adicionar um novo registro? s/n \n");
        if(scanner.nextLine().contentEquals("s")){

            System.out.print("Informe o novo registro no formato 'dia Min Max indice' :\n");
            split=scanner.nextLine().split(" ");
            Registro novo= new Registro(split[0],split[1],split[2],split[3]);
            Arquivo.Write(caminho, novo);
            registros.add(novo);

            for(Registro temp: registros){
                temp.imprimir();
            }
        }
    }
    
}
