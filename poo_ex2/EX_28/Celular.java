package poo_ex2.EX_28;

public class Celular {
    
    private int numero;
    private boolean ocupado;
    private String modelo;
    private String caixaPostal=new String();
    
    private Bateria bateria=new Bateria();
    
    Celular(int n, boolean o,String m, Bateria bat){
        this.numero=n;
        this.ocupado=o;
        this.modelo=m;
        this.caixaPostal="Vazio\n";
        this.bateria.setNivelCarga(bat.getNivelCarga());
        this.bateria.setU(bat.getU());
    }
    
    Celular(int n, boolean o,String m, Bateria bat, String c){
        this.numero=n;
        this.ocupado=o;
        this.modelo=m;
        this.caixaPostal=c;
        this.bateria.setNivelCarga(bat.getNivelCarga());
        this.bateria.setU(bat.getU());
    }
    
    String checarCaixa(){
        return this.caixaPostal;
    }
    
    void mensagemTexto(Rede rede, int n, String mensagem){//1 u
        String temp=mensagem;
        this.bateria.setNivelCarga(this.bateria.getNivelCarga()-(int)100/this.bateria.getU());
        rede.getCelular(rede.indexNumero(n)).setCaixaPostal(temp);
        
    }
            
    void chamada(Rede rede, int n, int tempo){//1 u a cada 5 seg
        if(rede.getCelular(rede.indexNumero(n)).isOcupado())System.out.print("Telefone Ocupado\n");
        else{
            rede.getCelular(rede.indexNumero(n)).bateria.setNivelCarga(rede.getCelular(rede.indexNumero(n)).bateria.getNivelCarga()-(int) ((tempo/5)*100/this.bateria.getU()));
            rede.getCelular(rede.indexNumero(n)).setOcupado(true);
            this.bateria.setNivelCarga(this.bateria.getNivelCarga()-(int) ((tempo/5)*100/this.bateria.getU()));
            this.ocupado=true;
        }
    }
    
    int checarCarga(){
        System.out.print(this.bateria.getNivelCarga()+"% de bateria restante\n");
        return this.bateria.getNivelCarga();
    }

    /**
     * @return the ocupado
     */
    public boolean isOcupado() {
        return ocupado;
    }
    
    public void setOcupado(boolean b){
        this.ocupado=b;
    }
    
    public void setCaixaPostal(String s){
        this.caixaPostal=s;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }
    
    
}
