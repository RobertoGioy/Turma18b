package exercicio04;

public class ContaCorrente extends Conta {
    
    public ContaCorrente (int numConta) {
        super(numConta);
    }

    @Override
    public boolean realizarSaque (double valor) {
        if (valor <= getSaldo()) {
            return super.realizarSaque(valor);
        }
        return false;
    }

    @Override
    public boolean realizarDeposito (double valor) {
        return super.realizarDeposito(valor - 0.1);
    }

    @Override
    public String toString () {
        return "CC: " + super.toString();
    }
}
