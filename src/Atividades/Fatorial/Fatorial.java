/*
Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
*/

package Atividades.Fatorial;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num;
        int fatorial = 1;

        System.out.println("Digite um número para o Fatorial");
        num = leitura.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial *= i;
            System.out.println(i + " = " + fatorial);
        }
        System.out.println("O Fatorial de '" + num + "' é '" + fatorial + "'");
    }
}