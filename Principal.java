import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("=== Banco ===");
            System.out.println("1. Cadastrar Conta");
            System.out.println("2. Listar Contas existentes");
            System.out.println("3. Entrar em uma Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    banco.cadastrarCliente();
                    break;
                case 2:
                    banco.listarCliente();
                    break;
                case 3:
                    banco.entrarConta();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

            System.out.println();
        } while (opcao != 0);

        scanner.close();
    }

}