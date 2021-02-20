
package poo_ex2;

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
            scantemp = scanner.nextLine();
            
            if (scantemp.contains("0"))break;//condição de parada do loop
            
            stringtemp=scantemp.split(" ");//criando cada contato
            contatotemp.nome=stringtemp[0];
            contatotemp.telcel=Integer.parseInt(stringtemp[1]);
            contatotemp.telfix=Integer.parseInt(stringtemp[2]);
            agenda.contatos[(i-1)]=contatotemp;
            
        }
        System.out.print(agenda.contatos[0].nome+agenda.contatos[0].telcel+agenda.contatos[0].telfix+"\n\n"
                +agenda.contatos[1].nome+agenda.contatos[1].telcel+agenda.contatos[1].telfix+"\n\n");
    }
}
