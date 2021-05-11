package exercicio03;

public class App {
    public static void main(String[] args) {
        Pessoa professor = new Professor("Emerson", "4444-4444", 80000);
        Pessoa estudante = new Estudante("Gioy", "2222-2222", "Java");

        System.out.println(professor.getTipo());
        System.out.println(professor);
        System.out.println(estudante.getTipo());      
        System.out.println(estudante);
    }
}
