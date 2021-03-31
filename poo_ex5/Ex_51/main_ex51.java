package poo_ex5.Ex_51;

/*Tentei reimplementar o mais proximo possivel do exercicio 44, mas dessa vez 
usando classe abstrata.
 */
public class main_ex51 {
    
    public static void main(String[]args){
        
        //criando variaveis
        Circulo circulo=new Circulo((float)1.5);
        Quadrado quadrado=new Quadrado((float)3.0);
        Retangulo retangulo=new Retangulo((float)3.0,(float)2.0);
        Triangulo triangulo=new Triangulo((float)4.0,(float)3.0);
        
        circulo.calcularArea();
        circulo.calcularPerimetro();
        circulo.imprimir();
        
        quadrado.calcularArea();
        quadrado.calcularPerimetro();
        quadrado.imprimir();
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.imprimir();
        
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        triangulo.imprimir();
        
    }
}
