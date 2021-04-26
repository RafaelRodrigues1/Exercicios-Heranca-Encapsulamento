package exercicio6;

/**
 *Escreva um método recursivo e estático que receba um	número inteiro positivo N e calcule o
 *somatório dos números de 1 a N.
 * @author RafaelRodrigues1
 */
public class SomaEmpilhada {
    
    public static Integer somar(Integer num){
        if(num==1){
            return num;
        }
        return num + somar(num-1);
    }
}
