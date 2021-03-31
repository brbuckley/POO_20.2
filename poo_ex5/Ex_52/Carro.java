package poo_ex5.Ex_52;

/* DADOS
Average figures for the United States are provided by the US Environmental 
Protection Agency, based on the EPA Federal Test Procedure, for the following categories:
Passenger cars: 200 g CO2/km (322 g/mi)

For vehicles, average figures for CO2 emissions per kilometer for road travel 
for 2013 in Europe, normalized to the NEDC test cycle, are provided by the 
International Council on Clean Transportation:
Newly registered passenger cars: 127 g CO2/km
Hybrid-electric vehicles: 92 g CO2/km

Nao achei dados suficientes sobre cilindradas em carros, usei 1.4 como a media, e 5% de diferença a cada 0.1

Vou usar como media de idade do carro 10 anos.

 */
public class Carro implements CarbonFootprint {
    
    private String combustivel;
    private Float cilindrada=(float)1.4; 
    private int ano=2010;
    
    public Carro(String comb, Float cili, int ano){
        this.combustivel=comb;
        this.cilindrada=cili;
        this.ano=ano;
    }
    
    private final int ANOATUAL=2021;
    
    @Override
    public void imprimir(){
        System.out.print("O carro com combustivel "+this.combustivel+", de "
                +this.cilindrada+ " cilindradas, do ano "+this.ano
                +", consome "+this.getCarbonFootprint()+" kg CO2e por km.\n");
    }
    
    @Override
    public double getCarbonFootprint(){
        double tempCom;
        if(this.combustivel.contentEquals("eletrico")){
            tempCom=0.72;
        }else {tempCom=1;}
        return ((ANOATUAL-ano)*0.0073+0.127)*(((0.8+this.cilindrada*0.05)+(tempCom)) / 2);
    }
    
}
