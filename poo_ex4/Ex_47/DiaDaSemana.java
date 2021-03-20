package poo_ex4.Ex_47;

import java.lang.Enum;

/*
 */
public enum DiaDaSemana{
    
        DOMINGO,SEGUNDA,TERCA,QUARTA,QUINTA,SEXTA,SABADO;

    
    public static boolean ehDiaUtil(DiaDaSemana dia){
        if( dia == DiaDaSemana.DOMINGO | dia == DiaDaSemana.SABADO) return false;
        return true;
    }
    
    public static void imprime(DiaDaSemana hoje){
        if(DiaDaSemana.ehDiaUtil(hoje))System.out.print("hoje eh um dia util\n");
        else System.out.print("hoje nao eh um dia util\n");
    }
}
