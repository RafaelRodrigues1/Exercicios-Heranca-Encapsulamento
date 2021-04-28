package exercicio11;

/**
 *Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). 
 *Ao final, mostrar a etiqueta de preço de cada produto na mesma ordem em que foram digitados.
 *Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e
 *produtos usados possuem data de fabricação. Para produtos importados, a taxa de 
 *alfândega deve será acrescentada ao preço final do produto.
 *@author RafaelRodrigues1
 */
import java.text.ParseException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Scanner in = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();
        
        System.out.print("Insira o número de produtos: ");
        int num = in.nextInt();
        in.nextLine();
        for(int i=0; i<num; i++){
            System.out.println("Dados do produto #" + (i+1));
            System.out.print("Comum, importado ou usado?(c/u/i) ");
            String tipo = in.nextLine();
            System.out.print("Nome: ");
            String nome = in.nextLine();
            System.out.print("Preço: R$");
            Double preco = in.nextDouble();
            in.nextLine();
            if(tipo.equalsIgnoreCase("I")){
                System.out.print("Taxa de alfândega: R$");
                Double taxaAlfandega = in.nextDouble();
                in.nextLine();
                listaProdutos.add(new ProdutoImportado(taxaAlfandega, nome, preco));
            }else if(tipo.equalsIgnoreCase("u")){
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String dataFabricacao = in.nextLine();
                listaProdutos.add(new ProdutoUsado(dataFabricacao, nome, preco));
            }else{
                listaProdutos.add(new Produto(nome, preco));
            }
        }
        System.out.println("\nEtiquetas de preço: ");
        for(Produto prod: listaProdutos){
            System.out.println(prod.etiquetaPreco());
        }
    }
}
