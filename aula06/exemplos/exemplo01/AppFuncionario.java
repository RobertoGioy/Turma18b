public class AppFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Arnaldo", 1000);
        Gerente gerente = new Gerente("Roberto", 1000, 12);

        funcionario.aumentaSalario(10);
        gerente.aumentaSalario(10);

        System.out.println(gerente.exibir());
        System.out.println(funcionario.exibir());
        System.out.println("-----------");
        System.out.println(funcionario.exibir());
        System.out.println(gerente.exibir());
    }
}
