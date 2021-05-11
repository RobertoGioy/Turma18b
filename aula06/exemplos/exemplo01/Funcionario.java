public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario () {
        nome = "";
        salario = 0;
    }

    // overload
    public Funcionario (String nome) {
        this.nome = nome;
        salario = 0;
    }

    public Funcionario (String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String exibir () {
        return nome + ", " + salario;
    }

    @Override
    public String toString () {
        return nome + ", " + salario;
    }

    public void aumentaSalario (double percent) {
        salario += salario * percent / 100;
    }
}
