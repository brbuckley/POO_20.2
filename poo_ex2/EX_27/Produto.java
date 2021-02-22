package poo_ex2.EX_27;

/*
 */
public class Produto {
    int codigo;
    String nome;
    int preco;
    int estoque;
    
    void setProduto(int c, String n, int p, int e){
        this.codigo=c;
        this.nome=n;
        this.preco=p;
        this.estoque=e;
    }
    
    void imprimirProduto(){
        System.out.print("Produto: "+this.nome+
                         "\nPreço: $"+this.preco+" Reais\n"+
                         "Quantidade: "+this.estoque+"\n\n");
    }
    
}
