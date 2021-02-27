package poo_ex2.EX_27;

import java.util.ArrayList;

/*
 */
public class Mercado {
    int codigo;
    String nome;
    ArrayList<Produto> produtos = new ArrayList<Produto>();
    int cofre;
    
    // tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão        
    boolean tipoPagamentoAceito(int t){
        if(t==0 | t==2)return true;
        else {
            System.out.print("Tipo de pagamento invalido\n");
            return false;
        }
    }
    
    void setMercado(int c, String n,int cof){
        this.codigo=c;
        this.nome=n;
        this.cofre=cof;
    }
    
    void novoProduto(int c, String n, int p, int e){
        Produto temp=new Produto();
        temp.setProduto(c,n,p,e);
        this.produtos.add(temp);
    }
    
    //recebe uma string como todos os produtos a serem adicionados para agilizar o teste
    // a entrada � feita de forma:
    //"Codigo_do_produto(inteiro) Nome_do_produto(String) Preco_do_Produto(inteiro) Estoque(inteiro) *repete para o prox*"
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
            if (this.produtos.get(temp).estoque>quantidade) return this.produtos.get(temp).codigo;
            else return -1;
        }
        else return -1;
    }
    
    // gera o indice do produto na lista cujo nome foi informado
    int indexNome(String nome){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).nome.contentEquals(nome)) return i;
        }
        return -1;
    }
    
    // gera o indice do produto na lista cujo código foi informado
    int indexCodigo(int codigo){
        for(int i=0;i<this.produtos.size();i++){
            if(this.produtos.get(i).codigo==codigo) return i;
        }
        return -1;
    }
    
    //recebe um carrinho de pedidos retira a 
    //quantidade de cada produto do estoque e adiciona o valor no cofre
    //Porem não checa o saldo do cliente
    void comprar(Carrinho carrinho){ 
        int temp;
        for(int i=0;i<carrinho.produtos.size();i++){
            temp=this.indexCodigo(carrinho.produtos.get(i).codigo);
            this.produtos.get(temp).estoque-=carrinho.produtos.get(i).estoque;
            this.cofre+=carrinho.total;
            carrinho.total=0;
            carrinho.produtos.clear();
        }
    }
    
}
