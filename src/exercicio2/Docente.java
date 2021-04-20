package exercicio2;

/**
 *o corpo docente (demonstrador, monitor, professor)
 * @author RafaelRodrigues1
 */
public class Docente extends Empregado {
    
    public Docente(String nome, double salario, String tipo){
        super(nome, salario);
        setTipoDocente(tipo);
    }
    
    public void setTipoDocente(String tipo){
        switch(tipo){
            case "demonstrador", "monitor", "professor" -> {
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
