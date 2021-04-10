package poo_ex6.Ex_63;

/*
 */
public class Cliente {
    
    private String CPF;
    
    public String getCPF(){
        return this.CPF;
    }
    
    public void setCPF(String cpf) throws DadoInvalidoException{
        //checar se todos sao digitos
        boolean ehDigito=true;
        for (char temp:cpf.toCharArray()){if(!Character.isDigit(temp))ehDigito=false;}
        
        if(cpf.length()>11)throw new DadoInvalidoException();//se tiver mais numeros que o maximo
        if(!ehDigito)throw new DadoInvalidoException();//se algum dos caracteres nao for um digito
        
        if(cpf.length()<11){//caso o CPF comece com 0 e a entrada nao digite os 0's
            this.CPF="0";
            for(int i=0;i+cpf.length()<10;i++){
                this.CPF+="0";
            }this.CPF+=cpf;
            return;
        }
        this.CPF=cpf;
    }
    
    public void imprimir(){
        if(this.CPF!=null)System.out.print("CPF: "+this.CPF+"\n");
    }
    
}
