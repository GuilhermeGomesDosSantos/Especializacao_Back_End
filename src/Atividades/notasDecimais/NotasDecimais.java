/*
Crie um programa que realize a média de duas notas decimais e exiba o resultado.
 */

package Atividades.notasDecimais;

public class NotasDecimais {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 8;

        double media = (double) (n1 + n2) / 2;

        System.out.println("A média das Notas N1:" + n1 + " e N2:" + n2 + " é igual a:" + media);
    }
}
