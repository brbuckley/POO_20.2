package poo_ex5.Ex_57;

/*Enunciado
Desenvolva um programa capaz de armazenar e recuperar de um arquivo de formato 
binário as informações relativas ao número de registro de um funcionário, o 
nome do funcionário, o número de seu departamento e o número do departamento 
gerenciado. 
 */

/* IDEIA
4 bytes para o num registro, 12 bytes para o nome, 4 bytes para departamento e 
4 para departamento gerenciado. Padronizar registros de 24 bytes.
*/

public class main_ex57 {
    
    public static void main(String args[]){
        //Completar o caminho para funcionar corretamente
        String caminho= "C:\\ ... \\src\\poo_ex5\\Ex_57\\RegistroFuncionarios.txt";
        Funcionario teste= new Funcionario(214,"Joel",2198,291874);
        ArquivoFuncionario.Write(caminho, teste);
        
        //ArquivoFuncionario.Read(caminho);
        
        
    }
}
