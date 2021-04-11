package poo_ex6.Ex_66;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

/*
 */
public class Karaoke {
    
    ArrayList<Musica> todasMusicas=new ArrayList<Musica>();
    LinkedList<Musica> tocando=new LinkedList<Musica>();
    
    public Karaoke(){
        Musica musica1=new Musica("Bleed","Meshuggah");this.todasMusicas.add(musica1);
        Musica musica2=new Musica("Cirice","Ghost");this.todasMusicas.add(musica2);
        Musica musica3=new Musica("Ride the Sky","Helloween");this.todasMusicas.add(musica3);
        Musica musica4=new Musica("10.000 Days","Tool");this.todasMusicas.add(musica4);
        Musica musica5=new Musica("Jesu Død","Burzum");this.todasMusicas.add(musica5);
        Musica musica6=new Musica("Aqualung","Jethro Tull");this.todasMusicas.add(musica6);
        Musica musica7=new Musica("Stargazer","Rainbow");this.todasMusicas.add(musica7);
        Musica musica8=new Musica("Chant for Ezkaton 2000","Behemoth");this.todasMusicas.add(musica8);
        Musica musica9=new Musica("Raining Blood","Slayer");this.todasMusicas.add(musica9);
        Musica musica10=new Musica("Dissident Aggressor","Judas Priest");this.todasMusicas.add(musica10);
    }
    
    public void ordemTitulo(){
        ComparaTitulo comparaTitulo=new ComparaTitulo();
        Collections.sort(todasMusicas,comparaTitulo);
    }
    
    public void ordemArtista(){
        ComparaArtista comparaArtista=new ComparaArtista();
        Collections.sort(todasMusicas,comparaArtista);
    }
    
    public void tocarMusica(){
        this.tocando.removeFirst();
    }
    
    public void colocarNaFila(String titulo){
        for(Musica var:this.todasMusicas){
            if(var.titulo.equals(titulo)){this.tocando.add(var);break;}
        }
    }
    
    public void imprimirTodas(){
        System.out.print("Lista de musicas Disponiveis:\n\n");
        for (Musica var:this.todasMusicas)System.out.print(var.titulo+"-"+var.artista+"\n");
        System.out.print("\n");
    }
    
    public void imprimirFila(){
        System.out.print("Fila de musicas para tocar:\n\n");
        if(this.tocando.size()==0){System.out.print("Fila Vazia\n\n");return;}
        for (Musica var:this.tocando)System.out.print(var.titulo+"-"+var.artista+"\n");
        System.out.print("\n");
    }
    
}
