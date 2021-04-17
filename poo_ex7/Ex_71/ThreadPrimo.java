package poo_ex7.Ex_71;

/*Ideia:
    ThreadPrimo recebe um numero N e uma direcao (0 ou 1), que determina se vai
calcular de 0 a N/2 ou de N a N/2. A quantidade de primos fica armazenada em
'saida'.
 */
public class ThreadPrimo implements Runnable{
    
    private int n=0;
    private int direcao=0;
    private int saida=0;
    
    public ThreadPrimo(int n,int direcao){
        this.n=n;
        this.direcao=direcao;
    }
    
    @Override
    public void run() {
        if(direcao==0){
            if(n>1)this.saida++; //checando se o numero nao é pequeno demais e adicionando o caso 2, ja que o for comeca do 3
            for(int i=3;i<(n/2)+1;i+=2){
                if(ThreadPrimo.ehPrimo(i))this.saida++;
            }
        }else{
            if(n%2==0)n--;//n nao pode ser par nesse caso, ja que estou diminuindo de 2 em 2
            for(int i=n;i>(n/2);i-=2){
                if(ThreadPrimo.ehPrimo(i))this.saida++;
            }
        }
    }
      
    public static boolean ehPrimo(int n){
        if(n==0 | n==1)return false;
        int i,m=0;
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
            return false;
            }
        }
        return true;
    }
    
    public int getSaida() {
        return saida;
    }
    
}
