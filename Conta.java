public class  Conta  {
    private String cliente;
    private int numero;
    private float saldo;
    private static int numeroGeral = 0;

    public Conta(String nomeCliente) {
        this.cliente = nomeCliente;
        this.saldo = 0;
        numeroGeral++;
        this.numero = numeroGeral;
    }

    public String getClientes() {
        return cliente;
    }

    public int getNumeros() {
        return numero;
    }

    public float getSaldoTotal() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float valor) {
        this.setSaldo(this.getSaldoTotal()+ valor);
    }
    public boolean sacar(float valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Valor Sacado com Sucesso!!");
            return true;
        } else {
            System.out.println("Saldo Insuficiente!");
            return false;
        }
    }

    public void transferir(Conta destino, float valor){
        if(sacar(valor)){
            destino.depositar(valor);
        };
    }




}
