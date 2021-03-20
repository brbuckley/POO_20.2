package poo_ex4.Ex_47;

/*Enunciado
7- Crie uma enumeração DiaDaSemana com sete valores entre DOMINGO e SABADO. 
Adicione um método ehDiaUtil() à classe DiaDaSemana que retorna true se o valor 
em que for chamado estiver entre SEGUNDA e SEXTA e false, caso contrário.

 */

import java.lang.Enum;

public class main_ex47 {
    
    public static void main(String[]args){
        
        DiaDaSemana hoje= DiaDaSemana.SEXTA;
        DiaDaSemana amanha= DiaDaSemana.SABADO;
        
        DiaDaSemana.imprime(hoje);
        System.out.print("\nPassou um dia ... \n\n");
        DiaDaSemana.imprime(amanha);
        
    }
    
}
