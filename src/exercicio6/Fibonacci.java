package exercicio6;

/**
 *Escreva um método recursivo e	estático que calcule e retorne o N-ésimo termo da sequência	
 *Fibonacci. Alguns números desta sequência são: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89...
 * @author RafaelRodrigues1
 */
public class Fibonacci {
    
    public static Integer calcular(Integer num){
        if(num<2){
            return num;
        }
        return calcular(num-1) + calcular(num-2);
    }
}
