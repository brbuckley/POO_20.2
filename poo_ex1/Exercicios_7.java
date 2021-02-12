package poo_ex1;

/*ENUNCIADO

7- O setor que terceiriza o restaurante de uma empresa realizou uma pesquisa
com os funcionários pedindo que cada um avaliasse a qualidade das refeições
informando uma nota de 0 a 100. O setor quer saber o percentual de
funcionários que considera as refeições péssimas (nota entre 0 e 25),
ruins (nota acima de 25 e até 50), boas (nota acima de 50 e até 75) e ótimas
(acima de 75 até 100). Escreva um programa que leia as notas informadas e
imprima o percentual de funcionários que votou em cada faixa. A entrada de
dados deve terminar quando for lido um valor que não pertença a nenhum dos
intervalos acima.
*/

//importes
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicios_7 {
    
    public static void main(String[] args) {        

        //variaveis
        int nota,p=0,r=0,b=0,o=0,temp,cont=1;
        List<Integer> notas = new ArrayList<>();
        
        //primeira nota recebida
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a "+cont+"º nota: \n");
        nota=scanner.nextInt();
        
        while(nota>=0 & nota<=100){//recebe todas as notas, parando quando for invalida
        
            notas.add(nota);
            cont++;
            System.out.print("Informe a "+cont+"º nota: \n");
            nota=scanner.nextInt();
        }
        
        //contabiliza os votos
        int tam=notas.size();
        for(int i=0;i<tam;i++){
            temp=notas.get(i);
            if(temp>=0 & temp<=25){p++;}
            else if(temp>25 & temp<=50){r++;}
            else if(temp>50 & temp<=75){b++;}
            else{o++;}
        }
        
        //calcula as porcentagens e converte para inteiro
        p=(int) (100*((float)p/tam));
        r=(int) (100*((float)r/tam));
        b=(int) (100*((float)b/tam));
        o=(int) (100*((float)o/tam));
        
        //prints
        System.out.print(p+"% votaram em péssimo\n");
        System.out.print(r+"% votaram em ruim\n");
        System.out.print(b+"% votaram em bom\n");
        System.out.print(o+"% votaram em ótimo\n");
    }
}