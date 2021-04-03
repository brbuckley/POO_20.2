package poo_ex5.Ex_56;

/*
2 tipos de construtores, um com strings para facilitar outras classes
*/
public class Registro {
    
    int dia,indice;
    double temperaturaMin, temperaturaMax;
    
    public Registro(int dia, double min, double max, int indice){
        this.dia=dia;
        this.indice=indice;
        this.temperaturaMax=max;
        this.temperaturaMin=min;
    }
    
    public Registro(String dia, String min, String max, String indice){
        this.dia=Integer.parseInt(dia);
        this.temperaturaMin=Double.parseDouble(min);
        this.temperaturaMax=Double.parseDouble(max);
        this.indice=Integer.parseInt(indice);
    }
    
    public void imprimir(){
        System.out.print("Dia : "+this.dia+"\n"
                        +"Temperatura minima : "+this.temperaturaMin+"\n"
                        +"Temperatura maxima : "+this.temperaturaMax+"\n"
                        +"Indice pluviometrico : "+this.indice+"\n\n");
    }
    
}
