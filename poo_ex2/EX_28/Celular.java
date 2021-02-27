package poo_ex2.EX_28;

public class Celular {
    
    
    int numero;
    boolean ocupado;
    String modelo;
    String caixaPostal=new String();
    
    Bateria bateria=new Bateria();
    
    void setCelular(int n, boolean o,String m, Bateria bat){ // criar um celular sem caixa postal
        this.numero=n;
        this.ocupado=o;
        this.modelo=m;
        this.caixaPostal="Vazio\n";
        this.bateria.nivelCarga=bat.nivelCarga;
        this.bateria.u=bat.u;
    }
    
    void setCelular(int n, boolean o,String m, Bateria bat, String c){ // criar um celular com caixa postal
        this.numero=n;
        this.ocupado=o;
        this.modelo=m;
        this.caixaPostal=c;
        this.bateria.nivelCarga=bat.nivelCarga;
        this.bateria.u=bat.u;
    }
    
    String checarCaixa(){
        return this.caixaPostal;
    }
    
    void mensagemTexto(Rede rede, int n, String mensagem){//1 u
        String temp=mensagem;
        this.bateria.nivelCarga-=(int)100/this.bateria.u;
        rede.celulares.get(rede.indexNumero(n)).caixaPostal=temp;
        
    }
            
    void chamada(Rede rede, int n, int tempo){//1 u a cada 5 seg
        if(rede.celulares.get(rede.indexNumero(n)).ocupado)System.out.print("Telefone Ocupado\n");
        else{
            rede.celulares.get(rede.indexNumero(n)).bateria.nivelCarga-=(int) ((tempo/5)*100/this.bateria.u);
            rede.celulares.get(rede.indexNumero(n)).ocupado=true;
            this.bateria.nivelCarga-=(int) ((tempo/5)*100/this.bateria.u);
            this.ocupado=true;
        }
    }
    
    int checarCarga(){
        System.out.print(this.bateria.nivelCarga+"% de bateria restante\n");
        return this.bateria.nivelCarga;
    }
    
    boolean estaOcupado(){
        if(this.ocupado){ 
            System.out.print("Ocupado \n");
            return true;
        }
        else {
            System.out.print("Disponivel \n");
            return false;
        }
    }
    
    
}
