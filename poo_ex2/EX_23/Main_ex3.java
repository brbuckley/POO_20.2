package poo_ex2.EX_23;

public class Main_ex3 {
    
    public static void main(String[] args) {
        
        Porta porta=new Porta();
        porta.setPorta("Marrom", 2.1, 0.7, true); //criando porta aberta
        
        porta.imprimir();
        
        porta.abrirFechar(); //fecha
        porta.estaAberta();
        
        porta.abrirFechar(); //abre
        porta.estaAberta();
        
        porta.pintar("Verde");
        
        porta.imprimir();
        
        porta.pintar("Branco");
        porta.altura=2.2;
        porta.largura=0.8;
        
        porta.imprimir();
        porta.estaAberta();
        
    }
    
}
