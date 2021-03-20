package poo_ex4.Ex_45;

/*
 */
public class Juridica extends Contato{
    
    private String razaosocial;
    private String cnpj;
    private double faturamento;
    
    public Juridica(String razaosocial, double faturamento, String cnpj, String endereco){
        super(endereco);
        this.razaosocial=razaosocial;
        this.faturamento=faturamento;
        this.cnpj=cnpj;
    }
    
    String getCnpj(){
        return this.cnpj;
    }
    
    @Override
    void imprimir(){
        System.out.print("\nrazao social: "+this.razaosocial+
                "\ncnpj: "+this.cnpj+
                "\nfaturamento: "+this.faturamento+
                "\nendereco: "+this.endereco+"\n\n");
    }
    
}
