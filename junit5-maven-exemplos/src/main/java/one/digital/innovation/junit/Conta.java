package one.digital.innovation.junit;

public class Conta {

    private String numeroConta;
    private int saldo;

    // copnstrutor
    public Conta(String numeroConta, int saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // getters
    public String getNumeroConta() {
        return numeroConta;
    }

    public int getSaldo() {
        return saldo;
    }
}
