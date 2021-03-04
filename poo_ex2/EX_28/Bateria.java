package poo_ex2.EX_28;

public class Bateria {
    
    private int u;
    private int nivelCarga;
    
    Bateria(){
        this.u=0;
        this.nivelCarga=0;
    }
    
    Bateria(int u,int n){
        this.u=u;
        this.nivelCarga=n;
    }
    
    boolean isEmpty(){
        if(this.getNivelCarga()==0)return true;
        else return false;
    }

    /**
     * @return the u
     */
    public int getU() {
        return u;
    }

    /**
     * @param u the u to set
     */
    public void setU(int u) {
        this.u = u;
    }

    /**
     * @return the nivelCarga
     */
    public int getNivelCarga() {
        return nivelCarga;
    }

    /**
     * @param nivelCarga the nivelCarga to set
     */
    public void setNivelCarga(int nivelCarga) {
        this.nivelCarga = nivelCarga;
    }
    
}
