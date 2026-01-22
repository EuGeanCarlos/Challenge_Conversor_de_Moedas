import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        System.out.println("===================================");
        System.out.println("  CONVERSOR DE MOEDAS - JAVA");
        System.out.println("  Challenge Alura + ONE");
        System.out.println("===================================");

        while (opcao != 0) {
            exibirMenu();

            System.out.print("Escolha uma opção: ");
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("❌ Entrada inválida. Digite um número.");
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.println("BRL → USD (em desenvolvimento)");
                    break;
                case 2:
                    System.out.println("USD → BRL (em desenvolvimento)");
                    break;
                case 3:
                    System.out.println("BRL → EUR (em desenvolvimento)");
                    break;
                case 4:
                    System.out.println("EUR → BRL (em desenvolvimento)");
                    break;
                case 5:
                    System.out.println("BRL → GBP (em desenvolvimento)");
                    break;
                case 6:
                    System.out.println("GBP → BRL (em desenvolvimento)");
                    break;
                case 0:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("❌ Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void exibirMenu() {
        System.out.println("\n-------- MENU --------");
        System.out.println("1 - Converter BRL para USD");
        System.out.println("2 - Converter USD para BRL");
        System.out.println("3 - Converter BRL para EUR");
        System.out.println("4 - Converter EUR para BRL");
        System.out.println("5 - Converter BRL para GBP");
        System.out.println("6 - Converter GBP para BRL");
        System.out.println("0 - Sair");
        System.out.println("----------------------");
    }
}
