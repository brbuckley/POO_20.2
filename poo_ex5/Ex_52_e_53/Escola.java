package poo_ex5.Ex_52_e_53;

/*
Nao achei dados sobre escolas e consegui pensar apenas em numero de salas como
variavel que afetaria o resultado. Usei 0.6 como fator de crescimento para cada
nova sala. Tambem diminui o fator do numero de pessoas.
 */
public class Escola extends Construcao{
    
    private int salas;
    
    public Escola(int numP, int numL, boolean energia, boolean ar, int salas){
        super(numP, numL, energia, ar);
        this.salas=salas;
    }
    
    @Override
    public void imprimir(){
        System.out.print("A escola com "+this.numPessoas+" pessoas, "
                +this.numLampadas+ " lampadas, "
        +this.salas+" salas, ");
        if(this.energiaRenovavel)System.out.print("que usa energia renovavel, ");
        else System.out.print("que nao usa energia renovavel, ");
        if(this.arCondicionado)System.out.print("e usa ar condicionado ");
        else System.out.print("e nao usa ar condicionado ");
        System.out.print("consome "+this.getCarbonFootprint()+" kg CO2e por ano.\n");
    }
    
    @Override
    public double getCarbonFootprint(){
        double tempAr,tempEn;
        if(this.arCondicionado==false){
            tempAr=0.56;
        }else {tempAr=1;}
        if(this.energiaRenovavel==false){
            tempEn=1;
        }else {tempEn=0.5;}
        return (this.salas*0.6+0.4)*6360*(((0.9+this.numLampadas*0.01)+(1+this.numPessoas*0.01)+(tempAr)+(tempEn)) / 4);
    }
    
}
