package poo_ex2.Ex_24;

import poo_ex2.EX_23.*;

public class Porta {
    String cor;
    double altura;
    double largura;
    boolean estado;
    
    void setPorta(String c, double a, double l, boolean e){
        this.cor=c;
        this.altura=a;
        this.estado=e;
        this.largura=l;
    }
    
    void pintar(String c){
        this.cor=c;
    }
    
    void abrirFechar(){
        if (this.estado)this.estado=false;
        else this.estado=true;
    }
    
    boolean estaAberta (){
        return this.estado;
    }
    
    void imprimir(){
        System.out.print("A porta "+this.cor+" mede "+this.altura+" por "+this.largura+"\n");
    }
}