package poo_ex7.Ex_72;


/*Ideia:
    Tive que criar o metodo espera para que fosse synchronized. Pois entendi que
deveria haver uma espera a cada increment, assim como dentro de increment caso
fosse 3 ou 0.
 */
public class CounterThread implements Runnable{

    boolean incrementa=true;
    Counter contador;
    
    public CounterThread(boolean inc,Counter cont){
        this.incrementa=inc;
        this.contador=cont;
    }
    
    @Override
    public void run() {
        if(incrementa){
            for(int i=0;i<20;i++){
                contador.increment();
                this.espera();
            }
        }else{
            for(int i=0;i<20;i++){
                contador.decrement();
                this.espera();
            }
        }
    }
    
    synchronized void espera(){
        try {
            System.out.print("To esperando\n");
            this.wait((int)(500*Math.random()));
        } catch (InterruptedException ex) {
            System.out.print("ERRO\n");
        }
    }
}
