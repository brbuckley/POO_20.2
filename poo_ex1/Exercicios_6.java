package poo_ex1;

/*ENUNCIADO

6- Imprima os primeiros números da série de Fibonacci até passar de 100.
A série de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc...
Para calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante,
o n-ésimo elemento vale o (n-1)-ésimo elemento somado ao
(n-2)-ésimo elemento (ex: 8 = 5 + 3)
*/

//importes

public class Exercicios_6 {
    
    public static int fibo(int n){
        
        if (n == 1 || n == 0)
        {
            return 1;
        }
        else {

            return fibo(n - 1) + fibo(n - 2);//recursão 

        }
        
    }
    
    public static void main(String[] args) {        

        int N=0,i=-1;
     
        System.out.print("0\n");
        while(N<100){
        i++;
        N=fibo(i);
        System.out.print(N+"\n");
        }
    }
}