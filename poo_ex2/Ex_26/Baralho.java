package poo_ex2.Ex_26;

import java.util.ArrayList;
import java.util.Random;

/*
 */

public class Baralho {
    
    ArrayList<Carta> baralho = new ArrayList<Carta>();
    
    void novaCarta(int v, int n){
        Carta temp=new Carta();
        temp.setCarta(v, n);
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
            Carta tempC = new Carta();
            tempC.setCarta(this.baralho.get(a).valor,this.baralho.get(a).naipe);
            this.baralho.get(a).setCarta(this.baralho.get(b).valor,this.baralho.get(b).naipe);
            this.baralho.get(b).setCarta(tempC.valor,tempC.naipe);
        }
        else System.out.print("Erro\n");
    }
    
    void ordenar(){
        //this.quickSort((Carta[]) this.baralho.toArray(new Carta[0]), 0, 51); //Isso é uma tentativa falha de quicksort
        
        //Nem um pouco eficiente
        for(int i=0;i<51;i++){
            for(int j=i+1;j<52;j++){
                if((this.baralho.get(i).naipe)*13+(this.baralho.get(i).valor+1)>(this.baralho.get(j).naipe)*13+(this.baralho.get(j).valor+1)){
                    this.trocarCartas(i, j);
                }
            }
        }
    }
    
    /* BUGADO
    private int partition(Carta arr[], int begin, int end) {
    int pivot = ((arr[end].naipe)*13+((arr[end].valor)+1));
    int i = (begin-1);

    for (int j = begin; j < end-1; j++) {
        if ( ((arr[j].naipe)*13+((arr[j].valor)+1)) <= pivot) {
            i++;

            this.trocarCartas(i, j);
        }
    }

    this.trocarCartas(i+1, end);

    return i+1;
    }
    
    public void quickSort(Carta arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);

        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
    }
    */
}
