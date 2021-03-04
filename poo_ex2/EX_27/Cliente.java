package poo_ex2.EX_27;

/*
 */
public class Cliente {
    private String nome;
    private int saldo;
    private int tipoPagamento;// tipo de pagamento 0 para dinheiro, 1 para cheque e 2 para cartão
    
    Cliente(String n, int s, int t){
        this.nome=n;
        this.saldo=s;
        this.setTipoPagamento(t);
    }
    
    int checarSaldo(){
        System.out.print("Voce tem "+this.getSaldo()+" reais de saldo\n");
        return this.getSaldo();
    }
    
    boolean pagar(int valor){
        if (this.getSaldo()>valor){
            this.saldo-=valor;
            return true;
        }
        else{
            System.out.print("Saldo indisponivel\n");
            return false;
        }
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @return the tipoPagamento
     */
    public int getTipoPagamento() {
        return tipoPagamento;
    }

    /**
     * @param tipoPagamento the tipoPagamento to set
     */
    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
    
}
