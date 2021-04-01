package poo_ex5.Ex_54;

/*
 */
public class PorHora extends Assalariado{
    
    private int horas;
    
    public PorHora(String nome, String funcao, double base, int horas){
        super(nome, funcao, base);
        this.horas=horas;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O funcionario "+this.nome+" com funcao "+this.funcao
                +" que recebe por hora, recebera essa semana : "+this.pagamento+" reais.\n");
    }
    
    @Override
    double calculaSalario(){
        this.pagamento+=this.base+((this.horas-40)*1.5*(this.base/40));
        return this.pagamento;
    }
    
    @Override
    void atualizar(double vetor[]){
        if(vetor[0]>0)this.base=vetor[0];
        if(vetor.length>1)if(vetor[1]>0)this.horas=(int)vetor[1];
    }
    
}
