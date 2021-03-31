package poo_ex5.Ex_51;

import java.lang.Math;

/*
 */
public class Circulo extends FormaGeometrica{
    
    private float raio;
    
    public Circulo(float raio){
        this.raio=raio;
    }
    
    @Override
    void calcularArea(){
        this.setArea(this.raio*this.raio*(float)Math.PI);
    }
    
    @Override
    void calcularPerimetro(){
        this.setPerimetro(this.raio*2*(float)Math.PI);
    }
    
    public void imprimir(){
        System.out.print("A area do circulo mede "+this.getArea()+" cm2 "+
                "e o perimetro mede "+this.getPerimetro()+" cm2\n");
    }

}
