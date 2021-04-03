package poo_ex5.Ex_55;

/*
 */
public class ItemVenda implements Recebivel{
    
    String produto;
    int quantidade;
    double precoUnitario;
    
    public ItemVenda(String produto, int quantidade, double precoUnitario){
        this.produto=produto;
        this.precoUnitario=precoUnitario;
        this.quantidade=quantidade;
    }
    
    @Override
    public void imprimir(){
        System.out.print("O item "+this.produto+", vendeu "+this.quantidade
                +" unidades, com valor "+this.precoUnitario+" e gerou receita de "
                +this.totalizarReceita()+" reais\n");
    }
    
    @Override
    public double totalizarReceita(){
        return this.quantidade*this.precoUnitario;
    }
    
}
