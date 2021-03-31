package poo_ex5.Ex_51;

/*
 */
public class Retangulo extends FormaGeometrica{
    
    private float lado1;
    private float lado2;
    
    public Retangulo(Float lado){
        this.lado1=lado;
        this.lado2=lado;
    }
    
    public Retangulo(float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }
    
    public float getLado(){
        return this.lado1;
    }
    
    @Override
    void calcularArea(){
        this.setArea(this.lado1*this.lado2);
    }
    
    @Override
    void calcularPerimetro(){
        this.setPerimetro(this.lado1*2+this.lado2*2);
    }
    
    public void imprimir(){
        System.out.print("A area do quadrado mede "+this.getArea()+" cm2 "+
                "e o perimetro mede "+this.getPerimetro()+" cm2\n");
    }
}
