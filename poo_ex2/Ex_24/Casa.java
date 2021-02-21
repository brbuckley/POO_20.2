package poo_ex2.Ex_24;

import java.util.ArrayList;

public class Casa {
    
    String cor;
    ArrayList<Porta> portas = new ArrayList<Porta>();
    
    void pintar(String c){
        this.cor=c;
    }
    
    void abrirFecharPortas(int j){ //abre ou fecha a porta j
        portas.get(j-1).abrirFechar();
    }
    
    
    int quantasPortasEstaoAbertas(){
        int pA=0;
        
        for (int i=0;i<portas.size();i++){ //funciona para diferente numero de portas
            if(portas.get(i).estaAberta())pA++;
        }
        
        return pA;
    }
    
    void novaPorta(Porta p){
        Porta temp=new Porta();
        temp.setPorta(p.cor, p.altura, p.largura, p.estado);
        this.portas.add(temp);
    }
    
    void setCasa(String c, Porta p1, Porta p2, Porta p3){
        this.cor=c;
        if (p1!=null)this.portas.add(p1);//deixar o numero de portas opcional
        if (p2!=null)this.portas.add(p2);
        if (p3!=null)this.portas.add(p3);
    }
    
}
