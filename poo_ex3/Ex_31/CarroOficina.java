package poo_ex3.Ex_31;

import java.util.ArrayList;

/* Aqui vi a necessidade de uma classe Defeito e Peca, e o carro teria uma lista 
de defeitos que poderiam ser consertados ou descobertos por um mecanico e pecas 
a serem trocadas.
 */
public class CarroOficina {
    
    String marca;
    String modelo;
    String placa;
    String cor;
    int ano;
    
    ArrayList <Peca> pecas = new ArrayList <Peca>(); 
    ArrayList <Defeito> defeitos = new ArrayList <Defeito>(); 
    int cobranca=0; //inicializado por 0 para ser iterado depois
    int dataChegada;
    int dataSaida;
    
    boolean temDefeito(){return true;} //checa se o carro tem defeito, pode ser usada para devolver o carro ao dono
    
    void comDefeito(Defeito defeito){} //adiciona algum defeito na lista e itera a cobranca
    
    int consertar(Defeito defeito){return 0;} //remove algum defeito, reduz a cobranca e retorna o valor a pagar
    
    void trocarPeca(Peca peca){} //adiciona uma peca nova ao carro e itera a cobranca 
    
}
