package poo_ex3.Ex_34;

/* A ideia e deixar a classe Data com todos os atributos necessarios para os 3
tipos de entrada, e na hora da construcao ja fazer as conversoes necessarias e
gerar os outros atributos que faltam.
 */
public class Data {
    
    //tipo DD/MM/AAAA
    private int [] ddmm={0,0,0};
    
    //tipo Mes, DD AAAA
    private String extenso0;
    private int extenso1=0;
    private int extenso2=0;
    
    //tipo DDD AAAA
    private int [] ddd={0,0};
    
    Data(int i0, int i1, int i2){
        this.ddmm[0]=i0;
        this.ddmm[1]=i1;
        this.ddmm[2]=i2;
        this.ddmmParaDdd();
        this.ddmmParaExtenso();
        
    }
    
    Data(int i0, int i1){
        this.ddd[0]=i0;
        this.ddd[1]=i1;
        this.dddParaDdmm();
        this.ddmmParaExtenso();
    }
    
    Data(String extenso, int i1, int i2){
        this.extenso0=extenso;
        this.extenso1=i1;
        this.extenso2=i2;
        this.extensoParaDdmm();
        this.ddmmParaDdd();
    }
    
    //Existem conversoes de todos os tipos para ddmm, e de ddmm para todos os tipos
    //por isso nao foi necessario implementar conversao ddd para extenso por exemplo
    
    final void ddmmParaDdd(){
        this.ddd[1]=this.ddmm[2];
        int cont;
        if((this.ddmm[2] % 400 == 0) || ((this.ddmm[2] % 4 == 0) && (this.ddmm[2] % 100 != 0))){
            for(int i=1; i<this.ddmm[1];i++){
                if (i==2) cont=3;
                else if (i==4 | i==6 | i==9 | i==11) cont=2;
                else cont=1;
                switch (cont){
                    case 1:
                        this.ddd[0]+=31;
                        break;
                    case 2:
                        this.ddd[0]+=30;
                        break;
                    case 3:
                        this.ddd[0]+=29;
                        break;
                }
            }
        }
        else{
            for(int i=0; i<this.ddmm[1];i++){
                if (i==2) cont=3;
                else if (i==4 | i==6 | i==9 | i==11) cont=2;
                else cont=1;
                switch (cont){
                    case 1:
                        this.ddd[0]+=31;
                        break;
                    case 2:
                        this.ddd[0]+=30;
                        break;
                    case 3:
                        this.ddd[0]+=28;
                        break;
                }
            }
        }
        this.ddd[0]+=this.ddmm[0];
    }
    
    final void ddmmParaExtenso(){
        this.extenso1=this.ddmm[0];
        this.extenso2=this.ddmm[2];
        switch(this.ddmm[1]){
            case 1:
                this.extenso0="Janeiro";
                break;
            case 2:
                this.extenso0="Fevereiro";
                break;
            case 3:
                this.extenso0="Março";
                break;
            case 4:
                this.extenso0="Abril";
                break;
            case 5:
                this.extenso0="Maio";
                break;
            case 6:
                this.extenso0="Junho";
                break;
            case 7:
                this.extenso0="Julho";
                break;
            case 8:
                this.extenso0="Agosto";
                break;
            case 9:
                this.extenso0="Setembro";
                break;
            case 10:
                this.extenso0="Outrubro";
                break;
            case 11:
                this.extenso0="Novembro";
                break;
            case 12:
                this.extenso0="Dezembro";
                break;
        }
    }
    
    final void dddParaDdmm(){
        this.ddmm[2]=this.ddd[1];
        int i=this.ddd[0];
        int cont=1;
        this.ddmm[1]++;
        if((this.ddmm[2] % 400 == 0) || ((this.ddmm[2] % 4 == 0) && (this.ddmm[2] % 100 != 0))){
            while(i>0){
                if (this.ddmm[1]==2) cont=3;
                else if (this.ddmm[1]+1==4 | this.ddmm[1]+1==6 | this.ddmm[1]+1==9 | this.ddmm[1]+1==11) cont=2;
                else cont=1;
                switch (cont){
                    case 1:
                        if (i>31) {
                            i-=31;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                    case 2:
                        if (i>30) {
                            i-=30;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                    case 3:
                        if (i>29) {
                            i-=29;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                }
            }
        }
        else{
            while(i>0){
                if (this.ddmm[1]==2) cont=3;
                else if (this.ddmm[1]+1==4 | this.ddmm[1]+1==6 | this.ddmm[1]+1==9 | this.ddmm[1]+1==11) cont=2;
                else cont=1;
                switch (cont){
                    case 1:
                        if (i>31) {
                            i-=31;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                    case 2:
                        if (i>30) {
                            i-=30;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                    case 3:
                        if (i>29) {
                            i-=28;
                            this.ddmm[1]++;
                        }
                        else i= i*(-1);
                        break;
                }
            }
        }        
        this.ddmm[0]+= i*(-1);
    }
    
    final void extensoParaDdmm(){
        this.ddmm[0]=this.extenso1;
        this.ddmm[2]=this.extenso2;
        switch(this.extenso0){
            case "Janeiro":
                this.ddmm[1]=1;
                break;
            case "Fevereiro":
                this.ddmm[1]=2;
                break;
            case "Março":
                this.ddmm[1]=3;
                break;
            case "Abril":
                this.ddmm[1]=4;
                break;
            case "Maio":
                this.ddmm[1]=5;
                break;
            case "Junho":
                this.ddmm[1]=6;
                break;
            case "Julho":
                this.ddmm[1]=7;
                break;
            case "Agosto":
                this.ddmm[1]=8;
                break;
            case "Setembro":
                this.ddmm[1]=9;
                break;
            case "Outrubro":
                this.ddmm[1]=10;
                break;
            case "Novembro":
                this.ddmm[1]=11;
                break;
            case "Dezembro":
                this.ddmm[1]=12;
                break;
        }
    }
    
    void imprimir(){
        System.out.print("\nO dia é: \n"
                +this.ddmm[0]+"/"+this.ddmm[1]+"/"+this.ddmm[2]+"\n"
                +this.extenso0+" "+this.extenso1+", "+this.extenso2+"\n"
                +this.ddd[0]+" "+this.ddd[1]+"\n\n");
    }
    
}
