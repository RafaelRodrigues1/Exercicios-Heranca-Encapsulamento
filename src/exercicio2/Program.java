package exercicio2;

import java.util.ArrayList;
import java.util.List;

/**
 *Uma universidade deseja modificar a estrutura de sua base de dados. Para isso, ela quer construir a
hierarquia das pessoas que frequentam o estabelecimento com a ajuda de uma representação do tipo
OO (orientado objeto). A universidade deseja conservar o nome de todas as pessoas e dispõe de
uma função que lhe permite de inicializar e de modificar este membro dado. A universidade é
frequentada por estudantes e empregados. As fichas dos estudantes devem conter seu nome, seu
estatuto (aluno especial, tempo parcial, tempo integral) e sua média. Além do mais, é necessário
prever funções que poderão modificar o estatuto e a média. Os empregados são divididos em duas
categorias: o corpo docente (demonstrador, monitor, professor) e o discente (escritório e
manutenção). Para todos os empregados, nós devemos prever um campo salário e uma função que
permita fixar os salários.
 * @author RafaelRodrigues1
 */
public class Program {
    public static void main(String[] args) {
        
        List<Aluno> aluno = new ArrayList<>();
        List<Docente> docente = new ArrayList<>();
        List<Discente> discente = new ArrayList<>();
        
        aluno.add(new Aluno("João", "Aluno especial", 8));
        aluno.add(new Aluno("Lucas", "Tempo integral", 5));
        docente.add(new Docente("Fabio", 5800, "demonstrador"));
        docente.add(new Docente("Kleber", 3200, "professor"));
        discente.add(new Discente("Reginaldo", 10500, "escritorio"));
        discente.add(new Discente("Regivan", 110500, "manuntencao"));
        for(Aluno i: aluno){
            System.out.println(i.toString());
        }
        for(Docente i: docente){
            System.out.println(i.toString());
        }
        for(Discente i: discente){
            System.out.println(i.toString());
        }
                
    }
}
