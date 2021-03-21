package poo_ex4.Ex_46;

import java.util.ArrayList;

/*
Deixei todas as classes nesse mesmo arquivo por facilidade de leitura, mas 
faria um arquivo para cada numa situacao real. Pensei no uso de herencas entre
um pokemon generico e um pokemon de um elemento, entre o pokemon de um elemento
e o "tipo" de pokemon como Pikachu ser um PokeRaio que eh um Pokemon. Alem disso
achei interessante a ideia de tentar manter a instancia e fazer um Raichu ser 
subclasse de Pikachu, mas nao sei se funcionaria como eu espero. Outro lugar que
usei heranca foi em Ataques, para cada tipo de Ataque; em Condicoes para cada
tipo de Condicao; e em Habilidade.

Nao implementei todas as funcoes e todos os construtores, tentei deixar o mais 
basico possivel focando apenas em heranca e com o minimo de complexidade para 
fazer um exemplo de um pikachu do terinador Ash atacando um Charizard do 
treinador Red e evoluindo com a experiencia.
*/

public class Pokemon{
    
    String nome; //nome da "raca" do pokemon, como "Pikachu"
    String aparência, apelido;
    int tamanho, peso;
    
    int experiência, nivel;
    
    int HPatual; //contabiliza o HP atual caso seja ferido, diferente do meuHP que contabilizao HP total
    
    Habilidade habilidade;
    Ataque ataques[]= new Ataque[4];
    Condicao condicao;
    ArrayList<Modificador> modificadores; //guarda os modificadores de stats ou efeitos de ataques temporarios
    
    void atacar(Ataque ataque){}
    
    void evoluir(){}
    
}

public class PokeEletrico extends Pokemon{
    
    int HP=64, Atk=74, Def=69, SpAtk=86, SpDef=71, Spd=80; // stats base
    String ataques[]; //guarda o nome de todos os ataques que um pokemon desse tipo pode aprender
    
}

public class Pikachu extends PokeEletrico{
    
    String habilidades[]; //guarda as possiveis habilidades que um pikachu pode ter
    public Pikachu(){this.Atk+=10;} //modifica os stats base para serem os stats unicos do pikachu, usei apenas 1 para servir de exemplo
    
}

public class Raichu extends Pikachu{
    
    String novasHabilidades[];
    void atualizarStats(){}; //caso o pokemon seja um pikachu que evoluiu
    void atualizarAparencia(){};
    
}

public class PokeFogo extens Pokemon{}

public class Charmander extends Pokemon{}

public class Charmeleon extends Charmander{}

public class Charizard extends Charmeleon{}

public class Ataque{

    String descricao;
    int precisão, potência, quantidade;
    
}

public class ChoqueTrovao extends Ataque{
    
    CondicaoParalizar paralizar; //talvez seja static, dai seria implementado de outra forma
    
}

public class Treinador{
    
    String nome;
    Pokemon pokemons[]=new Pokemon[6];
    
    void enviarPokemon(Pokemon pokemon){}
    
    void voltarPokemon(){}
    
    void capturarPokemon(Pokemon pokemon){}
    
}

public class Habilidade{
    
    String descricao;
    
}

public class Estatica extends Habilidade{
    
    CondicaoParalizar estatica;
    
}

public class Condicao{
    
    String descricao;
    int precisão;
}

public class CondicaoParalizar extends Condicao{
    
    void efeito(){}//implementar efeito talvez seja static
    
}

public class Modificador{//"buff/debuff" aumento ou diminuicao de stat temporario e descricao
    
    String nome, descricao;
    int stat, turnos;
    
}

public class Batalha{//achei relevante uma classe batalha para nao sobrecarregar a main
    
    Treinador treinador1,treinador2;
    int contaTurnos; //atualizador de turnos
    Pokemon pokemon1, pokemon2;
    
    ArrayList<Modificador> modificadores; //efeitos que podem ocorrer no campo
    ArrayList<Condicao> condicoes;
    
    //teriam mais parametros, mas botei esses 2 para evitar um erro na main
    public Batalha(Treinador treinador1, Treinador treinador2){}
    
}

public class main_ex46 {
    
    public static void main(String[]args){
        
        Pokemon meuPikachu=new Pikachu();
        Treinador Ash=new Treinador();
        Treinador Red=new Treinador();
        Pokemon meuCharizard=new Charizard();
        Batalha batalha=new Batalha(Ash,Red);
        
        /*provavelmente seria feito de outra forma, mas tentei ilustrar de maneira
        simples um treinador enviando um pokemon, que ataca outro e inflinge uma
        condicao. Apos a batalha o pokemon evolui.
        */
        batalha.treinador1.enviarPokemon(meuPikachu);
        batalha.treinador2.enviarPokemon(meuCharizard);
        batalha.pokemon1.atacar(batalha.pokemon1.ataques[0]); //selecionando o primeiro ataque dos 4 que meu pikachu tem
        meuPikachu.evoluir(); //a ideia eh implementar uma evolucao que mantenha 
        //a instancia e "promova" ela a uma subclasse, mas nao sei se funcionaria.
    }
    
}
