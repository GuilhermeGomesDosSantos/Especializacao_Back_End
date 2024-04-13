package DesafioFinal;

import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner leitura = new  Scanner(System.in);

        String nome;
        String tipoConta;
        double salario;
        String info;

        System.out.println("Digite seu nome");
        nome = leitura.nextLine();

        System.out.println("Tipo de Conta");
        tipoConta = leitura.nextLine();

        System.out.println("Sálario");
        salario = leitura.nextDouble();

        info = """
                ******************************************
                Dados iniciais do Cliente:
                
                Nome:                   %s
                Tipo conta:             %s
                Saldo inicial:          %.2f
                ******************************************
                """.formatted(nome, tipoConta, salario);

        System.out.println(info);

        int opc = 0;

        while (opc != 4) {
            String opcoes =
                    """
                    Operações
                    
                    1 - Consultar saldos
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    """;
            System.out.println(opcoes);

            System.out.println("Digite a opção desejada");
            opc = leitura.nextInt();

            if (opc == 1) {
                System.out.println("Salario atual é: R$" + salario);

            } else if (opc == 2) {
                double deposito = 0;
                System.out.println("Informe o valor a receber");
                deposito = leitura.nextDouble();

                salario += deposito;

                System.out.println("Saldo atualizado R$" + salario);
            }

            else if (opc == 3) {
                double transferir = 0;

                System.out.println("Informe o valor a ser transferido");
                transferir = leitura.nextDouble();

                if (transferir > salario) {
                    System.out.println("Não há saldo suficiente para fazer essa transfêrencia");
                }

                salario -= transferir;
                System.out.println("Saldo atualizado R$" + salario);

            } else if (opc == 4) {
                break;

            } else {
                System.out.println("Opção Inválida!");
            }
        }

    }
}
