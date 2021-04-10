package poo_ex6.Ex_61;

import java.util.ArrayList;

/*Enunciado:

    Pesquise na API Java os tipos de Exceção IllegalArgumentException e 
NumberFormatException. O que causa essas exceções? (escreva como comentário em 
seu código). Implemente um programa em Java que faça o tratamento dessas exceções

Resposta:

    Em IllegalArgument, a excecao ocorre quando um argumento de tipo errado eh 
passado a um metodo que esperava outro tipo, como calcula("dez"), quando se 
esperava um numero inteiro.
    O NumberFormat eh uma subclasse de IllegalArgument, porem trata especificamente
das excecoes envolvendo transformar strings em inteiros. O exemplo anterior 
tambem daria erro em NumberFormat, enquanto calcula("10") por exemplo seria
executado sem problemas.
*/
public class main_ex61 {
    
    //Soma 2 entradas de um array generico, podendo ser String ou Int
    static int calcula(ArrayList num){
        int resultado;
        if (num.get(0) instanceof String){//caso entrada string
            resultado=Integer.parseInt((String)num.get(0))+Integer.parseInt((String)num.get(1));
            return resultado;
        }//entradas inteiras
        resultado=(int)num.get(0)+(int)num.get(1);
        return resultado;
    }
    
    public static void main(String args[]){
        
        ArrayList testeInt=new ArrayList();
        testeInt.add(10);
        testeInt.add(10);
        
        ArrayList testeStr10=new ArrayList();
        testeStr10.add("10");
        testeStr10.add("10");
        
        ArrayList testeStrDez=new ArrayList();
        testeStrDez.add("dez");
        testeStrDez.add("dez");
        
        try{
        calcula(testeInt);
        System.out.print("Primeiro calculo feito\n");
        calcula(testeStrDez);
        System.out.print("Segundo calculo feito\n");
        }catch(IllegalArgumentException ex){
            System.out.print("Illegal Argument\n");
        }try{
        calcula(testeStr10);
        System.out.print("Terceiro calculo feito\n");
        calcula(testeStrDez);
        System.out.print("Quarto calculo feito\n");
        }catch(NumberFormatException ex2){
            System.out.print("Number Format\n");
        }catch(IllegalArgumentException ex){
            System.out.print("Illegal Argument\n");
        }
    }
}
