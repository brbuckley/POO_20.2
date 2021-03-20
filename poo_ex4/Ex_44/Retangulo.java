package poo_ex4.Ex_44;

/*
 */
public class Retangulo extends Geometrica{
    
    private double altura;
    
    public Retangulo(double base, double altura){
        super(base);
        this.altura=altura;
                
    }
    
    @Override
    void calculaArea(){
        this.setArea(this.getBase()*this.altura);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do retangulo mede "+this.getArea()+" cm2\n");
    }
}
