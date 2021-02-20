package poo_ex2;

import java.util.ArrayList;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    void adicionar(Contato temp){ //adiciona o contato a proxima posição
        Contato contato= new Contato();
        contato.setContato(temp.nome, temp.telcel, temp.telfix);
        contatos.add(contato);
    }
    
    void imprimir(){
        System.out.println("\nAgenda :");
        
        for(Contato x : contatos){
            System.out.println("Nome "+x.nome+" Tel. cel. "+x.telcel+" Tel. fixo "+x.telfix);
        }
    }
}
