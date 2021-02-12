package poo_ex1;

/*ENUNCIADO

8- Um quadrado mágico é uma matriz quadrada, de valores inteiros,
na qual a soma dos elementos de cada linha, a soma dos elementos de cada
coluna e a soma dos elementos da diagonal primária e da diagonal secundária
são iguais. Desenvolva um programa que leia do usuário uma matriz quadrada
de ordem n e imprima se a matriz é um quadrado mágico ou não.

*/

//importes
import java.util.Scanner;

public class Exercicios_8 {
    
    public static void main(String[] args) {        

        //variaveis
        int n,cont=0,contL=0,contC=0,contD=0,perfeito=0;
        
        //criação da matriz vazia
        System.out.print("Informe o tamanho das linhas\n");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[][] matriz = new int[n][n];
        
        //Adiciona os dados a matriz
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("Informe o elemento %d;%d\n",i+1,j+1);
                matriz[i][j]=scanner.nextInt();
            }
        }
        
        //compara linhas
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                contL=contL+matriz[i][j];
            }
            if(cont==0){cont=contL;contL=0;} //na primeira iteração "cont" seria 0
            else if(cont==contL){perfeito=1;contL=0;}
            else {perfeito=0;break;} //variavel "perfeito" usada para pular etapas caso ache imperfeição.
        }
        
        //compara as colunas
        if (perfeito==1){
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                contC=contC+matriz[i][j];
            }
            if(contC==cont){perfeito=1;contC=0;}
            else {perfeito=0;break;}
        }
        
        //compara a diagonal 1
        if (perfeito==1){
        for (int i=0;i<n;i++){
            contD=contD+matriz[i][i];
        }
        if(contD==cont){perfeito=1;contD=0;}
        else {perfeito=0;}
        
        //compara a diagonal 2
        if (perfeito==1){
        for (int i=1;i<=n;i++){
            contD=contD+matriz[n-i][n-i];
        }
        if(contD==cont){perfeito=1;contD=0;}
        else {perfeito=0;}
        
        }//fim dos ifs checando se é perfeito
        }
        }
        
        //prints
        if (perfeito==1)System.out.print("É um quadrado mágico\n");
        else System.out.print("Não é um quadrado mágico\n");
    }
}