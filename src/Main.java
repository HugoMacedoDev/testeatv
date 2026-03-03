import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE PAGAMENTO ===");

        // Pergunta o valor
        System.out.print("Digite o valor do pedido: ");
        double valor = scanner.nextDouble();

        // Escolha do tipo de pagamento
        System.out.println("\nEscolha o tipo de pagamento:");
        System.out.println("1 - Cartão");
        System.out.println("2 - Pix");
        System.out.println("3 - Boleto");

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        Pagamento pagamento = null;
31
        switch (opcao) {
            case 1:
                pagamento = new PagamentoCartao();
                break;
            case 2:
                pagamento = new PagamentoPix();
                break;
            case 3:
                pagamento = new PagamentoBoleto();
                break;
            default:
                System.out.println("Opção inválida!");
                System.exit(0);
        }

        ProcessadorPagamento processador = new ProcessadorPagamento(pagamento);
        processador.processar(valor);

        scanner.close();
    }
}