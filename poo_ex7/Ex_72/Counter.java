package poo_ex7.Ex_72;

/*
 */
public class Counter {
    
    private int count=0;
    
    synchronized void increment(){
        while(true){
            if(this.count<3){this.count++;System.out.print("++ Incrementei ++\n"+this.count+"\n");return;}
            try {
                System.out.print("To esperando\n");
                this.notify();
                this.wait((int)(500*Math.random()));
            } catch (InterruptedException ex) {
                System.out.print("ERRO\n");
            }
        }
    }
    
    synchronized void decrement(){
        while(true){
            if(this.count>0){this.count--;System.out.print("-- Decrementei --\n"+this.count+"\n");return;}
            try {
                System.out.print("To esperando\n");
                this.notify();
                this.wait((int)(500*Math.random()));
            } catch (InterruptedException ex) {
                System.out.print("ERRO\n");
            }
        }
    }
    
}
