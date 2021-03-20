package poo_ex4.Ex_44;

/*
 */
public class Quadrado extends Geometrica{
    
    public Quadrado(double base){
        super(base);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A area do quadrado mede "+this.getArea()+" cm2\n");
    }
    
}
