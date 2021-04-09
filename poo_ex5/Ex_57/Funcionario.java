package poo_ex5.Ex_57;

import java.io.Serializable;

/*
 */
public class Funcionario implements Serializable{
    
    int registro;
    String nome;
    int departamento;
    int gerenciado;
    
    public Funcionario(int r, String n, int d, int g){
        this.registro=r;
        this.nome=n;
        this.departamento=d;
        this.gerenciado=g;
    }
    
}
