package poo_ex1;

/*ENUNCIADO

2- Escreva um programa que efetue a leitura de três
valores reais R, S e T, imprimindo qual deles é o maior
*/

//importes
import java.util.Scanner;

public class Exercicios_2 {

    public static void main(String[] args) {        
        //variaveis
        float R,S,T,maior=0;
        char maiorC='R';

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe R");
        R=scanner.nextFloat();
        System.out.print("Informe S");
        S=scanner.nextFloat();
        System.out.print("Informe T");
        T=scanner.nextFloat();

        if(R>maior){maior=R;maiorC='R';}
        if(S>maior){maior=S;maiorC='S';}
        if(T>maior){maior=T;maiorC='T';}
        
        System.out.printf("%c teve o maior valor digitado : %.2f \n",maiorC,maior);
        
    }
}