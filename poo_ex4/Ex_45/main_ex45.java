package poo_ex4.Ex_45;

/*Enunciado
5- Faça um programa de agenda que permita guardar dois tipos de contato: pessoa 
física e pessoa jurídica. Para pessoa física, guarde o nome, o CPF, o endereço 
e a data de aniversário. Para pessoa jurídica, guarde a razão social, o CNPJ, 
o endereço e o faturamento. Permita tanto listar todos os contatos da agenda 
quanto buscar um contato específico pelo seu CPF, se for pessoa física, ou pelo 
CNPJ, se for pessoa jurídica. Use herança e polimorfismo.
 */
public class main_ex45 {
    
    public static void main(String[]args){
        
        Agenda agenda=new Agenda();
        Fisica pessoa1=new Fisica("Ana","10/11/1992","11122233344","Rua 1");
        Fisica pessoa2=new Fisica("Bia","5/5/1985","12332122255","Rua 1");
        Juridica pessoa3=new Juridica("Coca Cola Indústrias Ltda",230840.24,"66633399901","Rua 1");
        Fisica pessoa4=new Fisica("Daniel","1/2/1973","12345678901","Rua 2");
        Juridica pessoa5=new Juridica("Empresa S.A.",302918.94,"00000000099","Rua 2");
        Juridica pessoa6=new Juridica("Fabrica & Cia",321098.00,"98765432102","Rua 2");
        
        agenda.adicionarContato(pessoa1);
        agenda.adicionarContato(pessoa2);
        agenda.adicionarContato(pessoa3);
        agenda.adicionarContato(pessoa4);
        agenda.adicionarContato(pessoa5);
        agenda.adicionarContato(pessoa6);
        
        //procurando pelo numero, independente se for cpf ou cnpj
        agenda.getContato("66633399901").imprimir();
        agenda.getContato("11122233344").imprimir();
        
        System.out.print("Todos os Contatos\n"+
                "-----------------------------------------------------\n");
        agenda.imprimir();
    }
    
}
