package poo_ex6.Ex_62;

/*Enunciado:
Implemente a classe TesteContaCorrente, onde se deve instanciar um objeto da 
classe “ContaCorrente”, usar os três métodos construídos acima e tratar as 
exceções propostas com os comandos “try” e “catch”, no catch imprimir na tela 
o método “getMessage()” da exceção declarada no catch. Cause condições 
apropriadas para a execução das exceções.
 */

/*Ideia
Fiz apenas uma funcao testar static e criei a main aqui mesmo ja que teria
apenas 1 linha. Fiz um try/catch pra cada metodo.
*/

public class TesteContaCorrente {
    
    //boolean retornando true caso haja alguma excecao
    public static boolean testar(){
        
        //conta corrente comeca com saldo e limite 0
        ContaCorrente conta=new ContaCorrente((float)0);
        
        boolean saida=false; //saida caso haja excecao
        
        try{conta.setValorLimite((float)1000.00);
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.depositar((float)1050.60);//saldo seria 1050.60 ja que comeca com 0
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.sacar((float)900.00);
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.sacar(-100);
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.sacar((float)1000.01);
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.sacar(100);//limite atinge valorLimite
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }try{conta.sacar(9);
        }catch(IllegalArgumentException ex){
            System.out.print(ex.getMessage()+"\n");
            saida=true;
        }
        return saida;
    }
    
    public static void main(String args[]){
        
        TesteContaCorrente.testar();
        
    }
    
}
