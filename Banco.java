import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    private List<Conta> contas = new ArrayList<Conta>();
    Scanner leitor = new Scanner(System.in);

    public void cadastrarCliente() {
        System.out.println("Informe o Nome do Cliente: ");
        String nome = leitor.nextLine();
        Conta c = new Conta(nome);
        contas.add(c);

    }

    public void listarCliente() {
        for (Conta c : contas) {
            System.out.println("Nome: " + c.getClientes() + "Numero: " + c.getNumeros());
        }
    }

    public void entrarConta() {
        System.out.println("Informe o número da conta: ");
        int numeroConta = leitor.nextInt();
        leitor.nextLine();

        for (Conta c : contas) {
            if (c.getNumeros() == numeroConta) {
                System.out.println("Você entrou na conta: " + c.getNumeros() + " Nome: " + c.getClientes());
                return;
            }
        }
        System.out.println("Conta não encontrada.");
    }   

}
