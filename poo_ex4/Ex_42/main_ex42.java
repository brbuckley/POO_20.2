package poo_ex4.Ex_42;

import static poo_ex4.Ex_41.ConversaoDeUnidadesDeArea.*;

/*Enunciado
2- A área de um campo de futebol é de 8.250 metros quadrados. Usando a classe 
ConversaoDeUnidadesDeArea, escreva um programa em Java que mostre qual é a área 
de um campo de futebol em pés quadrados, acres e centímetros quadrados. Escreva 
métodos adicionais para a classe  ConversaoDeUnidadesDeArea, se necessário.
 */
public class main_ex42 {
    
    public static void main (String[]args){
        
        double area=8250;

        System.out.printf("%.3f pes quadrados.\n%.3f acres.\n%.3f centimetros quadrados.\n",
                metroToPe(area),milhaToAcre(metroToMilha(area)),metroToCm(area));
    }
}
