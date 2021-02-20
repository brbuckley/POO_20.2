
package poo_ex2;

public class Agenda {
    Contato[] contatos= new Contato[20];
    
    int isfull(){
        if (contatos[19]==null)return 0;
        else return 1;
    }
}
