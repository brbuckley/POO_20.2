package poo_ex4.Ex_44;

import java.lang.Math;

/*
 */
public class Circulo extends Geometrica{
        
    public Circulo(double base){
        super(base);
    }
    
    @Override
    void calculaArea(){
        this.setArea(this.getBase()*this.getBase()*Math.PI);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do circulo mede "+this.getArea()+" cm2\n");
    }
}
