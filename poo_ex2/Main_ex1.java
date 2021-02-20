
package poo_ex2;

/*ENUNCIADO

1- Faça um programa de agenda telefônica, com as classes Agenda e Contato

*/

//importes
import java.util.Scanner;

public class Main_ex1 {
    
    public static void main(String[] args) {

        Agenda agenda= new Agenda();
        Contato contatotemp= new Contato();

        Scanner scanner = new Scanner(System.in);
        String scantemp;
        String[] stringtemp=new String[3];

        for(int i=1;i<=20;i++){

            System.out.print("Informe o nome, seguido do telefone celular e tel. fixo do contato "+i+"\n");
            scantemp = scanner.nextLine(); // exemplo de entrada "Joel 987654321 23456789" ou "Ana 22222222" 
            
            if (scantemp.contains("-1"))break;//condição de parada do loop
            
            stringtemp=scantemp.split(" ");//criando cada contato
            contatotemp.nome=stringtemp[0];
            contatotemp.telcel=Integer.parseInt(stringtemp[1]);
            if (stringtemp.length!=2)contatotemp.telfix=Integer.parseInt(stringtemp[2]);//telefone fixo como opcional
            else contatotemp.telfix=0;
            agenda.adicionar(contatotemp, (i-1));
            
        }
        
        agenda.imprimir();
    }
}
