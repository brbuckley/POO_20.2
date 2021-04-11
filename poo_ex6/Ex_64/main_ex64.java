package poo_ex6.Ex_64;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*Enunciado
Faça um programa que leia uma frase e informe o número de ocorrências de cada 
palavra da frase (Dica: Use Map para fazer essa contagem)

            Ideia:
    Recebe uma entrada do texo inteiro pelo teclado, e usa cada palavra unica 
como chave no Map, o valor da chave eh o seu numero de ocorrencias no texto 
inteiro, e esse valor e incrementado durante a criacao
 */
public class main_ex64 {
    
    public static void main(String args[]){
        
        Scanner scanner=new Scanner(System.in);
        String split[];
        String entrada;
        
        entrada=scanner.nextLine();
        split=entrada.split(" ");
        
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        //uso o split para separar a String
        for(int i=0;i<split.length;i++){
            
            //se a palavra for repetida uso o merge incrementando 1
            if(map.containsKey(split[i]))map.merge(split[i], 1, Integer::sum);
            else map.put(split[i],1);
        }
        
        //o print
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" / "+entry.getValue());
        }
    }
}