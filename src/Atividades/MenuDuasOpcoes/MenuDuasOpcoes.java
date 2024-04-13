/*
Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.Calcular área do círculo".
Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
 */

package Atividades.MenuDuasOpcoes;

import java.util.Scanner;

public class MenuDuasOpcoes {
    public static void main(String[] args) {
        int opcao;
        double area;

        Scanner leitura = new Scanner(System.in);

        System.out.println("---Escolha uma das opções abaixo---\n" +
                "'1. Calcular área do quadrado'\n" +
                "'2. Calcular área do círculo'");

        opcao = leitura.nextInt();

        if (opcao == 1) {
            double comprimento;

            System.out.println("Digite o valor do comprimento");
            comprimento = leitura.nextDouble();

            area = comprimento * comprimento;
            System.out.println("A area do quadrado é: " + area);

        } else if (opcao == 2) {
            double circunferencia;

            System.out.println("Digite o valor da circunferencia do circulo");
            circunferencia = leitura.nextDouble();

            area = 3.14 * (circunferencia * circunferencia);
            System.out.println("A Area do circulo é: " + area);
        }

    }
}
