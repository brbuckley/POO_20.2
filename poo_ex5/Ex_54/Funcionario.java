package poo_ex5.Ex_54;

/*
 */
public abstract class Funcionario {
    
    double pagamento=0; //pagamento comeca por 0 pois eh somado
    String nome,funcao;
    
    public Funcionario(String nome, String funcao){
        this.nome=nome;
        this.funcao=funcao;
    }
    
    public abstract void imprimir();
    
    //retorna o pagamento semanal para chegagem e soma o valor na variavel 
    //pagamento a cada chamada.
    abstract double calculaSalario();
    
    //Usado para atualizar os valores a cada semana.
    //Usei um vetor de double e converti para int quando necessario.
    //As entradas negativas (-1) serão ignoradas.
    //A ordem de prioridade é alfabetica : base, horas, comissao, vendaTotal
    abstract void atualizar(double vetor[]);
    
}
