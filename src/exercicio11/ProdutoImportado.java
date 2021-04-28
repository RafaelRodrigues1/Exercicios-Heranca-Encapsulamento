package exercicio11;

/**
 * @author RafaelRodrigues1
 */
public class ProdutoImportado extends Produto {
    
    private Double taxaAlfandega;

    public ProdutoImportado() {
    }

    public ProdutoImportado(Double taxaAlfandega, String nome, Double preco) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double precoTotal(){
        return super.preco + this.taxaAlfandega;
    }
    
    @Override
    public String etiquetaPreco(){
        return super.nome + " R$" + String.format("%.2f", this.precoTotal()) +
                " (Taxa de alfândega: R$" + String.format("%.2f", this.taxaAlfandega) + ")";
    }
    
    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }
}
