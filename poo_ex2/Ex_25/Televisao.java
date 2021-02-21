package poo_ex2.Ex_25;

//Crie métodos para ligar/desligar a televisão, mudar o canal (canal
//específico, canal anterior, próximo canal) e silenciar a televisão

public class Televisao {
    boolean estado;
    int volume;
    int canal;
    boolean silencioso;
    
    void setTv(boolean e, int v, int c, boolean s){
        this.canal=c;
        this.estado=e;
        this.silencioso=s;
        this.volume=v;
    }
    
    void ligarDesligar(){
        this.estado= !this.estado;
    }
    
    boolean estaLigado(){
        return this.estado;
    }
    
    void silenciar(){
        this.silencioso=!this.silencioso;
    }
    
    void mudarCanal(int n){
        if(n<100& n>=0)this.canal=n;
        else System.out.print("Erro\n");
    }
    
    void aumentarCanal(){
        if(this.canal<99)this.canal++;
        else System.out.print("Erro\n");
    }
    
    void diminuirCanal(){
        if(this.canal>0)this.canal--;
        else System.out.print("Erro\n");
    }
    
    void aumentarVolume(){ //aumenta o volume e tira o silencioso
        if(this.volume<10){
            this.volume++;
            this.silencioso=false;
        }
        else System.out.print("Erro\n");
    }
    
    void diminuirVolume(){ //diminui o volume caso nao esteja silencioso
        if(this.volume>0 & this.silencioso==false)this.volume--;
        else System.out.print("Erro\n");
    }
    
    void imprimir(){
        System.out.print("A TV está ");
        if(this.estaLigado())System.out.print("Ligada ");
        else {System.out.print("Desligada\n"); return;}
        System.out.print("no canal "+this.canal+" no volume "+this.volume);
        if(this.silencioso)System.out.print(" está modo Silencioso.\n");
        else System.out.print(" não está no Silencioso.\n");
    }
    
}
