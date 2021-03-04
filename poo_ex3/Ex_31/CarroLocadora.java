/*Enunciado:
1 - Para cada uma das situações a seguir, implemente a classe Carro. 
Obs: é suficiente colocar a assinatura dos métodos 
(eles não precisam ser implementados)

Sistema de uma locadora de carros
Sistema de uma revendedora de carros
Sistema de uma oficina mecânica
Sistema do DETRAN

 */
package poo_ex3.Ex_31;

/* Penso que existiria uma lista de carros, e talvez fosse conveniente guardar 
as informacoes sobre o aluguel dentro da propria classe Carro e a disponibilidade
de forma que um veiculo alugado nao sairia da lista
 */
public class CarroLocadora {
    
    String marca;
    String modelo;
    String placa;
    String cor;
    int ano;
    
    boolean disponivel;
    int diaria;
    int dataAluguel;
    int dataRetorno;
    
    boolean estaDisponivel(){return true;} //checa disponibilidade (retornei qualquer coisa para não dar erro)
    
    int alugar(int dataAluguel, int dataRetorno){return 1;}//aluga o veiculo por um tempo retorna o valor a cobrar
    
}
