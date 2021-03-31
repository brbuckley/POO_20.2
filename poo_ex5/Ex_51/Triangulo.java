package poo_ex5.Ex_51;

import java.lang.Math;

/*
 */
public class Triangulo extends FormaGeometrica{
    
    private float base;
    private float altura;
    
    public Triangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    
    @Override
    void calcularArea(){
        this.setArea((this.base*this.altura)/2);
    }
    
    @Override
    void calcularPerimetro(){
        this.setPerimetro(this.base+this.altura+((float)Math.sqrt((double)(this.base*this.base+this.altura*this.altura))));
    }
    
    public void imprimir(){
        System.out.print("A area do triangulo mede "+this.getArea()+" cm2 "+
                "e o perimetro mede "+this.getPerimetro()+" cm2\n");
    }
    
}
