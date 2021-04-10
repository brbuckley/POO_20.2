/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ex6.Ex_63;

/**
 *
 * @author buckl
 */
public class DadoInvalidoException extends Exception{
    
    String message="Dado invalido\n";
    
    public DadoInvalidoException(){
        
    }
    
    public DadoInvalidoException(String message){
        this.message=message;
    }
    
    @Override
    public String getMessage(){
        return this.message;
    }
    
}
