import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jose";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        System.out.println("***********************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + String.format("%.2f", saldo));
        System.out.println("***********************");

        String menu = """
                Digite sua opção
                1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair
                
                """;
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("O saldo atualizado é: " + String.format("%.2f", saldo));
                case 2 -> {
                    System.out.println("Qual o valor que deseja transferir?");
                    double valor = leitura.nextDouble();
                    if (valor > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valor;
                        System.out.println("Novo saldo: " + String.format("%.2f", saldo));
                    }
                }
                case 3 -> {
                    System.out.println("Valor recebido: ");
                    double valor = leitura.nextDouble();
                    saldo += valor;
                    System.out.println("Novo saldo: " + String.format("%.2f", saldo));
                }
                case 4 -> System.out.println("Saindo...");
                default -> System.out.println("Opção Inválida");
            }
        }

        leitura.close();
    }
}
