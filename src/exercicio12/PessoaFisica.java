package exercicio12;

/**
*Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
*são nome, renda anual e número de funcionários.
* 
*Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
*renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
*destes gastos são abatidos no imposto.
*Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
*fica: (50000 * 25%) - (2000 * 50%) = 11500.00 
* @author RafaelRodrigues1
*/
public class PessoaFisica extends Contribuinte {
    
    private Double gastosSaude;

    public PessoaFisica() {
    }   

    public PessoaFisica(Double gastosSaude, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }
    
    @Override
    public Double calcularImposto() {   
        Double ir = (super.getRendaAnual()<20000) ? super.getRendaAnual()*0.15 : super.getRendaAnual()*0.25; //Operador ternário
        ir -= (getGastosSaude()*0.5);
        if(ir>=0){
            return ir;
        }else{
            return 0.0;
        }
        
    }
    
    @Override
    public String toString(){
        return super.toString() +
                "\nGastos com saúde: R$" + String.format("%.2f", getGastosSaude()) +
                "\nImposto de renda: R$" + String.format("%.2f", calcularImposto());
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }
}