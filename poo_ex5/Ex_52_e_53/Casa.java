package poo_ex5.Ex_52_e_53;

/*
Como ja estava pensando em uma casa quando criei Construcao, apenas repeti
 */
public class Casa extends Construcao{
    
    public Casa(int numP, int numL, boolean energia, boolean ar){
        super(numP,numL,energia,ar);
    }
    
    @Override
    public void imprimir(){
        System.out.print("A casa com "+this.numPessoas+" pessoas, "
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
