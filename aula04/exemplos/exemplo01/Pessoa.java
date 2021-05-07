/**
 * Modelo de Pessoa
 */
public class Pessoa {

    // atributos = caracteristicas
    String nome;
    int idade;

    // metodo construtor = inicializar o objeto
    Pessoa(String nome, int idade) {
        this.nome = nome; // this = proprio objeto
        this.idade = idade;
    }

    // métodos = açoes
    void apresentar () {
        System.out.println("olá! Eu sou " + nome + " e tenho " + idade + " anos.");
    }
    
}