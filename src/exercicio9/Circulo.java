package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Circulo extends Figura2D {

    private Double raio;
    private Double diametro;
    private Double PI = 3.14;

    public Circulo() {
    }

    public Circulo(Double raio, String nome, String cor) {
        super(nome, cor);
        this.raio = raio;
        this.diametro = raio*2;
    }       
    
    @Override
    public Double calcularPerimetro(){
        return (2 * PI) * this.raio;
    }
    
    @Override
    public Double calcularArea() {
        return PI * (this.raio*this.raio);
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getDiametro() {
        return diametro;
    }
}
