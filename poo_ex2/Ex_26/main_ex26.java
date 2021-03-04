package poo_ex2.Ex_26;

/*Enunciado
6- Para implementar jogos com cartas, são necessárias classes para representar 
uma carta individual e também um baralho. Sugira implementações para essas 
classes, considerando:
Cartas - ás, 2 a 9, valete, dama e rei, dos naipes copas, espadas, ouros e paus
Baralho - conjunto de 52 cartas (13 cartas de cada naipe), em ordem ou embaralhado
 */

public class main_ex26 {
    
    public static void main(String[] args) {
        
        Baralho baralho = new Baralho();
        baralho.setBaralho(); // cria um baralho ordenado
        
        System.out.print("\n\n");
        baralho.imprimirBaralho();
        
        System.out.print("\nEmbaralhando ...\n");
        baralho.embaralhar();
        
        System.out.print("\n\n");
        baralho.imprimirBaralho();
        
        System.out.print("\nOrdenando ...\n");
        baralho.ordenar();
        
        System.out.print("\n\n");
        baralho.imprimirBaralho();
        
    }
    
}
