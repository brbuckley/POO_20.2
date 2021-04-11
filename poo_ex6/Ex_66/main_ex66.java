package poo_ex6.Ex_66;

/*Enunciado
    Implemente uma programa de Karaokê. A máquina de Karaokê contém um conjunto 
com todas as músicas disponíveis e usuários poderão consultar essa lista 
ordenada ou pelo nome da música ou pelo nome do artista. Esse programa também 
conterá um conjunto com as músicas que estão na fila para serem cantadas. 
O programa receberá a música e colocará no final de uma fila. A máquina de 
Karaokê toca apenas uma música de cada vez e segue a ordem de inserção na fila 
e, entre as músicas da fila, será tocada a que foi inserida primeiro. Ao final 
da música esta é removida da fila e a próxima é tocada.
 */

/*Ideia:
    Classe karaoke guarda uma lista de Musicas que eu ja defini no construtor, 
e uma Fila para musicas que devem ser tocadas. A maioria dos metodos sao 
implementados em karaoke, tentei ao maximo usar as funcoes ja existentes nas 
classes ArrayList e LinkedList. Foi necessario Criar Comparadores para a 
funcao sort().
*/
public class main_ex66 {
    
    public static void main(String args[]){
        
        Karaoke karaoke=new Karaoke();
        karaoke.imprimirTodas();
        karaoke.imprimirFila();
        
        System.out.print("- - - - - - Ordenando por Titulo - - - - - -\n");
        karaoke.ordemTitulo();
        karaoke.imprimirTodas();
        
        System.out.print("- - - - - - Ordenando por Artista - - - - - -\n");
        karaoke.ordemArtista();
        karaoke.imprimirTodas();
        
        System.out.print("- - - - - - Fila - - - - - -\n");
        karaoke.colocarNaFila("Dissident Aggressor");
        karaoke.colocarNaFila("Stargazer");
        karaoke.colocarNaFila("Cirice");
        karaoke.imprimirFila();
        
        System.out.print("- - - Tocando a Musica : "+karaoke.tocando.getFirst().imprimir()+" - - -\n");
        karaoke.tocarMusica();
        karaoke.imprimirFila();
        System.out.print("- - - Tocando a Musica : "+karaoke.tocando.getFirst().imprimir()+" - - -\n");
        karaoke.tocarMusica();
        karaoke.imprimirFila();
        System.out.print("- - - Tocando a Musica : "+karaoke.tocando.getFirst().imprimir()+" - - -\n");
        karaoke.tocarMusica();
        karaoke.imprimirFila();
        
    }
    
}
