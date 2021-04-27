package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public abstract class Figura2D extends FiguraGeometrica implements DimensaoSuperficial {

    public Figura2D() {
    }

    public Figura2D(String nome, String cor) {
        super(nome, cor);
    }
   
    @Override
    public abstract Double calcularArea();   

    @Override
    public abstract Double calcularPerimetro();
}
