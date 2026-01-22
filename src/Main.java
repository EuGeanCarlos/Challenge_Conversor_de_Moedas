import java.util.Scanner;

public class Main {

    // Enum com as opções de conversão (OO simples e limpo)
    private enum ConversionOption {
        BRL_TO_USD(1, "BRL", "USD", "BRL → USD"),
        USD_TO_BRL(2, "USD", "BRL", "USD → BRL"),
        BRL_TO_EUR(3, "BRL", "EUR", "BRL → EUR"),
        EUR_TO_BRL(4, "EUR", "BRL", "EUR → BRL"),
        BRL_TO_GBP(5, "BRL", "GBP", "BRL → GBP"),
        GBP_TO_BRL(6, "GBP", "BRL", "GBP → BRL");

        private final int code;
        private final String from;
        private final String to;
        private final String label;

        ConversionOption(int code, String from, String to, String label) {
            this.code = code;
            this.from = from;
            this.to = to;
            this.label = label;
        }

        public int getCode() { return code; }
        public String getFrom() { return from; }
        public String getTo() { return to; }
        public String getLabel() { return label; }

        public static ConversionOption fromCode(int code) {
            for (ConversionOption option : values()) {
                if (option.code == code) return option;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===================================");
        System.out.println("  CONVERSOR DE MOEDAS - JAVA");
        System.out.println("  Challenge Alura + ONE");
        System.out.println("===================================");

        while (true) {
            exibirMenu();

            int opcao = lerInteiro(scanner, "Escolha uma opção: ");
            if (opcao == 0) {
                System.out.println("Encerrando o programa. Até mais!");
                break;
            }

            ConversionOption selected = ConversionOption.fromCode(opcao);
            if (selected == null) {
                System.out.println("❌ Opção inválida. Tente novamente.");
                continue;
            }

            double valor = lerDoublePositivo(scanner, "Digite o valor para converter: ");

            // Por enquanto: resultado simulado (só pra validar o fluxo)
            // Na próxima etapa a gente troca isso pela chamada da API.
            double taxaFake = 1.23; // placeholder
            double resultado = valor * taxaFake;

            System.out.println("\n✅ Conversão selecionada: " + selected.getLabel());
            System.out.printf("Valor: %.2f %s%n", valor, selected.getFrom());
            System.out.printf("Taxa (simulada): %.4f%n", taxaFake);
            System.out.printf("Resultado: %.2f %s%n", resultado, selected.getTo());
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

    private static int lerInteiro(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim();
            try {
                return Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Digite um número inteiro.");
            }
        }
    }

    private static double lerDoublePositivo(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String entrada = scanner.nextLine().trim().replace(",", ".");
            try {
                double valor = Double.parseDouble(entrada);
                if (valor <= 0) {
                    System.out.println(" Digite um valor maior que zero.");
                    continue;
                }
                return valor;
            } catch (NumberFormatException e) {
                System.out.println(" Entrada inválida. Digite um número (ex: 10.50).");
            }
        }
    }
}
