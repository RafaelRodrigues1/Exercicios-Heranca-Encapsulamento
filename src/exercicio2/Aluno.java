package exercicio2;

/**
 *As fichas dos estudantes devem conter seu nome, seu
 *estatuto (aluno especial, tempo parcial, tempo integral) e sua média. Além do mais, é necessário
 *prever funções que poderão modificar o estatuto e a média.
 * @author RafaelRodrigues1
 */
public class Aluno extends Pessoa{
    private String estatuto;
    private double media;
    
    public Aluno(String nome, String estatuto, double media){
        super(nome);
        this.estatuto = estatuto;
        this.media = media;
    }
    
    public void setEstatuto(String estatuto){
        this.estatuto = estatuto;
    }
    
    public void setMedia(Double media){
        this.media = media;
    }
    
    @Override
    public String toString(){
        return "Nome do aluno:\t" + this.nome +
                "\nEstatuto:\t" + this.estatuto +
                "\nMédia: \t\t" + this.media;
    }
}
