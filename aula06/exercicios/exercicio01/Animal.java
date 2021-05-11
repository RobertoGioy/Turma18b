package exercicio01;

/**
 * Animal
 */
public class Animal {
    private String nome, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public Animal (String nome, String raca, int anoNascimento, String nomeProprietario, String telefone) {
        proprietario = new Proprietario(nomeProprietario, telefone);
        this.nome = nome;
        this.raca = raca;
        this.anoNascimento = anoNascimento;
    }

    public String getDados () {
        return nome + ", " + raca + ", (" + anoNascimento + ") - " + proprietario.getDados();
    }
}