package exercicio4;

/**
 *Escreva uma classe Calculadora que tenha os seguintes métodos: somar,	
  subtrair, multiplicar, dividir (dois números), elevar à potência n
  e calcular o factorial de um	número.
  Desenvolva um programa para testar essa classe.
 * @author RafaelRodrigues1
 */
public class Program {
    
    public static void main(String[] args) {
        
        System.out.println(Calculadora.somar(5, 2));
        System.out.println(Calculadora.subtrair(5, 2));
        System.out.println(Calculadora.multiplicar(5, 2));
        System.out.println(Calculadora.dividir(5, 2));
        System.out.println(Calculadora.elevarPotencia(5, 2)); 
        System.out.println(Calculadora.fatorial(5));
    }
}
