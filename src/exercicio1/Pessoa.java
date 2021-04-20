package exercicio1;

/**
 * b) Usando herança, criar as classes Pessoa, Aluno e Funcionário
 *c) Usando Delegação, criar na classe Pessoa o atributo 
 * Data de Nascimento do tipo Data (classe do item a)
 * @author RafaelRodrigues1
 */
public abstract class Pessoa {
    
    String nome;
    Data dataNascimento;
    
    public Pessoa(String nome, Data dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
