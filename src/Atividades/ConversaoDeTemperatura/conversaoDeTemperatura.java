/*
Escreva um programa que converta uma temperatura em graus Celsius para Fahrenheit.
Utilize variáveis para representar os valores das temperaturas e imprima no console o valor convertido de Celsius para Fahrenheit.
Dica: A fórmula para converter temperaturas de graus Celsius para Fahrenheit é: (temperatura * 1.8) + 32.
 */

package Atividades.ConversaoDeTemperatura;

public class conversaoDeTemperatura {
    public static void main(String[] args) {
        int grauFahrenheit = 32;
        int grauCelsius = 22;

        double conversao = (grauCelsius * 1.8) + grauFahrenheit;

        System.out.println("A conversão de '" + grauCelsius + "' Graus Celsius para Fahrenheit é: '" + conversao + "'");
    }
}