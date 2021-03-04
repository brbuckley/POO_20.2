package poo_ex3.Ex_32;

import java.util.ArrayList;

/* Enunciado:
2 - Em um sistema acadêmico, há as classes Aluno, Professor, Disciplina, Turma 
e Inscrição. Implemente essas classes com possíveis atributos e defina em qual 
classes os métodos a seguir deveriam ser implementados (informe apenas a 
assinatura do método na classe correspondente):

1-Exibição do histórico do aluno
2-Cálculo da média do aluno em uma turma
3-Obtenção do horário de uma aula
4-Descrição da ementa de uma disciplina
5-Cálculo do CR de um aluno

 */

/* Talvez fosse melhor calcular o CR e o historico numa outra classe Historico
a qual aluno fizesse parte. Da forma que implementei o aluno passa informacoes 
demais e desnecessarias para a turma, como as incricoes em outras disciplinas.

METODO: 1, 5

*/
public class Aluno {
    
    String nome;
    int id;
    int cr;
    
    ArrayList <Inscricao> inscricoes = new ArrayList <Inscricao>(); // todas as inscricoes em disciplinas feitas
    
    void historico(){}
    
    int calculaCr(){return 10;}//usa as inscricoes para calcular o cr
    
}
