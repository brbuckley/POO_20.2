package poo_ex2.Ex_26;

/*
 */
public class Carta {
    
    private int valor; // Ordem de valor, Ás representa 1 e rei 13
    private int naipe; // 1 ouro 2 espada 3 copas 4 paus
    
    Carta(int v, int n){
        this.valor=v;
        this.naipe=n;
    }
    
    public void setCarta(int v, int n){
        this.valor=v;
        this.naipe=n;
    }
    
    // Imprime a carta por extenso
    void imprimirCarta(){
        int temp1=this.getValor()+1,temp2=this.getNaipe()+1;
        String string1=new String();
        String string2=new String();
                
        switch(temp1){
            
            case 1:
                string1= "Ás";
                break;
            case 2:
                string1="Dois";
                break;
            case 3:
                string1="Três";
                break;
            case 4:
                string1="Quatro";
                break;
            case 5:
                string1="Cinco";
                break;
            case 6:
                string1="Seis";
                break;
            case 7:
                string1="Sete";
                break;
            case 8:
                string1="Oito";
                break;
            case 9:
                string1="Nove";
                break;
            case 10:
                string1="Dez";
                break;
            case 11:
                string1="Valete";
                break;
            case 12:
                string1="Dama";
                break;
            case 13:
                string1="Rei";
                break;
        }
        switch (temp2){
            
            case 1:
                string2="Ouro";
                break;
            case 2:
                string2="Espada";
                break;
            case 3:
                string2="Copas";
                break;
            case 4:
                string2="Paus";
                break;

        }
        System.out.print("A carta é "+string1+" de "+string2+".\n");
    }

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @return the naipe
     */
    public int getNaipe() {
        return naipe;
    }
    
}
