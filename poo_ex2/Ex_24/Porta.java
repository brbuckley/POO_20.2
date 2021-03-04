package poo_ex2.Ex_24;

import poo_ex2.EX_23.*;

public class Porta {
    private String cor;
    private double altura;
    private double largura;
    private boolean estado;
    
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
        if (this.isEstado())this.estado=false;
        else this.estado=true;
    }
    
    boolean estaAberta (){
        return this.isEstado();
    }
    
    void imprimir(){
        System.out.print("A porta "+this.getCor()+" mede "+this.getAltura()+" por "+this.getLargura()+"\n");
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @return the largura
     */
    public double getLargura() {
        return largura;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }
}