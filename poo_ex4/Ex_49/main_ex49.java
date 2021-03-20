package poo_ex4.Ex_49;

import poo_ex4.Ex_44.Circulo;
import poo_ex4.Ex_44.Quadrado;
import poo_ex4.Ex_44.Retangulo;
import poo_ex4.Ex_44.Triangulo;

/*Reaproveitei as classes do exercicio 44
 */
public class main_ex49 {
    
    public static void main(String[]args){
        
        SomaGeo soma=new SomaGeo();
        
        Circulo objeto1=new Circulo(3.0);
        Quadrado objeto2=new Quadrado(2.0);
        Retangulo objeto3=new Retangulo(4.0,2.0);
        Triangulo objeto4=new Triangulo(3.0,1.5);
        
        soma.adicionar(objeto1);
        soma.adicionar(objeto2);
        soma.adicionar(objeto3);
        soma.adicionar(objeto4);
        
        soma.imprimir();
        
        System.out.print("\nA soma das areas eh: "+soma.somar());
    }
}