/*
Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
Considere que o valor de 1 dólar é equivalente a 4.94 reais.
Realize a conversão do valor em dólares para reais e imprima o resultado formatado.
 */

package Atividades.ValorEmDolares;

public class ValorEmDolares {
    public static void main(String[] args) {
        double valorEmDolares = 4.92;

        double valorDolar = 4;
        double cotacaoAtualDolar = 4.94;
        double valorReais;
        valorReais = cotacaoAtualDolar * valorDolar;

        System.out.println("A cotação atual do dolar é: " + cotacaoAtualDolar + "\n" +
                "Convertendo U$:" + valorDolar + " para R$\n" +
                "O valor convertido de Dolar pra R$ é de R$: " + valorReais);
    }
}
