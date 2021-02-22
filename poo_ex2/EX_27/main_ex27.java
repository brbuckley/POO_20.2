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
        
        //supondo que o cliente tenha feito um cadastro antes
        Cliente cliente=new Cliente();
        cliente.setCliente("Ana", 300, 0); 

        while(true){//adicionando os produtos pedidos ao carrinho
            
            System.out.print("Informe o nome do produto que deseja comprar seguido da quantidade: \n");
            entrada=scanner.nextLine();
            
            if (entrada.isBlank())break; //condicao de parada
            
            stringSplit=entrada.split(" ");

            carrinho.adicionarProduto(mercado.produtos.get(mercado.indexNome(stringSplit[0])),Integer.parseInt(stringSplit[1]));//adiciona produto no carrinho se estiver em estoque
        }
        
        carrinho.imprimirCarrinho();
        
        // Se o valor da compra for maior que o saldo do cliente
        while(carrinho.total>cliente.saldo){
            System.out.print("\nSaldo Insuficiente\n");
            System.out.print("\nDeseja remover algum produto? S/N\n");
            entrada=scanner.nextLine();
            
            if(entrada.matches("S")){
                System.out.print("Qual o nome do produto que deseja remover e quantos? (-1 para todos do mesmo item)\n");
                entrada=scanner.nextLine();
                stringSplit=entrada.split(" ");
                carrinho.removerProduto(stringSplit[0], Integer.parseInt(stringSplit[1]));
            }
            else if(entrada.matches("N")){
                System.out.print("Fim do Programa\n");
                return;
            }
            
            carrinho.imprimirCarrinho();
            
        }
        
        //Finalizando compra
        while(true){
            System.out.print("\nDeseja finalizar a compra? S/N\n"); 
            entrada=scanner.nextLine();

            if(entrada.matches("S")){
                if(mercado.tipoPagamentoAceito(carrinho.tipoPagamento))if(cliente.pagar(carrinho.total)){
                    mercado.comprar(carrinho);
                    System.out.print("Compra finalizada com sucesso!\n");
                    cliente.checarSaldo();
                    break;
                }
            }
            else if(entrada.matches("N")){//Caso o cliente queira remover algum produto
                while(true){

                    System.out.print("\nDeseja remover algum produto? S/N\n");
                    entrada=scanner.nextLine();

                    if(entrada.matches("S")){
                        System.out.print("Qual o nome do produto que deseja remover e quantos? (-1 para todos do mesmo item)\n");
                        entrada=scanner.nextLine();
                        stringSplit=entrada.split(" ");
                        carrinho.removerProduto(stringSplit[0], Integer.parseInt(stringSplit[1]));
                    }
                    else if(entrada.matches("N")){
                        break;
                    }
                }
            }
        }
    }
}
