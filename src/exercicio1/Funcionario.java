package exercicio1;

/**
 * b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
 *e) Na classe Funcionário deverá existir um atributo 
 * Data de Admissão que deverá ser do tipo Data (classe do item a)
 * @author RafaelRodrigues1
 */
public class Funcionario extends Pessoa {
    
    String cargo;
    Data dataAdmissao;
    
    public Funcionario(String nome, Data dataNascimento, String cargo, Data dataAdmissao){
        super(nome, dataNascimento);
        this.cargo = cargo;
        this.dataAdmissao = dataAdmissao;
    }
    
    @Override
    public String toString(){
        return "Nome do funcionário:\t" + this.nome +
                "\nData de Nascimento:\t" + this.dataNascimento +
                "\ncargo:\t\t\t" + this.cargo +
                "\nData da admissão:\t" + this.dataAdmissao + "\n";
    }
}
