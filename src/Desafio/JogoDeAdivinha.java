/*
Crie um programa que simula um jogo de adivinhação,
que deve gerar um número aleatório entre 0 e 100 e pedir para que o usuário tente adivinhar o número, em até 5 tentativas.
A cada tentativa, o programa deve informar se o número digitado pelo usuário é maior ou menor do que o número gerado.

Dicas:

Para gerar um número aleatório em Java: new Random().nextInt(100);
Utilize o Scanner para obter os dados do usuário;
Utilize uma variável para contar as tentativas;
Utilize um loop para controlar as tentativas;
Utilize a instrução break; para interromper o loop.
 */

package Desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinha {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitura = new Scanner(System.in);
        int numInformado = 0;
        int qtdTentativas = 0;

        System.out.println(numeroAleatorio);

        while (qtdTentativas < 5) {
            qtdTentativas++;

            System.out.println("Digite um número entre 0 a 100: ");
            numInformado = leitura.nextInt();
//            if (numeroAleatorio != numeroAleatorio) {
//                qtdTentativas++;
//            }
            if (numInformado == numeroAleatorio) {
                System.out.println("Parabens você acertou o número aleatorio: '" + numeroAleatorio + "'\n" +
                        "Com " + qtdTentativas + " tentativas");
                break;
            }
            else if (numInformado > numeroAleatorio) {
                System.out.println("Número aleatorio é menor");

            } else {
                System.out.println("Número aletorio é maior");
            }
        }

        if (qtdTentativas == 5 && numInformado != numeroAleatorio) {
            System.out.println("Infelizmente você não conseguiu acertar o Número aleatorio em 5 tentativas\n" +
                    "O Número aleatorio é: " + numeroAleatorio);
        }
    }
}
