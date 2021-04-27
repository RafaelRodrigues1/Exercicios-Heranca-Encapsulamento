package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public abstract class Figura3D extends FiguraGeometrica implements DimensaoVolumetrica, DimensaoSuperficial {

    public Figura3D() {
    }

    public Figura3D(String nome, String cor) {
        super(nome, cor);
    }
    
    @Override
    public abstract Double calcularVolume();

    
    @Override
    public abstract Double calcularArea();
    
}
    
