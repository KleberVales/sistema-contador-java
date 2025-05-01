package app;

import service.ContadorService;
import exception.ContadorException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContadorService service = new ContadorService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== MENU CONTADOR ===");
            System.out.println("Valor atual: " + service.getValorAtual());
            System.out.println("1 ➕ Incrementar");
            System.out.println("2 ➖ Decrementar");
            System.out.println("3 🔄 Incrementar várias vezes");
            System.out.println("4 🔄 Decrementar várias vezes");
            System.out.println("5 🅾️ Zerar contador");
            System.out.println("0 ❌ Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> service.incrementarVariasVezes(1);
                    case 2 -> service.decrementarVariasVezes(1);
                    case 3 -> {
                        System.out.print("Quantas vezes incrementar? ");
                        int vezesInc = scanner.nextInt();
                        service.incrementarVariasVezes(vezesInc);
                    }
                    case 4 -> {
                        System.out.print("Quantas vezes decrementar? ");
                        int vezesDec = scanner.nextInt();
                        service.decrementarVariasVezes(vezesDec);
                    }
                    case 5 -> {
                        service.zerarContador();
                        System.out.println("✅ Contador zerado!");
                    }
                    case 0 -> {
                        System.out.println("Saindo...");
                        scanner.close();
                        System.exit(0);
                    }
                    default -> System.out.println("❌ Opção inválida!");
                }
            } catch (ContadorException e) {
                System.err.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Entrada inválida! Digite um número.");
                scanner.next(); // Limpa o buffer
            }
        }
    }
}