package exercicio10;

/**
*Uma empresa possui funcionários próprios e terceirizados.
*Para cada funcionário, deseja-se registrar nome, horas
*trabalhadas e valor por hora. Funcionários terceirizado
*possuem ainda uma despesa adicional.
* 
*O pagamento dos funcionários corresponde ao valor da hora
*multiplicado pelas horas trabalhadas, sendo que os
*funcionários terceirizados ainda recebem um bônus
*correspondente a 110% de sua despesa adicional.
* 
*Fazer um programa para ler os dados de N funcionários (N
*fornecido pelo usuário) e armazená-los em uma lista. Depois
*de ler todos os dados, mostrar nome e pagamento de cada
*funcionário na mesma ordem em que foram digitados.
* @author RafaelRodrigues1
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        List<Funcionario> listaFunc = new ArrayList<>();
        
        System.out.print("Insira o número de funcionários: ");
        int num = in.nextInt();
        in.nextLine();
        for(int i=0; i<num; i++){
            System.out.println("Insira os dados do funcionário #" + (i+1));
            System.out.print("Terceirizado[Y/N]: ");
            String terc = in.nextLine();
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Horas: ");
            int horas = in.nextInt();
            System.out.print("Valor por hora: R$");
            double valorHora = in.nextDouble();
            in.nextLine();
            if(terc.equalsIgnoreCase("Y")){
                System.out.print("Despesa Adicional: R$");
                Double despesaAdicional = in.nextDouble();
                in.nextLine();
                listaFunc.add(new FuncionarioTerc(despesaAdicional, nome, horas, valorHora));
            }else{
                listaFunc.add(new Funcionario(nome, horas, valorHora));
            }
        }
        System.out.println("Pagamentos:");
        for(Funcionario func: listaFunc){
            System.out.println(func);
        }
    }
}
