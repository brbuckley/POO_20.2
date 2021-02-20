package poo_ex2.EX_22;


class Pessoa {
    String nome;
    int idade;
    
    void setPessoa(String n, int i){
        this.nome=n;
        this.idade=i;
    }
    
    void aniversario(){
        this.idade++;
    }
    
    void apresentar(){
        System.out.print("Oi, eu sou "+this.nome+", tenho "+this.idade+" anos.\n");
    }
}