package poo_ex2.EX_27;

import java.util.ArrayList;

/*
 */
public class Mercado {
    private int codigo;
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int cofre;
    
    Mercado(int c, String n,int cof){
        this.codigo=c;
        this.nome=n;
        this.cofre=cof;
    }
    
    Produto getProduto(int i){
        return this.produtos.get(i);
    }
    
    // tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão        
    boolean tipoPagamentoAceito(int t){
        if(t==0 | t==2)return true;
        else {
            System.out.print("Tipo de pagamento invalido\n");
            return false;
        }
    }
    
    void novoProduto(int c, String n, int p, int e){
        Produto temp=new Produto();
        temp.setProduto(c,n,p,e);
        this.produtos.add(temp);
    }
    
    void setProdutos(String entrada){
        String[] stringArray=entrada.split(" ");
        for(int i=0;i<stringArray.length;i+=4){
            this.novoProduto(Integer.parseInt(stringArray[i]), stringArray[i+1], Integer.parseInt(stringArray[i+2]), Integer.parseInt(stringArray[i+3]));
        }
    }
    
    // gera o código do produto cujo nome foi informado, caso ele esteja em estoque
    int gerarCodigo(String entrada, int quantidade){
        int temp;
        temp=this.indexNome(entrada);
        if (temp!=-1){
            if (this.produtos.get(temp).getEstoque()>quantidade) return this.produtos.get(temp).getCodigo();
            else return -1;
        }
        else return -1;
    }
    
    // gera o indice do produto na lista cujo nome foi informado
    int indexNome(String nome){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).getNome().contentEquals(nome)) return i;
        }
        return -1;
    }
    
    // gera o indice do produto na lista cujo código foi informado
    int indexCodigo(int codigo){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).getCodigo()==codigo) return i;
        }
        return -1;
    }
    
    //recebe um carrinho de pedidos retira a 
    //quantidade de cada produto do estoque e adiciona o valor no cofre
    //Porem não checa o saldo do cliente
    void comprar(Carrinho carrinho){ 
        int temp;
        for(int i=0;i<carrinho.getSize();i++){
            temp=this.indexCodigo(carrinho.getProduto(i).getCodigo());
            this.produtos.get(temp).setEstoque(this.produtos.get(temp).getEstoque()-carrinho.getProduto(i).getEstoque());
            this.cofre+=carrinho.getTotal();
            carrinho.limpar();
        }
    }
    
}
