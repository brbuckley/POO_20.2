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

        Rede rede = new Rede();
        
        Bateria bat1 = new Bateria(10, 100);
        Bateria bat2 = new Bateria(8, 50);
        
        Celular celular1 = new Celular(999999999, false, "MotoG", bat1);
        Celular celular2 = new Celular(923456789, false, "Iphone", bat2);
        
        rede.adicionarCelular(celular1);
        rede.adicionarCelular(celular2);
        
        celular1.checarCarga();
        celular2.checarCarga();
        celular1.mensagemTexto(rede, 923456789, "Teste\n");
        System.out.print("Mensagem enviada\n\n");
        
        celular1.checarCarga();
        celular2.checarCarga();
        System.out.print("Mensagem: "+celular2.checarCaixa()+"\n");
        
        String temp=new String();
        if(celular1.isOcupado())temp="Ocupado\n";
        else temp="Livre\n";
        System.out.print("Celular1 :"+temp);
        if(celular2.isOcupado())temp="Ocupado\n";
        else temp="Livre\n";
        System.out.print("Celular2 :"+temp);
        
        celular1.chamada(rede, 923456789, 10);
        System.out.print("Chamada iniciada\n\n");
        celular1.checarCarga();
        celular2.checarCarga();

        if(celular1.isOcupado())temp="Ocupado\n";
        else temp="Livre\n";
        System.out.print("Celular1 :"+temp);
        if(celular2.isOcupado())temp="Ocupado\n";
        else temp="Livre\n";
        System.out.print("Celular2 :"+temp);
        
    }
}
