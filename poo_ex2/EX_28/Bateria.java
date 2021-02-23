package poo_ex2.EX_28;

public class Bateria {
    
    int u;
    int nivelCarga;
    
    void setBateria(int u,int n){
        this.u=u;
        this.nivelCarga=n;
    }
    
    boolean isEmpty(){
        if(this.nivelCarga==0)return true;
        else return false;
    }
    
}
