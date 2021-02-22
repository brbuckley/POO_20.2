package poo_ex2.EX_27;

import java.util.ArrayList;

/*
 */
public class Carrinho {
    int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    int total;//valor da soma do preco de todos os produtos
    ArrayList<int[]> produtos = new ArrayList<int[]>(); // Array guardando o codigo e a quantidade
    
    void adicionarProduto(int c,int q, int p){
        int[]temp={c,q};
        this.produtos.add(temp);
        this.total=p*q;
    }
    
    //ToDo gerar preço na main ou usar funcao antiga
    void removerProduto(int c,int q, int p){
        
    }
    
    void imprimirCarrinho(){
        
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
