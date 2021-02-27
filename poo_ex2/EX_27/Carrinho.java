package poo_ex2.EX_27;

import java.util.ArrayList;

/* A ideia era usar referencias a produtos como no ex 2.8 mas escolhi criar uma 
copia dos produtos pela facilidade.
 */
public class Carrinho {
    int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    int total=0;//valor da soma do preco de todos os produtos
    ArrayList<Produto> produtos = new ArrayList<Produto>(); // estoque nesse caso é usado para quantidade do pedido
    
    // cria uma copia do produto com quantidade no lugar do estoque e adiciona
    // o custo desses produtos ao valor total
    void adicionarProduto(Produto produto,int quantidade){
        if(produto.estoque>quantidade){
            Produto temp= new Produto();
            temp.setProduto(produto.codigo, produto.nome, produto.preco, quantidade);
            this.produtos.add(temp);
            this.total+=produto.preco*quantidade;
        }
        else System.out.print("Produto fora de estoque\n");
    }
    
    int indexNome(String nome){ // recebe o nome de um produto e retorna o indice na lista
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).nome.contentEquals(nome)) return i;
        }
        return -1;
    }
    
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
}
