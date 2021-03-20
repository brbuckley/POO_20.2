package poo_ex4.Ex_41;

/*Enunciado
1- Escreva a classe ConversaoDeUnidadesDeArea com métodos estáticos para 
conversão das unidades de área segundo a lista abaixo.

1 metro quadrado = 10.76 pés quadrados
1 pé quadrado = 929 centímetros quadrados
1 milha quadrada = 640 acres
1 acre = 43.560 pés quadrados 
*/

public class ConversaoDeUnidadesDeArea {
    
    public static double metroToPe(double u){
        return u*10.76;
    }
    
    public static double peToCm(double u){
        return u*929;
    }
    
    public static double milhaToAcre(double u){
        return u*640;
    }
    
    public static double acreToPe(double u){
        return u*43560;
    }
    
    //adicoes do exercicio 2
    //ja que sao medidas quadradas, multiplico duas vezes para facilitar
    public static double metroToMilha(double u){
        return u*0.000621371*0.000621371;
    }
    
    public static double metroToCm(double u){
        return u*100*100;
    }
    
}
