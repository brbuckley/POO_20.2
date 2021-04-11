package poo_ex6.Ex_63;

/*Ideia:
    Primeiro eu tento criar um cliente e adicionar um cpf a ele, depois tento 
inserir ele no cadastro.
*/
public class main_ex63 {
    
    public static void tentaAdicionar(CadastroCliente cadastro,String entrada){
        try{Cliente cliente=new Cliente();cliente.setCPF(entrada);System.out.print("Criado\n");
            try{cadastro.inserir(cliente);System.out.print("Inserido\n");
            }catch(RepositorioException ex){System.out.print(ex.getMessage());}
            catch(ClienteJaExistenteException ex){System.out.print(ex.getMessage());}
        }catch(DadoInvalidoException ex){System.out.print(ex.getMessage());}
    }
    
    public static void tentaBuscar(CadastroCliente cadastro, String entrada){
        try{cadastro.buscar(entrada);System.out.print("Encontrado\n");
        }catch(ClienteInexistenteException ex){System.out.print(ex.getMessage());}
    }
    
    public static void main(String args[]){
        
        CadastroCliente cadastro=new CadastroCliente();
        
        //tenta adicionar um cliente com cpf OK
        System.out.print("Adicionando Cliente 1:\n");
        tentaAdicionar(cadastro,"12345678900");
        
        //tenta adicionar um cliente com cpf ERRADO (muitos numeros)
        System.out.print("\nAdicionando Cliente 2:\n");
        tentaAdicionar(cadastro,"111222333444");
        
        //tenta adicionar um cliente com cpf ERRADO (com letras)
        System.out.print("\nAdicionando Cliente 3:\n");
        tentaAdicionar(cadastro,"meuCPFehEsse");
        
        //tenta adicionar um cliente com cpf ERRADO (igual ao numero 1)
        System.out.print("\nAdicionando Cliente 4:\n");
        tentaAdicionar(cadastro,"12345678900");
        
        //tenta adicionar um cliente com cpf OK
        System.out.print("\nAdicionando Cliente 5:\n");
        tentaAdicionar(cadastro,"12312312345");
        
        //Buscas
        System.out.print("\nBuscando cliente 1:\n");
        tentaBuscar(cadastro,"12345678900");
        
        System.out.print("\nBuscando cliente 2:\n");
        tentaBuscar(cadastro,"111222333444");
        
        System.out.print("\nBuscando cliente 5:\n");
        tentaBuscar(cadastro,"12312312345");
        
        System.out.print("\nClientes cadastrados :\n");
        cadastro.imprimir();
        
    }
}