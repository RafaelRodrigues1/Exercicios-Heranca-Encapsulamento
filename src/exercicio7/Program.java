package exercicio7;

/**
* Crie uma classe Teste que contenha a seguinte lógica:
• Criar contas
• Sacar um valor das contas
• Depositar
• Mostrar um novo saldo a partir de um rendimento
• Mostrar os dados da conta do cliente
* @author RafaelRodrigues1
*/
public class Program {
    
    public static void main(String[] args) {
        
        ContaBancaria cb = new ContaBancaria("Aloísio", 1234, 0.0);
        ContaPoupanca cp = new ContaPoupanca("Rafael", 1324, 0.0, 26);
        ContaEspecial ce = new ContaEspecial("Marília", 1432, 0.0, 500.0);
        
        System.out.println("------Depósitos------");
        cb.depositar(700.0);
        cp.depositar(300.0);
        ce.depositar(1200.0);
        System.out.println(cb.toString());
        System.out.println(cp.toString());
        System.out.println(ce.toString());
        
        System.out.println("--------Saques--------");
        cb.sacar(100.0);
        cp.sacar(100.0);
        ce.sacar(100.0);
        System.out.println(cb.toString());
        System.out.println(cp.toString());
        System.out.println(ce.toString());
        
        System.out.println("------Rendimento Poupança------");
        cp.calcularNovoSaldo();
        System.out.println(cp.toString());
    }
}
