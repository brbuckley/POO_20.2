package poo_ex4.Ex_45;

/*
 */
public class Fisica extends Contato{
    
    private String nome;
    private String aniversario;
    private String cpf;
    
    public Fisica(String nome, String aniversario, String cpf, String endereco){
        super(endereco);
        this.nome=nome;
        this.aniversario=aniversario;
        this.cpf=cpf;
    }
    
    String getCpf(){
        return this.cpf;
    }
    
    @Override
    void imprimir(){
        System.out.print("\nnome: "+this.nome+
                "\ncpf: "+this.cpf+
                "\naniversario: "+this.aniversario+
                "\nendereco: "+this.endereco+"\n\n");
    }
    
}
