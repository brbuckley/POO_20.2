package poo_ex4.Ex_48;

/*Enunciado
Escreva uma classe genérica Par que tem dois parâmetros de tipo - F e S - cada 
um representando o tipo do primeiro e segundo elemento do par, respectivamente. 
Adicione os métodos get e set ao primeiro e ao segundo elemento do par 
(Dica: o cabeçalho da classe deve ser public class Par<F, S >)
 */
public class Par<F, S> {
    
    private F f;
    private S s;
    
    public Par(F f, S s){
        this.f=f;
        this.s=s;
    }

    public F getF() {
        return f;
    }

    public void setF(F f) {
        this.f = f;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }
    
}
