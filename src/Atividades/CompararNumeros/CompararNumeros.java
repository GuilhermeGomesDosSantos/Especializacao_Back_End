/*
Peça ao usuário para inserir dois números inteiros.
Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.
*/

package Atividades.CompararNumeros;

import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o 1° Número");
        double primeiroNumero = leitura.nextDouble();

        System.out.println("Digite o 2° Número");
        double segundoNumero = leitura.nextDouble();

        if (primeiroNumero == segundoNumero) {
            System.out.println("O Primeiro número '" + primeiroNumero + "' e o Segundo número '" + segundoNumero +"' são:\n" + "Iguais");
        }
        else if (primeiroNumero > segundoNumero) {
            System.out.println("O Primeiro número '" + primeiroNumero + "' é Maior que o Segundo número '" + segundoNumero + "'");
            }
        else {
            System.out.println("O Segundo número '" + segundoNumero + "' é Maior que o Primeiro número '" + primeiroNumero + "'");
        }
    }
}
