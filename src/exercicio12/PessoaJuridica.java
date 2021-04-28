package exercicio12;

/**
*Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
*são nome, renda anual e número de funcionários.
* 
*Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
*funcionários, ela paga 14% de imposto.
*Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
*400000 * 14% = 56000.00 
* @author RafaelRodrigues1
*/
public class PessoaJuridica extends Contribuinte {
    
    private Integer funcionarios;

    public PessoaJuridica() {
    }

    public PessoaJuridica(Integer funcionarios, String nome, Double rendaAnual) {
        super(nome, rendaAnual);
        this.funcionarios = funcionarios;
    }
    
        @Override
    public Double calcularImposto() {
        Double ir = (getFuncionarios()>10) ? super.getRendaAnual()*0.14 : super.getRendaAnual()*0.16; //Operador ternário
        return ir;
    }

    public Integer getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(Integer funcionarios) {
        this.funcionarios = funcionarios;
    } 
    
    @Override
    public String toString(){
        return super.toString() +
                "\nNúmero de funcionários: " + getFuncionarios() +
                "\nImposto de renda: R$" + String.format("%.2f", calcularImposto());
    }
}