package poo_ex3.Ex_31;

/* Nao consegui pensar em muitos metodos para a classe Carro aqui. Vistoria por 
exemplo pode ser usada como atributo para checagem se foi feita ou nao. Mas nao
vejo como implementar uma vistoria dentro dessa classe.
 */
public class CarroDetran {
    
    String marca;
    String modelo;
    String placa;
    String cor;
    int ano;
    
    boolean vistoria;
    String municipio;
    Proprietario proprietario;
    
    int mudarProprietario(Proprietario p){return 100;}//muda de proprietario e retorna a taxa a pagar
    
}
