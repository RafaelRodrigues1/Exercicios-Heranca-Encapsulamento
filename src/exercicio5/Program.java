package exercicio5;

/**
 *Escreva a classe ConversaoUnidadesTempo com métodos estáticos	
  para conversão aproximada das unidades de tempo.
 * @author RafaelRodrigues1
 */
public class Program {
    
    public static void main(String[] args) {
        
        System.out.println(ConversaoUnidadeTempo.minutoParaSegundo(5));
        System.out.println(ConversaoUnidadeTempo.horaParaMinuto(5));
        System.out.println(ConversaoUnidadeTempo.diaParaHora(5));
        System.out.println(ConversaoUnidadeTempo.semanaParaDia(5));
        System.out.println(ConversaoUnidadeTempo.mesParaDia(5));
        System.out.println(ConversaoUnidadeTempo.anoParaDia(5));
    }
}
