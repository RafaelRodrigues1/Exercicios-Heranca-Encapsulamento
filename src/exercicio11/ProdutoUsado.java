package exercicio11;

/**
 * @author RafaelRodrigues1
 */
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;

public class ProdutoUsado extends Produto {
    
    private Date dataFabricacao;
    
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    
    public ProdutoUsado() {
    }

    public ProdutoUsado(String dataFabricacao, String nome, Double preco) throws ParseException {
        super(nome, preco);        
        this.dataFabricacao = df.parse(dataFabricacao);
    }
    
    @Override
    public String etiquetaPreco(){
        return super.nome + " (usado) R$" + String.format("%.2f", this.preco) +
                "(Data de fabricação: " + df.format(this.dataFabricacao) + ")";
                
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) throws ParseException {
        this.dataFabricacao = df.parse(dataFabricacao);
    }

    public SimpleDateFormat getDf() {
        return df;
    }

    public void setDf(SimpleDateFormat df) {
        this.df = df;
    }
    
}
