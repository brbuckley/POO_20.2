package poo_ex5.Ex_52_e_53;

import java.util.ArrayList;

/*
Respostas dadas em kg de CO2e por km no caso do carro e bicicleta e ano no caso da construcao
 */

/* EXERCICIO 53
"O programa que cria a lista de objetos vai continuar funcionando após a 
modificação na estrutura de classes?"

Eu tinha feito o "programa de lista" na mao dentro da main, achei q seria mais 
facil e nao tinha entendido no enunciado que deveria ser feita outra classe 
para isso. Entao apenas adicionei a linha de "criacao" para os objetos novos e
de "add" para a lista e o programa funciona normalmente.
*/

public class main_ex52_e_53 {
    
    public static void main(String args[]){
        
        ArrayList<CarbonFootprint> dados =new ArrayList<CarbonFootprint>();
        
        //criando elementos
        Bicicleta bike1=new Bicicleta(false);
        Bicicleta bike2=new Bicicleta(true,1000,25,100);
        Carro carro1=new Carro("gasolina",(float)1.8,2015);
        Carro carro2=new Carro("eletrico",(float)2.0,2019);
        //Construcao construcao1=new Construcao(4,8,false,true); //Ex 52
        //Construcao construcao2=new Construcao(1,5,true,false); //Ex 52
        Casa casa1=new Casa(4,8,false,true);
        Casa casa2=new Casa(1,5,true,false);
        Escola escola1=new Escola(60,50,false,true,10);
        Escola escola2=new Escola(300,200,true,true,30);
        
        //adicionando elementos na lista
        dados.add(bike1);dados.add(bike2);
        dados.add(carro1);dados.add(carro2);
        //dados.add(construcao1);dados.add(construcao2); //Ex 52
        dados.add(casa1);dados.add(casa2);
        dados.add(escola1);dados.add(escola2);
        
        //loop para imprimir a lista inteira
        for(CarbonFootprint temp:dados){
            temp.imprimir();
        }
        
    }
    
}
