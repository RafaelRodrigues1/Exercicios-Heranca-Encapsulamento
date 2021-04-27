package exercicio9;

import java.util.ArrayList;
import java.util.List;

/**
*Escreva uma classe FiguraGeometrica com atributos nome e cor. Escreva	uma classe	
*Figura2D e uma classe Figura3D. Ambas classes	Figura2D e Figura3D são subclasses	
*da classe FiguraGeometrica. Crie ainda as classes Circulo, Quadrado e Triangulo	
*que estendem a classe Figura2D e crie também as classes Cubo e Cilindro
*que estendem a classe Figura3D.
* 
* Escreva a interface DimensaoSuperficial que contém o método calcularArea. 
* Escreva a interface DimensaoVolumetrica que contém o método calcularVolume.	
* Aplique a interface DimensaoSuperficial em todas as subclasses de Figura2D	
* e Figura3D e aplique a interface DimensaoVolumetrica nas subclasses de Figura3D,	
* implementando	seus métodos de	acordo com as regras de cada figura geométrica(crie os atributos necessários).
* 
* Crie pelo menos uma instância de cada classe e adicione em um	array do tipo FiguraGeometrica.	
* Itere	esse array, imprimindo na tela a area e	o volume (quando aplicável). 
* @author RafaelRodrigues1
*/
public class Program {
    
    public static void main(String[] args) {
        
        Circulo ci1 = new Circulo(3.0, "Círculo", "Vermelho");
        Quadrado q1 = new Quadrado(5.0, "Quadrado", "Roxo");
        Triangulo t1 = new Triangulo(6.0, 7.0, 5.0, 8.0, "Triangulo", "Amarelo");
        Cubo c1 = new Cubo(7.0, "Cubo", "Roxo");
        Cilindro cil1 = new Cilindro(5.0, 6.0, "Cilindro", "Vermelho");
        
        List<FiguraGeometrica> lista = new ArrayList<>();
        lista.add(ci1);
        lista.add(q1);
        lista.add(t1);
        lista.add(c1);
        lista.add(cil1);
        
        for(FiguraGeometrica fig: lista){
                System.out.println(fig.nome);
            if(fig instanceof Figura2D){
                System.out.println("Área: \t\t" + ((Figura2D) fig).calcularArea() + "m²");
                System.out.println("Perímetro: \t" + ((Figura2D) fig).calcularPerimetro() + "m");
            } else if(fig instanceof Figura3D){
                System.out.println("Área: \t\t" + ((Figura3D) fig).calcularArea() + "m²");
                System.out.println("Perímetro: \t" + ((Figura3D) fig).calcularPerimetro() + "m");
                System.out.println("Volume: \t" + ((Figura3D) fig).calcularVolume() + "m³");
                if(fig instanceof Cilindro){
                    System.out.println("Área da base: \t" + ((Cilindro) fig).areaBase() + "m²");
                    System.out.println("Área do lado: \t" + ((Cilindro) fig).areaLado() + "m²");
                }
            }
        }
    }
}
