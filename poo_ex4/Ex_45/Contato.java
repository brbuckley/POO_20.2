package poo_ex4.Ex_45;

/*
 */
public class Contato {
    
    protected String endereco;
    
    public Contato(){
        this.endereco="Vazio";
    }
    
    public Contato(String endereco){
        this.endereco=endereco;
    }
    
    void imprimir(){
        System.out.print("Contato Vazio\n");
    }
    
}
