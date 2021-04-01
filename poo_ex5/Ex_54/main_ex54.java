package poo_ex5.Ex_54;

import java.util.ArrayList;

/*Enunciado
Uma empresa paga seus funcionários semanalmente. Os funcionários são de quatro 
tipos: Funcionários assalariados recebem salários fixos semanais 
independentemente do número de horas trabalhadas, funcionários que trabalham 
por hora são pagos da mesma forma e recebem horas extras (isto é, 1,5 vezes sua 
taxa de salário por hora) por todas as horas trabalhadas além das 40 horas 
normais, funcionários comissionados recebem uma porcentagem sobre suas vendas e 
funcionários assalariados/ comissionados recebem um salário-base mais uma 
porcentagem sobre suas vendas. Para o período salarial atual, a empresa decidiu 
recompensar os funcionários assalariados/comissionados adicionando 10% aos seus 
salários-base. A empresa quer escrever um programa em Java que realiza os 
cálculos da folha de pagamento polimorficamente.
 */

/*
O enunciado trata do pagamento como semanal, nao mensal, por isso fiz o calculo 
semanal para todos os tipos.
Usei como base salarial multiplos do salario minimo e dividi por 4, por terem 
~4 semanas num mes.

A ideia do metodo "atualizar" com um vetor de double foi a primeira
que eu tive, e fui obrigado a usar ifs para evitar erros "out of bounds", nao acredito
que seja a melhor forma, mas continuei com ela.
*/
public class main_ex54 {
    
    public static void main(String args[]){
        
        ArrayList<Funcionario> funcionarios=new ArrayList<Funcionario>();
        double total=0;
        
        Assalariado funcionario1=new Assalariado("Ana","Atendente",1045/4);
        PorHora funcionario2=new PorHora("Bob","Balconista",2090/4,43);
        Comissionado funcionario3=new Comissionado("Carla","Corretora",10,100000);
        AssalariadoComissionado funcionario4=new AssalariadoComissionado("Daniel","Dentista",5225/4,20,1000);
        
        funcionarios.add(funcionario1);funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);funcionarios.add(funcionario4);
        
        //bonificando 10% ao salario base do funcionario4
        double atualiza[]={funcionario4.base*1.1};
        funcionario4.atualizar(atualiza);
        
        //calculando os salarios, adicionando os pagamentos ao "total" e imprimindo os funcionarios
        for(Funcionario temp:funcionarios){
            total+=temp.calculaSalario();
            temp.imprimir();
        }
        
        System.out.print("\nA empresa precisa pagar "+total+" reais no total.\n");
        
    }
    
}
