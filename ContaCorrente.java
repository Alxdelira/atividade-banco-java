public class ContaCorrente extends Conta {

    public ContaCorrente(String nomeCliente) {
        super(nomeCliente);
    }

    public void sacarContaCorrente(float valor) {
        setSaldo(valor - 0.02f);

    }

}
