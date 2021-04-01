package poo_ex5.Ex_54;

/*
 */
public class AssalariadoComissionado extends Comissionado{
    
    double base;
    
    public AssalariadoComissionado(String nome, String funcao, double base, int comissao, int vendasTotal){
        super(nome,funcao,comissao,vendasTotal);
        this.base=base;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O funcionario "+this.nome+" com funcao "+this.funcao
                +" que eh assalariado/comissionado, recebera essa semana : "+this.pagamento+" reais.\n");
    }
    
    @Override
    double calculaSalario(){
        this.pagamento+=this.base+(this.vendasTotal*this.comissao/100);
        return this.pagamento;
    }
    
    @Override
    void atualizar(double vetor[]){
        if(vetor[0]>0)this.base=vetor[0];
        if(vetor.length>1)if(vetor[1]>0)this.comissao=(int)vetor[1];
        if(vetor.length>2)if(vetor[2]>0)this.vendasTotal=vetor[2];
    }
    
}
