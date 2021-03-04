package poo_ex2.EX_27;

/*
 */
public class Produto {
    private int codigo;
    private String nome;
    private int preco;
    private int estoque;
    
    void setProduto(int c, String n, int p, int e){
        this.codigo=c;
        this.nome=n;
        this.preco=p;
        this.estoque=e;
    }
    
    void imprimirProduto(){
        System.out.print("Produto: "+this.getNome()+
                         "\nPreço: $"+this.getPreco()+" Reais\n"+
                         "Quantidade: "+this.getEstoque()+"\n\n");
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @return the estoque
     */
    public int getEstoque() {
        return estoque;
    }
    
    public void setEstoque(int e){
        this.estoque=e;
    }
    
}
