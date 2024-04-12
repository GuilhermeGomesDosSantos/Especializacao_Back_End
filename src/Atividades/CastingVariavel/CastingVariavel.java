/*
Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
*/
package Atividades.CastingVariavel;

public class CastingVariavel {
    public static void main(String[] args) {
        double tipoDouble = 1.5;
        int tipoInteira;

        tipoInteira = (int) (tipoDouble);

        System.out.println("O Casting do valor da Variavel double '" + tipoDouble + "' para o valor Inteiro é: '" + tipoInteira + "'");
    }
}
