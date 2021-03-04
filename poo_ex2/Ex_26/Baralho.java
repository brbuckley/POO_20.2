package poo_ex2.Ex_26;

import java.util.ArrayList;
import java.util.Random;

/*
 */

public class Baralho {
    
    private ArrayList<Carta> baralho = new ArrayList<Carta>();
    
    void novaCarta(int v, int n){
        Carta temp=new Carta(v,n);
        this.baralho.add(temp);
    }
    
    void setBaralho(){ // cria um baralho ordenado
        for(int j=0;j<4;j++){
            for(int i=0;i<13;i++){
                this.novaCarta(i,j);
            }
        }
    }
    
    void imprimirBaralho(){
        for(int i=0;i<52;i++){
            this.baralho.get(i).imprimirCarta();
        }
    }
    
    void embaralhar(){
        Random aleatorio = new Random();
        int tempI,cont=3; //cont determina a quantidade de vezes que embaralharemos, aumentar pode causar maior "aleatoridade"
        
        while(cont>0){
            for(int i=0;i<52;i++){ //trocando a posicao de cada carta com outra aleatoria

                while(true){ //garantindo um aleatorio diferente de i
                    tempI=aleatorio.nextInt(51);
                    if(tempI!=i){
                        this.trocarCartas(tempI,i);
                        break;
                    }
                }
            }
            cont--;
        }
        
    }
    
    void trocarCartas(int a, int b){ // facilitador para outras funções
        if(a!=b){
            Carta tempC = new Carta(this.baralho.get(a).getValor(), this.baralho.get(a).getNaipe());
            this.baralho.get(a).setCarta(this.baralho.get(b).getValor(),this.baralho.get(b).getNaipe());
            this.baralho.get(b).setCarta(tempC.getValor(),tempC.getNaipe());
        }
        else System.out.print("Erro\n");
    }
    
    void ordenar(){

        //Nem um pouco eficiente
        for(int i=0;i<51;i++){
            for(int j=i+1;j<52;j++){
                if((this.baralho.get(i).getNaipe())*13+(this.baralho.get(i).getValor()+1)>(this.baralho.get(j).getNaipe())*13+(this.baralho.get(j).getValor()+1)){
                    this.trocarCartas(i, j);
                }
            }
        }
    }
}
