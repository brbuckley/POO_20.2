package poo_ex3.Ex_32;

import java.util.ArrayList;

/* Turma é a classe mais complexa e engloba todas as outras.

METODO: 2, 3

 */
public class Turma {
    
    int id;
    ArrayList <Aluno> alunos = new ArrayList <Aluno>();
    Professor professor;
    Disciplina disciplina; //redundante ja que professor possui disciplina, mas talvez seja necessario ou conveniente
    String dias; //entradas do tipo "segunda" ou "segunda quarta" usando split
    int horario;
    int duracao;
    
    //recebe o nome do aluno, usa para achar o indice da lista e retorna a 
    //media com os pesos já aplicados as notas.
    int media(String nome){return 10;} 
    
    //retorna o horario composto de dias horario e duracao
    String getHorario(){return "Segunda e Quarta de 16:00 ate 18:00";}
    
}
