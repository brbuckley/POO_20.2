package poo_ex2.EX_22;


class Pessoa {
    private String nome;
    private int idade;
    
    Pessoa(String nome, int idade){
        this.nome=nome;
        this.idade=idade;
    }
    
    void aniversario(){
        this.idade++;
    }
    
    void apresentar(){
        System.out.print("Oi, eu sou "+this.nome+", tenho "+this.idade+" anos.\n");
    }
}