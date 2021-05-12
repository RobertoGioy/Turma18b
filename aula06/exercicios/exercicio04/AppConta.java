package exercicio04;

import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao, numConta;
        double limite, valor;
        
        GerenciaContas contas = new GerenciaContas();

        do {
            System.out.println("1. Abrir Conta Corrente");
            System.out.println("2. Abrir Conta Poupança");
            System.out.println("3. Abrir Conta Especial");
            System.out.println("4. Realizar depósito");
            System.out.println("5. Realizar Saque");
            System.out.println("6. Exibir Saldo");
            System.out.println("7. Sair do menu");

            opcao = input.nextInt();
        } while (opcao != 7);

        switch (opcao) {
            case 1:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                contas.criarContaCorrente(numConta);             
                break;
            case 2:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                contas.criarContaPoupanca(numConta);
                break;
            case 3:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o limite:");
                limite = input.nextDouble();
                contas.criarContaEspecial(numConta, limite);
                break;
            case 4:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o valor:");
                valor = input.nextDouble();
                contas.fazerDeposito(numConta, valor);
                break;
            case 5:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                System.out.println("Informe o valor:");
                valor = input.nextDouble();
                contas.fazerSaque(numConta, valor);
                break;
            case 6:
                System.out.println("Informe o número da conta:");
                numConta = input.nextInt();
                contas.exibirSaldo(numConta);
                break;
            default:
                break;
        }

        input.close();
    }
}
