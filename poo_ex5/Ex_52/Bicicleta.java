package poo_ex5.Ex_52;

/* DADOS

Usando como base uma bicicleta eletrica de 350 W com autonomia de 30km por bateria,
que anda em media a 25km/h.

Usando de base 1 KW/h = 233 g co2

 */
public class Bicicleta implements CarbonFootprint{
    
    private boolean eletrica=true;
    private int bateria=350;
    private int kmh=25;
    private int autonomia=30;
    
    public Bicicleta(){}
    
    public Bicicleta(boolean eletrica){
        this.eletrica=eletrica;
    }
    
    public Bicicleta(boolean ele, int bat, int kmh, int aut){
        this.eletrica=ele;
        this.bateria=bat;
        this.kmh=kmh;
        this.autonomia=aut;
    }
    
    @Override
    public void imprimir(){
       if(this.eletrica)System.out.print("A bicicleta eletrica, que tem bateria de "
               +this.bateria+"Watts, que anda a "+this.kmh+" km/h, com autonomia de "
       +this.autonomia+" km, ");
       else System.out.print("A bicicleta ");
       System.out.print("consome "+this.getCarbonFootprint()+" kg CO2e por km.\n");
    }
    
    //1,2h para gastar a bateria de 0,35 KW
    //0,29 KW/h por bateria
    //~0,067 Kg CO2e por bateria
    //~0,002 Kg CO2e por km
    
    @Override
    public double getCarbonFootprint(){
        //if(this.eletrica) return 0.0022523;
        if(this.eletrica) return ((this.bateria*0.001)/(this.autonomia/this.kmh))*0.233/this.autonomia;
        return 0;
    }
    
}
