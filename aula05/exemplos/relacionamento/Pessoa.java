package relacionamento;

public class Pessoa {
    private String nome;
    private int idade;
    private Endereco endereco;

    public Pessoa () {
        endereco = new Endereco();
    }

    public void exibir () {
        System.out.println(nome + ", " + idade);
        endereco.exibir();
    }
}
