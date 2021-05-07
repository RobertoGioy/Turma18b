public class Exemplo02 {
    public static void main(String[] args) {
        linha(25, '-');
        System.out.println("Sistema de Cadastro");
        linha(25, '-');
        System.out.println("Menu");
        linha(5, '*');
    }

    static void linha (int tamanho, char tipo) {

        for (int i = 0; i < tamanho; i++) {
            System.out.print(tipo);
        }
        System.out.println();
    }
}
