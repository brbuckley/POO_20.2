package poo_ex3.Ex_34;

/* Enunciado:
4 -   Crie uma classe Data com as seguintes capacidades:
Gerar saída da data em múltiplos formatos, como: DD/MM/AAAA; Agosto 08, 2017; DDD AAAA;
Utilize construtores sobrecarregados para criar objetos Data inicializados com datas no formato definido em cima.
No primeiro caso, o construtor deve receber 3 valores inteiros.
No segundo caso, deve receber uma String e 2 valores inteiros.
No terceiro caso deve receber 2 valores inteiros, o primeiro representando o número de dias no ano.
Faça uma classe principal que implemente o método main que deverá instanciar 2 objetos de cada formato e depois imprimir cada um deles.

 */
public class main_ex34 {
    
    public static void main(String[] args) {
    
        Data data1 = new Data("Julho", 17, 1982);
        Data data2 = new Data(24, 7, 1990);
        Data data3 = new Data(25, 1996);

        data1.imprimir();
        data2.imprimir();
        data3.imprimir();
    }
}
