package poo_ex1;

/*ENUNCIADO

4- Imprima todos os múltiplos de 3, entre 1 e 100
*/

//importes


public class Exercicios_4 {

    public static void main(String[] args) {        
    
        for(int i=1;i<100;i++){
            if(i%3==0)System.out.print(i+"\n");
        }
    }
}