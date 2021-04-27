package exercicio9;

/**
*Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva	uma classe	
*Figura2D e uma classe Figura3D. Ambas classes	Figura2D e Figura3D são subclasses	
*da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e Triangulo	
*que estendem a classe Figura2D e crie também as classes Cubo e Cilindro e Piramide 
*que estendem a classe Figura3D.
* @author RafaelRodrigues1
*/
public class FiguraGeometrica {
    
    protected String nome;
    protected String cor;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String nome, String cor) {
        this.nome = nome;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }   
}
