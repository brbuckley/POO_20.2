package poo_ex4.Ex_44;

/*
 */
public class Triangulo extends Geometrica{
    
    private double altura;
    
    public Triangulo(double base, double altura){
        super(base);
        this.altura=altura;
                
    }
    
    @Override
    void calculaArea(){
        this.setArea((this.getBase()*this.altura)/2);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do triangulo mede "+this.getArea()+" cm2\n");
    }
    
}
