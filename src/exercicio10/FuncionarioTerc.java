package exercicio10;

/**
 * @author RafaelRodrigues1
 */
public class FuncionarioTerc extends Funcionario {
    
    private Double despesaAdicional;

    public FuncionarioTerc() {
    }

    public FuncionarioTerc(Double despesaAdicional, String nome, Integer horas, Double valorHora) {
        super(nome, horas, valorHora);
        this.despesaAdicional = despesaAdicional;
    }
    
    @Override
    public Double pagamento(){
        return super.pagamento()+(this.despesaAdicional*=1.1);
    }
    
    public Double getDespesaAdicional() {
        return despesaAdicional;
    }

    public void setDespesaAdicional(Double despesaAdicional) {
        this.despesaAdicional = despesaAdicional;
    }
//    
//    @Override
//    public String toString(){
//        return this.nome + "\t- R$" + this.pagamento();
//    }
}
