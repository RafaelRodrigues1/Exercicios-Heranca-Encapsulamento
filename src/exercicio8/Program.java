package exercicio8;

/**
*A Receita Federal possui um cadastro dos contribuintes. Cada contribuinte possui nome.
*Escreva um programa para calcular o imposto a ser pago para 5 contribuintes.
*Os contribuintes podem ser:
*Pessoa Jurídica
*O imposto corresponde a 10% da renda bruta da empresa.
*Pessoa física(Renda bruta, Alíquota, Parcela a deduzir)
*0 a 1400 0% R$0
*1400,01 a 2100 10% R$100
*2100,01 a 2800 15% R$270
*2800,01 a 3600 25% R$500
*3600,01 ou mais 30% R$700
* @author RafaelRodrigues1
*/
public class Program {
    
    public static void main(String[] args) {
        
        PessoaFisica pf1 = new PessoaFisica("Rafael", 3000.0);
        PessoaFisica pf2 = new PessoaFisica("Janaína", 1300.0);
        PessoaFisica pf3 = new PessoaFisica("Rebeca", 2000.0);
        PessoaJuridica pj1 = new PessoaJuridica("Lanches ltda.", 24000.0);
        PessoaJuridica pj2 = new PessoaJuridica("Casa das peças", 50000.0);
        PessoaJuridica pj3 = new PessoaJuridica("Cabelereira Neuza", 5000.0);
        
        System.out.println(pf1.toString());
        System.out.println(pf2.toString());
        System.out.println(pf3.toString());
        System.out.println(pj1.toString());
        System.out.println(pj2.toString());
        System.out.println(pj3.toString());      
    }
}
