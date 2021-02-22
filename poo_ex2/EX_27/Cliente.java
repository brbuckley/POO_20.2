package poo_ex2.EX_27;

/*
 */
public class Cliente {
    String nome;
    int saldo;
    int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    
    void setCliente(String n, int s, int t){
        this.nome=n;
        this.saldo=s;
        this.tipoPagamento=t;
    }
    
    int checarSaldo(){
        System.out.print("Voce tem "+this.saldo+" reais de saldo\n");
        return this.saldo;
    }
    
    boolean pagar(int valor){
        if (this.saldo>valor){
            this.saldo-=valor;
            return true;
        }
        else{
            System.out.print("Saldo indisponivel\n");
            return false;
        }
    }
    
}
