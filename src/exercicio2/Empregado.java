package exercicio2;

/**
 *Os empregados são divididos em duas categorias: o corpo docente 
 * (demonstrador, monitor, professor) e o discente (escritório e manutenção). 
 * Para todos os empregados, nós devemos prever um campo salário e uma função que
 * permita fixar os salários.
 * @author RafaelRodrigues1
 */
public abstract class Empregado extends Pessoa {
    
    double salario;
    String tipo;
    
    public Empregado(String nome, double salario){
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return "\nNome:\t\t" + this.nome +
                "\nTipo:\t\t" + this.tipo +
                "\nSalário:\tR$" + this.salario;
    }    
}
