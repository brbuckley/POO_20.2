package poo_ex2.EX_28;

import java.util.ArrayList;

/*Ideia:
Criar uma lista com referencias para todos os celulares, e ao fazer uma ligação 
checar se o celular existe, sem a necessidade de passar outro celular como
parametro, alem de reduzir a bateria de ambos em uma ligação.
*/
public class Rede {
    
    ArrayList<Celular> celulares= new ArrayList<Celular>(); //guardar ponteiros de celulares
    
    void adicionarCelular(Celular cel){//adicionar uma referencia de um celular a rede
        celulares.add(cel);
    }
    
    int indexNumero(int num){ //recebe numero de telefone e retorna indice na lista
        for(int i=0;i<this.celulares.size();i++){
            if( this.celulares.get(i).numero==num ) return i;
        }
        return -1;
    }
}
