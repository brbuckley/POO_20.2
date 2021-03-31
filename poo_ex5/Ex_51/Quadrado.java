package poo_ex5.Ex_51;

/*
 */
public class Quadrado extends Retangulo{
    
    public Quadrado(float lado){
        super(lado);
    }
    
    @Override
    void calcularArea(){
        this.setArea(this.getLado()*this.getLado());
    }
    
    @Override
    void calcularPerimetro(){
        this.setPerimetro(this.getLado()*4);
    }
    
    public void imprimir(){
        System.out.print("A area do quadrado mede "+this.getArea()+" cm2 "+
                "e o perimetro mede "+this.getPerimetro()+" cm2\n");
    }
    
}
