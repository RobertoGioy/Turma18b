public class Gerente extends Funcionario {
    private int numFuncionarios;
    
    public Gerente (String nome, double salario, int numFuncionarios) {
        super(nome, salario); // super chama o construtor da classe base
        this.numFuncionarios = numFuncionarios;
    }

    @Override
    public String exibir () {
        return "Gerente " + super.exibir() + " - Qtde Funcionários: " + numFuncionarios;
    }

    @Override
    public String toString () {
        return "Gerente " + super.exibir() + " - Qtde Funcionários: " + numFuncionarios;
    }

    @Override
    public void aumentaSalario (double percent) {
        super.aumentaSalario(percent + 10.0);
    }
}
