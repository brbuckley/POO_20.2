package poo_ex2.Ex_21;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    
    public int getSize(){
        return this.contatos.size();
    }
    
    void adicionar(Contato temp){ //adiciona o contato a proxima posição
        Contato contato= new Contato(temp.getNome(),temp.getTelcel(),temp.getTelfix());
        contatos.add(contato);
    }
    
    void imprimir(){
        System.out.println("\nAgenda :");
        
        for(Contato x : contatos){
            x.imprimir();
        }
    }
}
