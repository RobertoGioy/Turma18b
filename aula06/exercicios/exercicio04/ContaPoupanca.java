package exercicio04;

public class ContaPoupanca extends Conta {
    private static double taxa;

    public ContaPoupanca (int numConta) {
        super(numConta);
    }

    public static void setTaxa (double taxa) {
        if (taxa > 0) {
            ContaPoupanca.taxa = taxa;
        }
    }

    @Override
    public boolean realizarSaque (double valor) {
        if (getSaldo() >= valor + taxa) {
            return super.realizarSaque(valor+taxa);
        }
        return false;
    }

    @Override
    public String toString () {
        return "CP: " + super.toString() + ", taxa: " + taxa;
    }
}
