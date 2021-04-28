package exercicio12;

/**
*Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
*são nome, renda anual e número de funcionários.
* @author RafaelRodrigues1
*/
public abstract class Contribuinte {
    
    protected String nome;
    protected Double rendaAnual;

    public Contribuinte() {
    }

    public Contribuinte(String nome, Double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
    
    public abstract Double calcularImposto();
    
    @Override
    public String toString(){
        return "Nome: " + getNome() +
                "\nRenda anual: R$" + String.format("%.2f", getRendaAnual());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }    
}