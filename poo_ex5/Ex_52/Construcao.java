package poo_ex5.Ex_52;

/* DADOS
 For each kilowatt hour generated in the U.S., an average of 0.953 pounds of 
CO2e is released at the power plant. Coal releases 2.2 pounds, petroleum 
releases 1.9 pounds, and natural gas releases 0.9 pounds. Nuclear, solar, wind, 
and hydroelectric release no CO2 when they produce electricity, but emissions 
are released during upstream production activities (e.g., solar cells, nuclear 
fuels, cement production).
Residential electricity use in 2018 emitted 666.5 mmt CO2e, 10% of the U.S. total.
Residential space heating and cooling are estimated to account for 44% of energy in U.S. homes in 2020.

Average monthly electricity consumption per household is 943KW/h
Avarage members per household is 2,57
Average annual CO2e emissions from electricity per household is 6360 Kg CO2

Nao achei dados suficientes sobre energia renovavel em casas, usei 50% de redução
 */

/* IDEIA
A ideia foi usar um numero medio tirado de um site e usar como base, aplicando 
modificadores a esse numero para cada informacao dada. Por exemplo, se a casa 
nao tem ar condicionado, o consumo base dela será multiplicado por 0.56, já que 
44% do consumo vem do ar condicionado. Esses multiplicadores se acumulam e depois
são divididos pelo numero de multiplicadores usados.
*/
public class Construcao implements CarbonFootprint{
    
    private int numPessoas, numLampadas=10;
    private boolean energiaRenovavel=false, arCondicionado=true;
    
    public Construcao(int numP, int numL, boolean energia, boolean ar){
        this.numLampadas=numL;
        this.numPessoas=numP;
        this.energiaRenovavel=energia;
        this.arCondicionado=ar;
    }
    
    @Override
    public void imprimir(){
        System.out.print("A construcao com "+this.numPessoas+" pessoas, "
                +this.numLampadas+ " lampadas, ");
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
        return 6360*(((0.9+this.numLampadas*0.01)+(0.743+this.numPessoas*0.1)+(tempAr)+(tempEn)) / 4);
    }
    
}
