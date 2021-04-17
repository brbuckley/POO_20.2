package poo_ex7.Ex_72;


/*Ideia:
    Tentei seguir os comandos da questao, apenas adicionei o metodo 'espera' em
CounterThread.
 */
public class CounterUser {
    
    public static void main(String args[]){
        
        Counter contador=new Counter();
        CounterThread thread1=new CounterThread(true,contador);
        CounterThread thread2=new CounterThread(false,contador);
        Thread t1=new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();
        t2.start();
        
    }
    
}
