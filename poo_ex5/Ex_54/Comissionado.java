package poo_ex5.Ex_54;

/*
 */
public class Comissionado extends Funcionario{
    
    final int COMISSAOMEDIA=10; //10%
    
    int comissao=COMISSAOMEDIA;
    double vendasTotal;
    
    public Comissionado(String nome, String funcao, int comissao, double vendasTotal){
        super(nome,funcao);
        this.comissao=comissao;
        this.vendasTotal=vendasTotal;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O funcionario "+this.nome+" com funcao "+this.funcao
                +" que eh comissionado, recebera essa semana : "+this.pagamento+" reais.\n");
    }
    
    @Override
    double calculaSalario(){
        this.pagamento+=this.vendasTotal*this.comissao/100;
        return this.pagamento;
    }
    
    @Override
    void atualizar(double vetor[]){
        if(vetor[0]>0)this.comissao=(int)vetor[0];
        if(vetor.length>1)if(vetor[1]>0)this.vendasTotal=vetor[1];
    }
    
}
