package poo_ex2.EX_23;

public class Porta {
    
    private String cor;
    private double altura;
    private double largura;
    private boolean estado;
    
    Porta(String cor, double altura, double largura, boolean estado){
        this.cor=cor;
        this.altura=altura;
        this.estado=estado;
        this.largura=largura;
    }
    
    void pintar(String c){
        this.cor=c;
    }
    
    void abrirFechar(){
        if (this.estado)this.estado=false;
        else this.estado=true;
    }
    
    boolean estaAberta (){
        if (this.estado==true)System.out.print("A porta está aberta.\n");
        else System.out.print("A porta está fechada.\n");
        return this.estado;
    }
    
    void imprimir(){
        System.out.print("A porta "+this.cor+" mede "+this.altura+" por "+this.largura+"\n");
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(double largura) {
        this.largura = largura;
    }
}