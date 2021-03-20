package poo_ex4.Ex_45;

import java.util.ArrayList;

/*
 */
public class Agenda {
    
    private ArrayList<Contato> contatos=new ArrayList<Contato>();
    
    void adicionarContato(Contato contato){
        contatos.add(contato);
    }
    
    int indexOf(String busca){
        int cont=0;
        for(Contato temp : contatos){
            if (temp instanceof Fisica){
                if(((Fisica) temp).getCpf()==busca)
                return cont; 
            }
            else if (temp instanceof Juridica){
                if(((Juridica)temp).getCnpj()==busca)
                return cont; 
            }
            cont++;
        }
        return -1;
    }
    
    Contato getContato(int indice){
        return contatos.get(indice);
    }
    
    Contato getContato(String indice){
        Contato erro=new Contato();
        if(this.indexOf(indice)==-1){
            System.out.print("ERRO\n");
            return erro;
        }
        return contatos.get(this.indexOf(indice));
    }
    
    void imprimir(){
        for(Contato temp : contatos){
            if (temp instanceof Fisica){
                System.out.print("Pessoa Fisica:");
            }
            else if (temp instanceof Juridica){
                System.out.print("Pessoa Juridica:");
            }
            temp.imprimir();
        }
    }
    
}
