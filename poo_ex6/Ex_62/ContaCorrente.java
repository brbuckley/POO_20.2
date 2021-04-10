package poo_ex6.Ex_62;

/*
Nos métodos lancem a exceção “IllegalArgumentException()” (Java)com comando 
“throw”, passe o motivo da exceção (uma String) em seu construtor.

 */
public class ContaCorrente {
    
    float limite=0;
    float saldo=0;
    float valorLimite;
    
    public ContaCorrente(float saldo){
        this.saldo=saldo;
    }
    
    public void sacar(float valor) throws IllegalArgumentException{
        if(valor<=0)throw new IllegalArgumentException("Argumento invalido (numero negativo ou zero)");
        else if((valor+this.limite)>this.valorLimite)throw new IllegalArgumentException("Argumento invalido (excedeu o limite)");
        else if(valor>this.saldo)throw new IllegalArgumentException("Argumento invalido (Saldo insuficiente)");
        this.saldo-=valor;
        this.limite+=valor;
        System.out.print("Voce sacou "+valor+" reais da conta\n");
    }
    public void depositar(float valor)throws IllegalArgumentException{
        if(valor<=0)throw new IllegalArgumentException("Argumento invalido (numero negativo ou zero)");
        this.saldo+=valor;
        System.out.print("Voce depositou "+valor+" reais na conta\n");
    }
    public void setValorLimite(float valor)throws IllegalArgumentException{
        if(valor<0)throw new IllegalArgumentException("Argumento invalido (numero negativo)");
        this.valorLimite=valor;
        System.out.print("Seu limite maximo eh "+valor+" reais\n");
    }

    
}
