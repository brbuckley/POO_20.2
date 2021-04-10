package poo_ex6.Ex_63;

/*Ideia:
Criei a variavel topo, como em uma pilha, para facilitar insercao. Ja que foi 
pedido o uso de Array e nao encontrei metodos em Array para adicionar.
 */
public class CadastroCliente {
    
    Cliente clientes[]=new Cliente[10];
    int topo=-1;
    
    public void inserir(Cliente novo)throws RepositorioException,ClienteJaExistenteException{
        
        boolean jaExiste=false;
        for(int i=0;i<=this.topo;i++){
            if(this.clientes[i].getCPF().contentEquals(novo.getCPF())){
                jaExiste=true;
                break;
            }
        }
        
        if(this.topo==9)throw new RepositorioException();
        else if(jaExiste)throw new ClienteJaExistenteException();
        
        this.topo++;
        this.clientes[topo]=novo;
    }
    
    public Cliente buscar(String cpf)throws ClienteInexistenteException{
        int contador=0;
        for(int i=0;i<=this.topo;i++){
            if(this.clientes[i].getCPF().contentEquals(cpf)){
                break;
            }contador++;
        }if(contador>this.topo)throw new ClienteInexistenteException();
        return clientes[contador];
    }
    
    public void imprimir(){
        for(Cliente temp:this.clientes){if (temp!=null)temp.imprimir();}
    }
    
}
