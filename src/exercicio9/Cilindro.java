package exercicio9;

/**
 * @author RafaelRodrigues1
 */
public class Cilindro extends Figura3D {

    private Double raio;
    private Double altura;
    private Double PI = 3.14;
    private Double diametro; 

    public Cilindro() {
    }

    public Cilindro(Double raio, Double altura, String nome, String cor) {
        super(nome, cor);
        this.raio = raio;
        this.altura = altura;
        this.diametro = raio*2;
    }
    
    public Double areaBase(){
        return PI * (this.raio * this.raio);
    }
    
    public Double areaLado(){
        return (2 * PI) * this.raio * this.altura;
    }
    
    @Override
    public Double calcularVolume() {
       return this.areaBase() * this.altura;
    }

    @Override
    public Double calcularArea() {
        return (2 * this.areaBase()) + this.areaLado();
    }    

    @Override
    public Double calcularPerimetro() {
        return PI * this.diametro * this.altura;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPI() {
        return PI;
    }

    public void setPI(Double PI) {
        this.PI = PI;
    } 

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }   
}
