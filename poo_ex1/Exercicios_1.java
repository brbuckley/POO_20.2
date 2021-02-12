package poo_ex1;

/*ENUNCIADO

1- Escreva um programa que recebe como parâmetro um número inteiro n.
A função deve ler n valores do teclado e retornar quantos destes valores são negativos.
*/

//importes
import java.util.Scanner;

public class Exercicios_1 {

    public static void main(String[] args) {        
        //variaveis
        int temp,cont = 0;

        System.out.print("Quantos números a serem lidos?");

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i=0;i<n;i++){
            System.out.print("Informe o "+(i+1)+"º número:");
            temp=scanner.nextInt();
            if (temp<0){cont=cont+1;}
        }
        
        System.out.print(cont+" número(s) negativos foram digitados");
        
    }
}