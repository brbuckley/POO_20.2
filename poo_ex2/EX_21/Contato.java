package poo_ex2.Ex_21;

class Contato {
    
    private String nome;
    private String telcel;
    private String telfix;
    
    Contato(){
        this.telcel="Vazio";
        this.telfix="Vazio";
        this.nome="Vazio";
    }
    
    Contato(String nome, String telcel){
        this.telcel=telcel;
        this.telfix="Vazio";
        this.nome=nome;
    }
    
    Contato(String nome, String telcel, String telfix){
        this.telcel=telcel;
        this.telfix=telfix;
        this.nome=nome;
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getTelcel(){
        return this.telcel;
    }
    
    String getTelfix(){
        return this.telfix;
    }
    
    void imprimir(){
        System.out.println("Nome "+this.nome+" Tel. cel. "+this.telcel+" Tel. fixo "+this.telfix);
    }
    
    public void setContato(String nome, String telcel, String telfix){
        this.setNome(nome);
        this.setTelcel(telcel);
        this.setTelfix(telfix);
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param telcel the telcel to set
     */
    public void setTelcel(String telcel) {
        this.telcel = telcel;
    }

    /**
     * @param telfix the telfix to set
     */
    public void setTelfix(String telfix) {
        this.telfix = telfix;
    }

}