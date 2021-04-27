package exercicio8;

/**
*A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.
* @author RafaelRodrigues1
*/
public abstract class Contribuinte {
    
    protected String nome;
    protected Double rendaBruta;

    public Contribuinte(String nome, Double rendaBruta) {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract Double calcularIR();   
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(Double rendaBruta) {
        this.rendaBruta = rendaBruta;
    }

    @Override
    public String toString() {
        return "Contribuinte " + 
                "\nNome = " + nome + 
                "\nRenda bruta = R$" + rendaBruta;
    }    
}
    

