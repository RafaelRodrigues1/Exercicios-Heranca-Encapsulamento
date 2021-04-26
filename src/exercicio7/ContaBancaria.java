package exercicio7;

/**
* Elabore uma classe ContaBancaria com os seguintes atributos:
• nomeCliente
• numConta
• saldo
* E os seguintes métodos:
• sacar (o saldo não pode ficar negativo)
• depositar
 * @author RafaelRodrigues1
 */
public class ContaBancaria {
    
    protected String nomeCliente;
    protected Integer numConta;
    protected Double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(String nomeCliente, Integer numConta, Double saldo) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public void sacar(Double valor){
        if(valor <= this.saldo){
           this.saldo -= valor + 3;
        }else{
            System.out.println("Valor desejado não disponível para saque");
        }  
    }

    @Override
    public String toString() {
        return "ContaBancaria\nNomeCliente - \t\t" + nomeCliente + 
                "\nNúmero da Conta - \t" + numConta + 
                "\nSaldo - \t\tR$" + saldo;
    }
     
    public void depositar(Double valor){
        this.saldo += valor;
    }
    
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }                
}
