package exercicio10;

/**
 * @author RafaelRodrigues1
 */
public class Funcionario {
    
    protected String nome;
    protected Integer horas;
    protected Double valorHora;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer horas, Double valorHora) {
        this.nome = nome;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    public Double pagamento(){
        return this.horas*this.valorHora;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }  
    
    @Override
    public String toString(){
        return this.nome + "\t- R$" + String.format("%.2f", this.pagamento());
    }
}
