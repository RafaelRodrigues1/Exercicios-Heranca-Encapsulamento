package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Triangulo extends Figura2D {

    private Double base;
    private Double altura;
    private Double lado1;
    private Double lado2;

    public Triangulo() {
    }

    public Triangulo(Double base, Double altura, String nome, String cor) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
    }  

    public Triangulo(Double base, Double altura, Double lado1, Double lado2, String nome, String cor) {
        super(nome, cor);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }    
    
    @Override
    public Double calcularArea() {
        return (altura * base)/2;
    }

    @Override
    public Double calcularPerimetro() {
        if(this.lado1!=null && this.lado2!=null){
            return base+lado1+lado2;
        }
        return -1.0;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
     
    
}
