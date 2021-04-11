/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ex6.Ex_66;

import java.util.Comparator;

/**
 *
 * @author buckl
 */
class ComparaTitulo implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Musica)o1).titulo.compareTo(((Musica)o2).titulo);
    }
    
}
