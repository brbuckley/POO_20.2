package poo_ex2.Ex_24;

import java.util.ArrayList;

public class Casa {
    
    private String cor;
    private ArrayList<Porta> portas = new ArrayList<Porta>();
    
    void pintar(String c){
        this.cor=c;
    }
    
    String getCor(){
        return this.cor;
    }
    
    void abrirFecharPortas(int j){ //abre ou fecha a porta j ( comecando do 1 e nao do 0 )
        portas.get(j-1).abrirFechar();
    }
    
    
    int quantasPortasEstaoAbertas(){
        int pA=0;
        
        for (int i=0;i<portas.size();i++){ //funciona para diferente numero de portas
            if(portas.get(i).estaAberta())pA++;
        }
        
        return pA;
    }
    
    boolean temPortas(){
        if (this.portas.isEmpty())return false;
        else return true;
    }
    
    void novaPorta(Porta p){
        Porta temp=new Porta();
        temp.setPorta(p.getCor(), p.getAltura(), p.getLargura(), p.isEstado());
        this.portas.add(temp);
    }
    
    void setCasa(String c, Porta p1, Porta p2, Porta p3){
        this.cor=c;
        if (p1!=null)this.portas.add(p1);//deixar o numero de portas opcional
        if (p2!=null)this.portas.add(p2);
        if (p3!=null)this.portas.add(p3);
    }
    
    void imprimir(){
        System.out.print("\n");
        System.out.print("Numa casa da cor :"+this.cor+"\n"); // imprime a casa e as portas
        for(int i=0;i<this.portas.size();i++){
            this.portas.get(i).imprimir();
        }
        System.out.print("\n");
    }
}
