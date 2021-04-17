package poo_ex7.Ex_71;

/* Enunciado:
Faça um programa que leia um número “n” informado pelo usuário e diga quantos 
números primos há entre 0 e “n”. Esse seu programa deve rodar em duas threads, 
de forma que o esforço computacional seja dividido entre as threads.
 */

/*Ideia:
    Uma thread vai checar os primos de 0 ate N/2 e a outra vai checar os primos
de N ate N/2, dividindo o trabalho.

Outra ideia:
    "all prime numbers larger than 5 end in 1, 3, 7, or 9" Pensei tambem em
fazer uma funcao testar os numeros de fim 1 e 3 enquanto a outra testa 7 e 9.
Parece mais otimizado, mas fiquei com a primeira ideia por ser mais simples.
*/
public class main_ex71 {
    
    public static void main( String args[]){
        
        int n=100; //numero a checar
        
        ThreadPrimo thread1=new ThreadPrimo(n,0); //0 a N/2
        ThreadPrimo thread2=new ThreadPrimo(n,1);//N a N/2
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();
        t2.start();
        
        try{//precisei dessas operacoes para printar na hora certa
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            System.out.println("ERRO");
        }
        
        n=(thread1.getSaida()+thread2.getSaida());//soma os resultados
        
        System.out.print(n);
    }
    
}
