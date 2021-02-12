package poo_ex1;

/*ENUNCIADO

5- Escreva um programa recebe um valor N inteiro e que, se N for positivo,
retorna o fatorial de N (N!). Se não for possível calcular o fatorial,
a função deve imprimir uma mensagem e retornar o valor -1.
*/

//importes
import java.util.Scanner;

public class Exercicios_5 {
    
    public static int fat(int N){
        
        int n=N;
        
        if (N<0){System.out.print("Impossível calcular\n");return -1;}
        
        else{
            for(int i=1;i<N;i++){
                n=n*i;
            }        
            return n;
        }
    }
    
    public static void main(String[] args) {        

        int N;
        
        System.out.print("Informe N:");
        
        Scanner scanner = new Scanner(System.in);
        N=scanner.nextInt();
        
        N=fat(N);
        
        System.out.print("o fatorial é:"+N);
        
    }
}