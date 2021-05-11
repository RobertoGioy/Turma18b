package exercicio04;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(int numConta, double limite) {
        super(numConta);
        this.limite = limite;
    }

    @Override
    public boolean realizarSaque(double valor) {
        if (valor < getSaldo() + limite) {
            return super.realizarSaque(valor);
        }
        return false;
    }

    @Override
    public String toString () {
        return "CE: " + super.toString() + ", limite: " + limite;
    }
}
