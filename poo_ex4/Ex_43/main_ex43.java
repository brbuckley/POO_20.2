package poo_ex4.Ex_43;

public class main_ex43 {
    
    public static void main (String[]args){
        
        //criando todas as pessoas da arvore das geracoes mais antigas para as 
        //mais novas.
        Pessoa bisavo1=new Pessoa("Alberto", 91);
        Pessoa bisavo2=new Pessoa("Ana", 92);
        Pessoa bisavo3=new Pessoa("Bruno", 93);
        Pessoa bisavo4=new Pessoa("Bia", 94);
        Pessoa bisavo5=new Pessoa("Carlos", 95);
        Pessoa bisavo6=new Pessoa("Cris", 96);
        Pessoa bisavo7=new Pessoa("Daniel", 97);
        Pessoa bisavo8=new Pessoa("Dilza", 98);
        
        Pessoa avo1=new Pessoa("Edson", 61,bisavo1,bisavo2);
        Pessoa avo2=new Pessoa("Elisa", 62,bisavo3,bisavo4);
        Pessoa avo3=new Pessoa("Fabio", 63,bisavo5,bisavo6);
        Pessoa avo4=new Pessoa("Fatima", 64,bisavo7,bisavo8);
        
        Pessoa pai=new Pessoa("Gustavo",31,avo1,avo2);
        Pessoa mae=new Pessoa("Giulia",32,avo3,avo4);
        
        Pessoa filho=new Pessoa("Heitor",1,pai,mae);
        
        //imprimindo a arvore
        System.out.print("                       Bisavos :\n");
        filho.imprimir(4);
        System.out.print("\n                        Avos :\n        ");
        filho.imprimir(3);
        System.out.print("\n                        Pais :\n                ");
        filho.imprimir(2);
        System.out.print("\n                        Pessoa :\n                      ");
        filho.imprimir(1);
    }
    
}
