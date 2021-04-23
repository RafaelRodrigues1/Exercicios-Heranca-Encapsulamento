package exercicio5;

/**
 *Escreva a classe ConversaoUnidadesTempo com métodos estáticos	
  para conversão aproximada das unidades de tempo.
 * @author RafaelRodrigues1	
 */
public class ConversaoUnidadeTempo {
    
    public static String minutoParaSegundo(Integer num){
        return num + " minuto(s) = " + num * 60 + " segundos";
    }
    
    public static String horaParaMinuto(Integer num){
        return num + " hora(s) = " + num * 60 + " minutos";
    }
    
    public static String diaParaHora(Integer num){
        return num + " dia(s) = " + num * 24 + " horas";
    }
    
    public static String semanaParaDia(Integer num){
        return num + " semana(s) = " + num * 7 + " dias";
    }
    
    public static String mesParaDia(Integer num){
        return num + " mes(es) = " + num * 30 + " dias";
    }
    
    public static String anoParaDia(Integer num){
        return num + " ano(s) = " + num * 365.25 + " dias";
    }
    
}
