/*
Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
 */

public class Soma {
    public static void main(String[] args) {
        int valor_1 = 10;
        int valor_2 = 5;
        int total = valor_1 + valor_2;

        System.out.println("O total de " + valor_1 + " + " + valor_2 + " é: " + total);
    }
}
