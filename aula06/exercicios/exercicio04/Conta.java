package exercicio04;

public class Conta {
    private int numConta;
    private double saldo;

    public Conta (int numConta) {
        this.numConta = numConta;
        saldo = 0;
    }

    public boolean realizarDeposito (double valor) {
        if (valor > 0) {
            this.saldo += valor;
            return true;
        }
        return false;
    }

    public boolean realizarSaque (double valor) {
        if (valor > 0) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String toString () {
        return "Conta número : " + numConta + ", saldo: " + saldo;
    }

    public double getSaldo () {
        return this.saldo;
    }

    public int getConta () {
        return this.numConta;
    }
}
