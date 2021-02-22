package poo_ex2.EX_27;

import java.util.Scanner;

/*Enunciado
7- Identifique e implemente as classes em Java para a seguinte especificação:
O supermercado vende diferentes tipos de produtos. Cada produto tem um preço e 
uma quantidade em estoque. Um pedido de um cliente é composto de itens, onde 
cada item especifica o produto que o cliente deseja e a respectiva quantidade. 
Esse pedido pode ser pago em dinheiro, cheque ou cartão.
 */
public class main_ex27 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        //criacao de um mercado com produtos
        Mercado mercado =new Mercado();
        mercado.setMercado(1, "Guanabara",10000);
        mercado.setProdutos(  "109213 Arroz 5 47 "
                            + "498239 Feijao 2 21 "
                            + "214094 Bife 40 18 "
                            + "123409 Batata 1 194 "
                            + "124093 CocaCola 8 124");
        
        Carrinho carrinho=new Carrinho();
        
        String entrada;
        String[] stringSplit;
        int codigo;
        
        //supondo que o cliente tenha feito um cadastro antes
        Cliente cliente=new Cliente();
        cliente.setCliente("Ana", 300, 0); 
        
        //ToDo loop
        while(true){
            
            //adicionando os produtos pedidos ao carrinho
            System.out.print("Informe o nome do produto que deseja comprar seguido da quantidade: \n");
            entrada=scanner.nextLine();
            
            if (entrada.isBlank())break; //condicao de parada
            
            stringSplit=entrada.split(" ");

            codigo=mercado.gerarCodigo(stringSplit[0],Integer.parseInt(stringSplit[1]));//pegando o codigo do produto usando a entrada do usuario
            if(codigo!=-1){//evitar bugs e entradas invalidas
                int preco=mercado.produtos.get(mercado.indexCodigo(codigo)).preco; //pegando o preço do produto pelo codigo para a funcao 'adicionarProduto'
                carrinho.adicionarProduto(codigo, Integer.parseInt(stringSplit[1]),preco);//adiciona produto no carrinho se estiver em estoque
            }
            else System.out.print("Produto fora do estoque\n");
        }
        
        //ToDo prints e confirmação de compra
        carrinho.imprimirCarrinho();
        if(carrinho.total>cliente.checarSaldo()){// if 'sem saldo' : print erro e finaliza
            System.out.print("\nSaldo Insuficiente\n"); 
        }
        System.out.print("\nDeseja finalizar a compra?\n"); 
        
        //ToDo finalizar compra
        //esperar uma resposta true de cliente.pagar()
        //lembrar de checar saldo do cliente antes de mercado.comprar()

    }
}
