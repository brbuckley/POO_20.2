package poo_ex4.Ex_46;

import java.util.ArrayList;

/*
Deixei todas as classes nesse mesmo arquivo por facilidade de leitura, mas 
faria um arquivo para cada numa situacao real. Nao consegui pensar em formas de 
heranca, na minha cabeca essas classes nao funcionariam bem como extensao de 
outras. E as possiveis extensoes para as classes ja criadas me parecem apenas 
instancias diferentes da mesma classe. Talvez Pikachu ou Charizard pudessem ser
subclasses de pokemon, mas ao ler o problema eu entendi que seriam instancias e 
nao consegui pensar em muitos beneficios para que fossem subclasses.
*/

/*Pensei em extender Pokemon de Tipo, mas acho que causaria mais problemas que
solucoes. Dessa forma ele cria uma copia do tipo que pode ser modificada caso 
evolua ou sofra algum modificador de stat.
*/
public class Pokemon{
    
    Tipo tipo=new Tipo(); //guarda os stats base, e pode ser modificado
    String nome; //nome da "raca" do pokemon, como "Pikachu"
    String aparência, apelido;
    int tamanho, peso;
    
    int experiência, nivel;
    
    int HPatual; //contabiliza o HP atual caso seja ferido, diferente do meuHP que contabilizao HP total
    
    Condicao condicao;
    ArrayList<Modificador> modificadores; //guarda os modificadores de stats ou efeitos de ataques temporarios
    
    void atacar(Ataque ataque){}
    
    void evoluir(){}
    
}

public class Tipo{
    
    String elemento; //nome do elemento
    int HP, Atk, Def, SpAtk, SpDef, Spd; // stats base
    String ataques[]; //guarda o nome de todos os ataques que um pokemon desse tipo pode aprender
    
}

public class Ataque{
    
    String nome, descricao;
    int precisão, potência, quantidade;
    
}

public class Treinador{
    
    String nome;
    Pokemon pokemons[]=new Pokemon[6];
    
    void enviarPokemon(Pokemon pokemon){}
    
    void voltarPokemon(){}
    
    void capturarPokemon(Pokemon pokemon){}
    
}

public class Habilidade{
    
    String nome, descricao;
    Condicao condicao;
    Modificador modificador;
    
}

public class Condicao{
    
    String nome, descricao;
    //implementar efeito
}

public class Modificador{//"buff/debuff" aumento ou diminuicao de stat temporario e descricao
    
    String nome, descricao;
    int stat1, stat2;//pode afetar ate 2 stats
    
}

public class Batalha{//achei relevante uma classe batalha para nao sobrecarregar a main
    
    Treinador treinador1,treinador2;
    
    ArrayList<Modificador> modificadores; //efeitos que podem ocorrer no campo
    ArrayList<Condicao> condicoes;
    
}

public class main_ex46 {
    
    public static void main(String[]args){
        
        Pokemon pikachu=new Pokemon();
        Tipo raio=new Tipo();
        Treinador Ash=new Treinador();
        Treinador Red=new Treinador();
        Ataque choqueTrovao=new Ataque();
        Pokemon charizard=new Pokemon();
        Batalha batalha=new Batalha();
        Condicao paralizado=new Condicao();
        Habilidade estatica=new Habilidade();
        
        /*provavelmente seria feito de outra forma, mas tentei ilustrar de maneira
        simples um treinador enviando um pokemon, que ataca outro e inflinge uma
        condicao. Apos a batalha o pokemon evolui.
        */
        Ash.enviarPokemon(pikachu);
        pikachu.atacar(choqueTrovao);
        charizard.condicao=paralizado;
        pikachu.evoluir();
    }
    
}
