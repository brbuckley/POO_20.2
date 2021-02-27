package poo_ex2.EX_28;

/*Enunciado
8- Faça uma classe celular em que cada celular contém uma bateria, cada bateria 
é caracterizada pela capacidade de carga (medida em unidades u inteiras) e pelo 
nível de carga. Com o seu celular você pode enviar mensagens de texto e fazer 
ligações mas, obviamente, ambas as funções afetam o nível da bateria: uma 
mensagem de texto consome uma unidade de carga e uma chamada consome uma 
unidade de carga a cada 5 segundos. Também é possível saber o nível de carga 
do celular. Implemente as classes com todos os métodos que julgar apropriados 
para simular objetos reais e, em seguida, instancie os objetos e faça 
alguns testes.
 */

public class main_ex28 {
    
    public static void main(String[] args) {

        //criando variaveis e objetos para teste
        Rede rede = new Rede();
        
        Celular celular1 = new Celular();
        Celular celular2 = new Celular();
        
        Bateria bat1 = new Bateria();
        Bateria bat2 = new Bateria();
        
        bat1.setBateria(10, 100);
        bat2.setBateria(8, 50);
        
        celular1.setCelular(999999999, false, "MotoG", bat1);
        celular2.setCelular(923456789, false, "Iphone", bat2);
        
        rede.adicionarCelular(celular1);
        rede.adicionarCelular(celular2);
        
        //Teste 1: Enviar uma mensagem do celular 1 para o celular 2
        celular1.checarCarga();
        celular2.checarCarga();
        celular1.mensagemTexto(rede, 923456789, "Teste\n");
        System.out.print("Mensagem enviada\n\n");
        
        celular1.checarCarga();
        celular2.checarCarga();
        System.out.print(celular2.checarCaixa()+"\n");
        
        
        //Teste 2: Usar o celular 1 para ligar para o celular 2
        System.out.print("Celular1 :");celular1.estaOcupado();
        System.out.print("Celular2 :");celular2.estaOcupado();
        
        celular1.chamada(rede, 923456789, 10);
        System.out.print("Chamada iniciada\n\n");
        celular1.checarCarga();
        celular2.checarCarga();
        
        System.out.print("Celular1 :");celular1.estaOcupado();
        System.out.print("Celular2 :");celular2.estaOcupado();
        
    }
}
