package exercicio2;

/**
 *o discente (escritório e manutenção)
 * @author RafaelRodrigues1
 */
public class Discente extends Empregado {
    
    public Discente(String nome, double salario, String tipo){
        super(nome, salario);
        setTipoDiscente(tipo);
    }
    
    public void setTipoDiscente(String tipo){
        switch(tipo){
            case "escritorio", "manuntencao" -> {
                setTipo(tipo);
                break;
            }
            default -> {
                System.out.println("Tipo inválido!");
                break;
            }
        }
    }
}
