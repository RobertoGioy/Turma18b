package exercicio04;

import java.util.HashMap;

public class GerenciaContas {
    private HashMap<Integer, Conta> contas;

    public GerenciaContas() {
        contas = new HashMap<>();
    }

    public void criarContaCorrente(int numConta) {
        contas.put(numConta, new ContaCorrente(numConta));
    }

    public void criarContaEspecial(int numConta, double limite) {
        contas.put(numConta, new ContaEspecial(numConta, limite));
    }

    public void criarContaPoupanca(int numConta) {
        contas.put(numConta, new ContaPoupanca(numConta));
    }

    public boolean fazerDeposito(int numConta, double valor) {
        Conta objConta = contas.get(numConta);
        if (objConta != null) {
            return objConta.realizarDeposito(valor);
        }
        return false;
    }

    public boolean fazerSaque(int numConta, double valor) {
        Conta objConta = contas.get(numConta);
        if (objConta != null) {
            return objConta.realizarSaque(valor);
        }
        return false;
    }

    public String exibirSaldo(int numConta) {
        Conta objConta = contas.get(numConta);
        if (objConta != null) {
            return objConta.toString();
        }
        return "Conta não localizada";
    }
}
