package exercicio3;

/**
 *Escreva uma classe chamada Contador, que tem um atributo estático que	
  é incrementado sempre que a classe for instanciada. Crie métodos para	
  zerar, incrementar e retornar o valor do contador. Desenvolva um	
  programa para testar essa classe.
 * @author RafaelRodrigues1
 */
public class Program {
    
    public static void main(String[] args) {
        
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        System.out.println(Contador.getContador());
        Contador c3 = new Contador();
        Contador c4 = new Contador();
        System.out.println(Contador.getContador());
        Contador.incrementar(1);
        Contador.incrementar(2);
        System.out.println(Contador.getContador());
        Contador.zerar();
        System.out.println(Contador.getContador());
    }
}
