/*
Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
 */

package Atividades.PrecoOriginal;

public class PrecoOriginal {
    public static void main(String[] args) {
        double precoOriginal = 2500.00;
        double percentualDesconto = 15;
        double produtoComDesconto = precoOriginal * (percentualDesconto /100);
        double valorComDesconto = precoOriginal - ((precoOriginal) * percentualDesconto / 100);

        System.out.println("O preço original do produto é: " + precoOriginal + "R$\n" +
                "O desconto aplicado será de: " + percentualDesconto + "%" + "\n" +
                "Portando o valor Original do Produto: R$" + precoOriginal+ ", mais o desconto que é de R$" + produtoComDesconto + "\n" +
                "O seu total é de: R$" + valorComDesconto);
    }
}
