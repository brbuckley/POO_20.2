package poo_ex6.Ex_66;

import java.util.Comparator;

/*
 */
public class ComparaArtista implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Musica)o1).artista.compareTo(((Musica)o2).artista);
    }
    
    
    
}
