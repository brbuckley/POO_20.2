package poo_ex6.Ex_66;


/*
 */
public class Musica{
    
    String titulo;
    String artista;
    
    public Musica(String titulo, String artista){
        this.titulo=titulo;
        this.artista=artista;
    }

    public Musica(){}
    
    public String imprimir(){
        return this.titulo+"-"+this.artista;
    }
    
}
