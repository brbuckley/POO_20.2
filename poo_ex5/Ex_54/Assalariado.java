package poo_ex5.Ex_54;

/*
 */
public class Assalariado extends Funcionario{
    
    final double SALARIOMINIMO=1045;
    
    double base=SALARIOMINIMO/4; //~4 semanas em 1 mes
    
    public Assalariado(String nome, String funcao, double base){
        super(nome, funcao);
        this.base=base;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O funcionario "+this.nome+" com funcao "+this.funcao
                +" que eh assalariado, recebera essa semana : "+this.pagamento+" reais.\n");
    }
    
    @Override
    double calculaSalario(){
        this.pagamento+=this.base;
        return this.base;
    }
    
    @Override
    void atualizar(double vetor[]){
        if(vetor[0]>0)this.base=vetor[0];
    }
    
}
