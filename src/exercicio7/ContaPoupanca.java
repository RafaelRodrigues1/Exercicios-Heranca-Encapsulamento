package exercicio7;

import java.util.Calendar;

/**
* ContaPoupanca
• atributo diaRendimento
• método calcularNovoSaldo, recebe taxa de rendimento da poupança e 
* atualiza o saldo
* @author RafaelRodrigues1
*/
public class ContaPoupanca extends ContaBancaria {
    
    private Integer diaRendimento;
    private static final Double taxaRendimento = 0.5;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nomeCliente, Integer numConta, Double saldo, Integer diaRendimento) {
        super(nomeCliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }   
    
    public void calcularNovoSaldo(){
        Calendar cal = Calendar.getInstance();
        if(diaRendimento == cal.get(Calendar.DAY_OF_MONTH)){
            super.saldo += (super.saldo * (taxaRendimento/100));
        }    
    }
    
    @Override
    public void sacar(Double valor){
        if(valor <= this.saldo){
           this.saldo -= valor;
        }else{
            System.out.println("Valor desejado não disponível para saque");
        }  
    }
    
    @Override
    public String toString() {
        return "Conta Poupança\nNomeCliente - \t\t" + nomeCliente + 
                "\nNúmero da Conta - \t" + numConta + 
                "\nSaldo - \t\tR$" + saldo;
    }
    
    public static Double getTaxaRendimento() {
        return taxaRendimento;
    }  
    
    public Integer getDiaRendimento() {
        return diaRendimento;
    }       
}
