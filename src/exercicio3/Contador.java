package exercicio3;

/**
 * Escreva uma classe chamada Contador, que tem um atributo estático que	
  é incrementado sempre que a classe for instanciada. Crie métodos para	
  zerar, incrementar e retornar o valor do contador. Desenvolva um	
  programa para testar essa classe.
 * @author RafaelRodrigues1
 */
public class Contador {
    
    private static Integer contador=0;
    
    public Contador(){
        contador++;
    }
    
    public static void zerar(){
        contador = 0;
    }
    
    public static void incrementar(Integer num){
        contador += num;
    }

    public static String getContador() {
        return "Contador: " + contador;
    }
}
