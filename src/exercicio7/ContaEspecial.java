package exercicio7;

/**
* ContaEspecial
• atributo limite
• sobrescreva o método sacar com a nova lógica necessária
* @author RafaelRodrigues1
*/
public class ContaEspecial extends ContaBancaria {
    
    private Double limite;

    public Double getLimite() {
        return limite;
    }

    public ContaEspecial() {
    }

    public ContaEspecial(String nomeCliente, Integer numConta, Double saldo, Double limite) {
        super(nomeCliente, numConta, saldo);
        this.limite = limite;
    }
    
    @Override
    public void sacar(Double valor){
        if(valor <= this.saldo + this.limite){
           this.saldo -= valor + 5;
        }else{
            System.out.println("Valor desejado não disponível para saque");
        }  
    }
    
    public String toString() {
        return "ContaEpecial\nNomeCliente - \t\t" + nomeCliente + 
                "\nNúmero da Conta - \t" + numConta + 
                "\nSaldo - \t\tR$" + saldo;
    }
    
    public void setLimite(Double limite) {
        this.limite = limite;
    }
}
