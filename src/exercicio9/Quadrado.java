package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Quadrado extends Figura2D {

    private Double lado;

    public Quadrado() {
    }

    public Quadrado(Double lado, String nome, String cor) {
        super(nome, cor);
        this.lado = lado;
    }      
    
    @Override
    public Double calcularPerimetro() {
        return this.lado * 4;
    }
    
    @Override
    public Double calcularArea() {
        return this.lado * this.lado;
    } 

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }       
}
