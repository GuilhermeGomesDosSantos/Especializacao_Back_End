/*
Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
*/

package Atividades.Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int num;

        System.out.println("Digite um número para criar a Tabuada");

        num = leitura.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + " X " + i + " = " + num * i);
        }
    }
}