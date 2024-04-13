/*
Crie um programa que solicite ao usuário digitar um número.
Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".
*/

package Atividades.PositivoNegativo;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um Número:");
        double numero = leitura.nextDouble();

        if (numero > -1) {
            System.out.println("O número '" + numero + "' é Positivo");
        } else {
            System.out.println("O número '" + numero + "' é Negativo");
        }
    }
}