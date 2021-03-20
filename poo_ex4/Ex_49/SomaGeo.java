package poo_ex4.Ex_49;

import java.util.ArrayList;
import poo_ex4.Ex_44.Geometrica;

/*Enunciado
Defina uma classe que contenha um método genérico capaz de efetuar a soma das 
área de arrays contendo apenas objetos dos tipos apresentados na figura abaixo
 */
public class SomaGeo {
    
    double contador=0;
    ArrayList<Geometrica> lista = new ArrayList<Geometrica>();
    
    public void adicionar(Geometrica novo){
        this.lista.add(novo);
        novo.calculaArea();
    }
    
    public double somar(){
        for(Geometrica temp:this.lista) {
            contador+= temp.getArea();
        }
        return contador;
    }
    
    public double imprimir(){
        for(Geometrica temp:this.lista) {
            temp.imprimir();
        }
        return contador;
    }
    
}
