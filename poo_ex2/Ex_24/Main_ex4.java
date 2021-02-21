package poo_ex2.Ex_24;

import static java.lang.Double.parseDouble;
import java.util.Scanner;

/* Enunciado
1- Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; abra e feche
as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas para imprimir
o número de portas abertas.
*/


public class Main_ex4 {
    
    public static void main(String[] args) {
        
        Casa casa=new Casa();
        Scanner scanner= new Scanner(System.in);
        
        Porta porta=new Porta();
        String stringtemp;
        
        boolean bool;
        
        System.out.print("Qual a cor da casa?");
        stringtemp=scanner.nextLine();
        String[] splittemp;
        
        casa.pintar(stringtemp);
        
        for(int i=0;i<3;i++){
        System.out.print("Para adicionar uma porta informe a cor, seguida da altura, largura e se está aberta 'sim' ou 'nao'.");
        
        stringtemp=scanner.nextLine();
        if (stringtemp.isEmpty()) break;//condicao de parada
        
        splittemp=stringtemp.split(" ");
        if(splittemp[3].equals("sim"))bool=true;//convertendo string para bool
        else bool=false;
        
        porta.setPorta(splittemp[0], Double.parseDouble(splittemp[1]), Double.parseDouble(splittemp[2]), bool);
        casa.novaPorta(porta);
        }
        
        System.out.print("Numa casa da cor :"+casa.cor+"\n"); // imprime a casa e as portas
        for(int i=0;i<casa.portas.size();i++){
            casa.portas.get(i).imprimir();
        }
        
        int n=casa.quantasPortasEstaoAbertas();
        System.out.print(n+" porta(s) abertas\n");
        
        if (casa.portas.isEmpty()==false)casa.abrirFecharPortas(1); //abrindo ou fechando a primeira porta
        
        n=casa.quantasPortasEstaoAbertas();
        System.out.print(n+" porta(s) abertas\n");
        
        casa.pintar("Verde"); // pinta a casa
        
        System.out.print("Numa casa da cor "+casa.cor);
        for(int i=0;i<casa.portas.size();i++){
            casa.portas.get(i).imprimir();
        }
        
    }
    
}