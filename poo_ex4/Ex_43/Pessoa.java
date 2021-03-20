package poo_ex4.Ex_43;

/*Enunciado 
3- Faça um programa para representar a árvore genealógica de uma família. Para 
tal, crie uma classe Pessoa que permita indicar, além de nome e idade, o pai e 
a mãe. Tenha em mente que pai e mãe também são do tipo Pessoa. 
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;
    
    public Pessoa(String nome, int idade, Pessoa pai, Pessoa mae){
        this.nome=nome;
        this.idade=idade;
        this.pai=pai;
        this.mae=mae;
    }
    
    public Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    
    /*
    Essa funcao recebe um grau de parentesco e imprime apenas os parentes 
    daquele grau, onde 1 significa voce mesmo e 2 seus pais por exemplo.
    Usei recursao porem nao consegui implementar um break eficiente, de forma
    que toda a arvore eh checada nao importando o grau desejado.
    */
    public void imprimir(int grau){
        if(grau==1) System.out.print(this.nome+", "+this.idade+" ");
        if (this.pai!= null) this.pai.imprimir(grau-1);
        if(this.mae!=null) this.mae.imprimir(grau-1);
    }
    
}
