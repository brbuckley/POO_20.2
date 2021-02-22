package poo_ex2.EX_27;

import java.util.ArrayList;

/*
 */
public class Carrinho {
    int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    int total=0;//valor da soma do preco de todos os produtos
    ArrayList<Produto> produtos = new ArrayList<Produto>(); // estoque nesse caso é usado para quantidade do pedido
    
    void limpar(){
        
    }
    
    void adicionarProduto(Produto produto,int quantidade){
        if(produto.estoque>quantidade){
            Produto temp= new Produto();
            temp.setProduto(produto.codigo, produto.nome, produto.preco, quantidade);
            this.produtos.add(temp);
            this.total+=produto.preco*quantidade;
        }
        else System.out.print("Produto fora de estoque\n");
    }
    
    int indexNome(String nome){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).nome.contentEquals(nome)) return i;
        }
        return -1;
    }
    
    //ToDo gerar preço na main ou usar funcao antiga
    void removerProduto(String nome, int quantidade){
        int indice=this.indexNome(nome);
        if(produtos.get(indice).estoque<=quantidade | quantidade==-1){ //tira o produto da lista
            this.total-=this.produtos.get(indice).preco*this.produtos.get(indice).estoque; //diminui o preço total
            this.produtos.remove(indice);
        } 
        else {//diminui a quantidade a comprar
            this.total-=this.produtos.get(indice).preco*quantidade;
            this.produtos.get(indice).estoque-=quantidade;
        } 
    }
    
    void imprimirCarrinho(){
        for(int i=0;i<this.produtos.size();i++){
            this.produtos.get(i).imprimirProduto();
        }
        System.out.print("Valor total da compra: "+this.total+"\n");
    }
    
    /* Função antiga usada quando não se pedia preço em 'adicionarProduto'
    int calculaTotal(Mercado mercado){
        int temp,total=0;
        for(int i=0;i<this.produtos.size();i++){
            temp=mercado.indexCodigo(this.produtos.get(i)[0]);
            total+=(mercado.produtos.get(temp).preco)*this.produtos.get(i)[1];
        }
        return total;
    }
    */
    
}
