package exercicio8;

/**
*Pessoa Jurídica
*O imposto corresponde a 10% da renda bruta da empresa.
* @author RafaelRodrigues1
*/
public class PessoaJuridica extends Contribuinte {

    public PessoaJuridica(String nome, Double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public Double calcularIR() {
        return super.rendaBruta * 0.1;
    }  
    
    @Override
    public String toString() {
        return super.toString() +
                "\nIR = R$" + calcularIR();
    }
}
