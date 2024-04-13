/*
Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
 */

package Atividades.PrecoProduto;

public class PrecoProduto {
    public static void main(String[] args) {
        double precoProduto = 1500.00;
        int quantidade = 3;

        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor do Produto(" + precoProduto + ") Multiplicado por " + quantidade + " é: " + valorTotal);
    }
}