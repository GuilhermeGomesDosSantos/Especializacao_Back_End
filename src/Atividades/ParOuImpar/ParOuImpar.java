/*
Crie um programa que solicite ao usuário a entrada de um número inteiro.
Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
*/

package Atividades.ParOuImpar;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int num;

        System.out.println("Insira um número");
        num = leitura.nextInt();

        if (num % 2 == 0) {
            System.out.println("O Número informado '" + num + "' é o PAR");
        } else {
            System.out.println("O Número informado '" + num + "' é IMPAR");
        }
    }
}
