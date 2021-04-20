package exercicio1;

/**
 * b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
 *d) Na classe Aluno deverá existir um atributo Data da Matricula 
 * que deverá ser do tipo Data (classe do item a)
 * @author RafaelRodrigues1
 */
public class Aluno extends Pessoa {

    Data dataMatricula;
    int matricula;
    
    public Aluno(String nome, Data dataNascimento, int matricula, Data dataMatricula){
        super(nome, dataNascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
    @Override
    public String toString(){
        return "Nome do aluno:\t\t" + this.nome +
                "\nData de Nascimento:\t" + this.dataNascimento +
                "\nMatricula:\t\t" + this.matricula +
                "\nData da matrícula:\t" + this.dataMatricula + "\n";
    }
}
