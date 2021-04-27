package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Cubo extends Figura3D {

    private Double aresta;

    public Cubo() {
    }

    public Cubo(Double aresta, String nome, String cor) {
        super(nome, cor);
        this.aresta = aresta;
    }        
    
    @Override
    public Double calcularVolume() {
        return this.aresta * this.aresta * this.aresta;
    }

    @Override
    public Double calcularArea() {
        return 6 * (this.aresta * this.aresta);
    }   

    @Override
    public Double calcularPerimetro() {
        return aresta * 12; 
    }

    public Double getAresta() {
        return aresta;
    }

    public void setAresta(Double aresta) {
        this.aresta = aresta;
    }   
}
