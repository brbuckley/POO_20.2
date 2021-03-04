package poo_ex2.Ex_25;

import java.util.Scanner;

/*Enunciado
 5- Escreva uma classe Televisao sabendo que o estado de uma televisão se
caracteriza por estar ligada ou desligada, pelo volume (que está entre 0 e 10),
pelo canal (que está entre 0 e 99) e pelo fato de estar em modo silencioso ou
não. Crie métodos para ligar/desligar a televisão, mudar o canal (canal
específico, canal anterior, próximo canal) e silenciar a televisão. Instancie
um objeto dessa classe, utilize seus métodos para mudar de canal, ligar e
desligar a TV, silenciar ou dessilenciar a TV e, por último, imprima o
estado da TV.
 */

/* A ideia foi criar um menu com botoes para simular um controle.
*/

public class Main_ex5 {
    
    public static void main(String[] args) {
        
        Televisao tv=new Televisao(false, 5, 0, false);
        
        boolean controle=true;
        int entrada;
        
        Scanner scanner=new Scanner(System.in);
        
        
        while(controle){
            
            System.out.print("Controle:\n\n"
                    + " 1- Ligar/Desligar TV\n"
                    + " 2- Aumentar Canal\n"
                    + " 3- Diminuir Canal\n"
                    + " 4- Escolher Canal\n"
                    + " 5- Aumentar Volume\n"
                    + " 6- Diminuir Volume\n"
                    + " 7- Silenciar/Nao-silenciar\n\n");
            
            tv.imprimir();
            
            entrada=scanner.nextInt(); //usuario menu
            
            switch(entrada){
                case 1:
                    if(tv.estaLigado()){ //liga caso desligado, ou desliga e fecha o loop while
                        controle=false;
                        System.out.print("Desligando\n");
                    }
                    else tv.ligarDesligar();
                    break;
                case 2:
                    tv.aumentarCanal();
                    break;
                case 3:
                    tv.diminuirCanal();
                    break;
                case 4:
                    System.out.print("Informe o canal que deseja assistir:\n");
                    tv.mudarCanal(scanner.nextInt());
                    break;
                case 5:
                    tv.aumentarVolume();
                    break;
                case 6:
                    tv.diminuirVolume();
                    break;
                case 7:
                    tv.silenciar();
                    break;
            }
        }
        
    }
}
