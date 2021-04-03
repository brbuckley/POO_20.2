package poo_ex5.Ex_55;

import java.util.ArrayList;
import java.util.Scanner;

/* IDEIA
Entendi que deveria existir uma main dentro dessa classe para rodar e testar a
classe. Tambem foi adicionado imprimir() a Recebivel
 */
public class RegistroRecebimentos implements Recebivel{
    
    ArrayList<Recebivel> registros=new ArrayList<Recebivel>();
    
    //economiza algumas linhas na main e em menu
    public void addItemVenda(String produto, int quantidade, double precoUnitario){
        ItemVenda temp=new ItemVenda(produto, quantidade, precoUnitario);
        registros.add(temp);
    }
    
    public void addServico(String descricao, int horas, double precoHora){
        Servico temp=new Servico(descricao, horas, precoHora);
        registros.add(temp);
    }
    
    //implementacao de menu simples
    public void menu(){
        int menu=1;
        Scanner scanner= new Scanner(System.in);
        String[] split;
        while(menu>0){
            System.out.print("0 : Sair\n"
                            +"1 : Adicionar produto\n"
                            +"2 : Adicionar servico\n"
                            +"3 : Imprimir Registro\n\n");
            menu=Integer.parseInt(scanner.nextLine());
            if(menu==1){
                System.out.print("Informe o nome do produto, seguido da quantidade vendida, seguido do preco\n");
                split=scanner.nextLine().split(" ");
                this.addItemVenda(split[0], Integer.parseInt(split[1]), Double.parseDouble(split[2]));
            }else if(menu==2){
                System.out.print("Informe a descricao do servico, seguido das horas trabalhadas, seguido do preco cobrado por hora\n");
                split=scanner.nextLine().split(" ");
                this.addServico(split[0], Integer.parseInt(split[1]), Double.parseDouble(split[2]));
            }else if(menu==3){
                this.imprimir();
            }else break;
            
        }
    }
    
    @Override
    public void imprimir(){
        for(Recebivel temp:registros){
            temp.imprimir();
        }
        System.out.print("\nRegistro total de receitas : "+this.totalizarReceita()+" reais\n\n");
    }
    
    @Override
    public double totalizarReceita(){
        double cont=0;
        for(Recebivel temp:registros){
            cont+=temp.totalizarReceita();
        }
        return cont;
    }
    
    public static void main(String args[]){
        
        RegistroRecebimentos registro= new RegistroRecebimentos();
        
        /* //Testes
        registro.addItemVenda("CartuchoImpressora", 5, 59.99);
        registro.addServico("ConsertoNotebook", 3, 50);
        registro.addItemVenda("Mouse", 20, 159.99);
        registro.addServico("Formatacao", 2, 30);
        registro.addItemVenda("PlacaDeVideo", 30, 1490.00); // a placa de video ta cara, mas ta vendendo mt
        registro.addServico("Limpeza", 2, 40);
        
        registro.imprimir();
        */
        
        registro.menu(); //lembrar de testar nomes sem espaco para nao bugar
        
    }
    
}
