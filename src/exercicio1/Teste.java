package exercicio1;

/**
 *f) Criar uma classe Teste com um menu para cadastrar aluno e funcionario.
 * @author RafaelRodrigues1
 */
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;
        List<Aluno> aluno = new ArrayList<>();
        List<Funcionario> funcionario = new ArrayList<>();
        
        do{
            System.out.println("--------CADASTRO--------");
            System.out.print("Digite 1 para cadastrar um aluno, 2 para cadastrar funcionário e 3 para sair:  ");
            opcao = Integer.parseInt(in.nextLine());
            
            switch(opcao){
                case 1 ->{
                    System.out.print("Nome do aluno: ");
                    String nome = in.nextLine();
                    System.out.print("Data de nascimento(dd/mm/aaaa): ");
                    Data dataNascimento = new Data(in.nextLine());
                    System.out.print("Matrícula: ");
                    int matricula = Integer.parseInt(in.nextLine());
                    System.out.print("Data da matrícula(dd/mm/aaaa): ");
                    Data dataMatricula = new Data(in.nextLine());
                    aluno.add(new Aluno(nome, dataNascimento, matricula, dataMatricula));
                    break;
                }
                case 2 ->{
                    System.out.print("Nome do funcionário: ");
                    String nome = in.nextLine();
                    System.out.print("Data de nascimento(dd/mm/aaaa): ");
                    Data dataNascimento = new Data(in.nextLine());
                    System.out.print("Cargo: ");
                    String cargo = in.nextLine();
                    System.out.print("Data de admissão(dd/mm/aaaa): ");
                    Data dataAdmissao = new Data(in.nextLine());
                    funcionario.add(new Funcionario(nome, dataNascimento, cargo, dataAdmissao));
                    break;
                }
                case 3 ->{
                    System.out.println("Saindo do menu");
                    break;
                }
                default -> {
                    System.out.println("Opção inválida!");
                    break;}
            }            
        }while(opcao!=3);
        for(Aluno i: aluno){
            System.out.println(i.toString());
        }
        for(Funcionario i: funcionario){
            System.out.println(i.toString());
        }
    }
            
}
