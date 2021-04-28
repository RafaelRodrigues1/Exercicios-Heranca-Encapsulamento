package exercicio11;

/**
 * @author RafaelRodrigues1
 */
public class Produto {
    
    protected String nome;
    protected Double preco;

    public Produto() {
    }

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String etiquetaPreco(){
        return this.nome + " R$" + String.format("%.2f", this.preco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }   
}
