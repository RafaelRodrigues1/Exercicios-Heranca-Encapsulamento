package exercicio8;

/**
*Pessoa física(Renda bruta, Alíquota, Parcela a deduzir)
*0 a 1400 0% R$0
*1400,01 a 2100 10% R$100
*2100,01 a 2800 15% R$270
*2800,01 a 3600 25% R$500
*3600,01 ou mais 30% R$700
* @author RafaelRodrigues1
*/
public class PessoaFisica extends Contribuinte {

    
    
    public PessoaFisica(String nome, Double rendaBruta) {
        super(nome, rendaBruta);
    }

    @Override
    public Double calcularIR() {
        if(super.rendaBruta >= 3600.01){
            return (super.rendaBruta * 0.3) - 700;
        }else if(super.rendaBruta>=2800.01){
            return (super.rendaBruta * 0.25) - 500;
        }else if(super.rendaBruta>=2100.01){
            return (super.rendaBruta * 0.15) - 270;
        }else if(super.rendaBruta>=1400){
            return (super.rendaBruta * 0.1) - 100;
        }
        return 0.0;                    
    }  
    
    @Override
    public String toString() {
        return super.toString() +
                "\nIR = R$" + calcularIR();
    }
}
