package poo_ex1;

/*ENUNCIADO

3- Imprima a soma de 1 até 999
*/

//importes


public class Exercicios_3 {

    public static void main(String[] args) {        
        
        //variaveis
        int soma=1;
        
        for(int i=2;soma<=999;i++){
            System.out.print(soma+"\n");
            soma=soma+i;
        }
    }
}