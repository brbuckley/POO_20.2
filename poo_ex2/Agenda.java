
package poo_ex2;

public class Agenda {
    Contato[] contatos= new Contato[20];
    
    void adicionar(Contato temp,int i){ //adiciona o contato a posição desejada
        Contato contato= new Contato();
        contato.nome=temp.nome;
        contato.telcel=temp.telcel;
        contato.telfix=temp.telfix;
        contatos[i]=contato;
    }
    
    void imprimir(){
        int i=0;
        System.out.print("\nAgenda : \n");
        while(contatos[i]!=null){
            System.out.print("Nome "+contatos[i].nome+" Tel. cel. "+contatos[i].telcel+" Tel. fixo "+contatos[i].telfix+"\n");
            i++;
        }
    }
    
    int isfull(){
        if (contatos[19]==null)return 0;
        else return 1;
    }
}
