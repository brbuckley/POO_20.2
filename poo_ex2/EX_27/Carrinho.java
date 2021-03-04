package poo_ex2.EX_27;

import java.util.ArrayList;

/*
 */
public class Carrinho {
    private int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    private int total=0;//valor da soma do preco de todos os produtos
    private ArrayList<Produto> produtos = new ArrayList<Produto>(); // estoque nesse caso é usado para quantidade do pedido
    
    void limpar(){
        this.total=0;
        this.produtos.clear();
        this.tipoPagamento=-1;
    }
    
    int getSize(){
        return this.produtos.size();
    }
    
    void adicionarProduto(Produto produto,int quantidade){
        if(produto.getEstoque()>quantidade){
            Produto temp= new Produto();
            temp.setProduto(produto.getCodigo(), produto.getNome(), produto.getPreco(), quantidade);
            this.produtos.add(temp);
            this.total+=produto.getPreco()*quantidade;
        }
        else System.out.print("Produto fora de estoque\n");
    }
    
    int indexNome(String nome){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).getNome().contentEquals(nome)) return i;
        }
        return -1;
    }
    
    //ToDo gerar preço na main ou usar funcao antiga
    void removerProduto(String nome, int quantidade){
        int indice=this.indexNome(nome);
        if(produtos.get(indice).getEstoque()<=quantidade | quantidade==-1){ //tira o produto da lista
            this.total-=this.produtos.get(indice).getPreco()*this.produtos.get(indice).getEstoque(); //diminui o preço total
            this.produtos.remove(indice);
        } 
        else {//diminui a quantidade a comprar
            this.total-=this.produtos.get(indice).getPreco()*quantidade;
            this.produtos.get(indice).setEstoque(this.produtos.get(indice).getEstoque()-quantidade);
        } 
    }
    
    void imprimirCarrinho(){
        for(int i=0;i<this.produtos.size();i++){
            this.produtos.get(i).imprimirProduto();
        }
        System.out.print("Valor total da compra: "+this.getTotal()+"\n");
    }

    /**
     * @return the tipoPagamento
     */
    public int getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }
    
    public Produto getProduto(int i) {
        return produtos.get(i);
    }
}
