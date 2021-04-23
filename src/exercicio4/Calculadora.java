package exercicio4;

/**
 *Escreva uma classe Calculadora que tenha os seguintes métodos: somar,	
  subtrair, multiplicar, dividir (dois números), elevar à potência n.
  e calcular o factorial de um número.
  Desenvolva um programa para testar essa classe.
 * @author RafaelRodrigues1
 */
public abstract class Calculadora {
    
    
    public static Integer somar(Integer num1, Integer num2){
        return num1+num2;
    }
    
    public static Integer subtrair(Integer num1, Integer num2){
        return num1-num2;
    }
    
    public static Integer multiplicar(Integer num1, Integer num2){
        return num1*num2;
    }
    
    public static Double dividir(Integer num1, Integer num2){
        return (double)num1/num2;
    }
    
    public static Double elevarPotencia(Integer num1, Integer num2){
        Integer aux = 1;
        for(int i=0; i<num2; i++){
            aux *= num1;
        }
        return (double) aux;
    }
    
    public static Integer fatorial(Integer num){
        int aux=1;
        for(int i=1; i<=num; i++){
            aux *= i;
        }
        return aux;
    }
}
