package poo_ex5.Ex_55;

/*
 */
public class Servico implements Recebivel{
    
    String descricao;
    int horas;
    double precoHora;
    
    public Servico(String descricao, int horas, double precoHora){
        this.descricao=descricao;
        this.horas=horas;
        this.precoHora=precoHora;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O servico "+this.descricao+", feito por "+this.horas
                +" horas, com valor horario "+this.precoHora+" e gerou receita de "
                +this.totalizarReceita()+" reais\n");
    }
    
    @Override
    public double totalizarReceita(){
        return this.horas*this.precoHora;
    }
    
}
