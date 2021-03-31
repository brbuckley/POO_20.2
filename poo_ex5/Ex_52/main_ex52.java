package poo_ex5.Ex_52;

import java.util.ArrayList;

/*
Respostas dadas em kg de CO2e por km no caso do carro e bicicleta e ano no caso da construcao
 */
public class main_ex52 {
    
    public static void main(String args[]){
        
        ArrayList<CarbonFootprint> dados =new ArrayList<CarbonFootprint>();
        
        //criando elementos
        Bicicleta bike1=new Bicicleta(false);
        Bicicleta bike2=new Bicicleta(true,1000,25,100);
        Carro carro1=new Carro("gasolina",(float)1.8,2015);
        Carro carro2=new Carro("eletrico",(float)2.0,2019);
        Construcao construcao1=new Construcao(4,8,false,true);
        Construcao construcao2=new Construcao(1,5,true,false);
        
        //adicionando elementos na lista
        dados.add(bike1);dados.add(bike2);
        dados.add(carro1);dados.add(carro2);
        dados.add(construcao1);dados.add(construcao2);
        
        //loop para imprimir a lista inteira
        for(CarbonFootprint temp:dados){
            temp.imprimir();
        }
        
    }
    
}
