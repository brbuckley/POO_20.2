package poo_ex4.Ex_44;

/*Enunciado
4- Faça um programa que calcule a área de uma figura geométrica. Aceite quatro 
tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. Use 
herança e polimorfismo. 
 */
public class main_ex44 {
    
    public static void main(String[]args){
        
        //criando variaveis
        Circulo circulo=new Circulo(1.5);
        Quadrado quadrado=new Quadrado(3.0);
        Retangulo retangulo=new Retangulo(3.0,2.0);
        Triangulo triangulo=new Triangulo(4.0,2.0);
        
        circulo.calculaArea();
        circulo.imprimir();
        
        quadrado.calculaArea();
        quadrado.imprimir();
        
        retangulo.calculaArea();
        retangulo.imprimir();
        
        triangulo.calculaArea();
        triangulo.imprimir();
        
        
    }
    
}
