package poo_ex6.Ex_65;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.TreeSet;

/*Enunciado
    Faça um programa que converta um ArrayList em um HashSet, este em um 
PriorityQueue, este em um ArrayDeque e este em um TreeSet usando a versão de 
seus construtores que use um Collection como argumento. Comece criando um 
pequeno ArrayList de strings e exibindo a lista usando seu método toString(). 
Em seguida, faça o mesmo para construir e exibir os outros Collections, usando 
um como argumento do construtor do próximo. Ainda que todos os Collections 
contenham as mesmas strings, você deve vê-los sendo exibidos em ordens 
diferentes em alguns deles. Por quê? 

            Resposta:
    O indice deles eh definido de forma diferente em cada Estrutura de Dados,
em ArrayList por exemplo, é por ordem de chegada, numa arvore binaria por 
exemplo pode ser definido pelo valor do objeto.

 */
public class main_ex65 {
    
    public static void main(String args[]){
    
        ArrayList<String> array=new ArrayList<String>();
        array.add("amor");array.add("baixinho");
        array.add("coracao");array.add("docinho");
        array.add("escola");array.add("feijao");
        
        System.out.print(array.toString()+"\n");
        
        HashSet hash=new HashSet(array);
        System.out.print(hash.toString()+"\n");
        
        PriorityQueue prioQ=new PriorityQueue(hash);
        System.out.print(prioQ.toString()+"\n");
        
        ArrayDeque arrayD=new ArrayDeque(prioQ);
        System.out.print(arrayD.toString()+"\n");
        
        TreeSet treeS=new TreeSet(arrayD);
        System.out.print(treeS.toString()+"\n");
        
    }
}