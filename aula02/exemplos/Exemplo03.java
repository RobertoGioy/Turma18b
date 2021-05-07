
public class Exemplo03 {
    public static void main(String[] args) {
        String palavra1 = "Emerson";
        String palavra2 = "emerson";
        boolean iguais;

        iguais = palavra1.equals(palavra2);

        System.out.println((iguais) ? "Palavras iguais." : "Palavras diferentes.");

        System.out.println((palavra1.equalsIgnoreCase(palavra2)) ? "Palavras iguais." : "Palavras diferentes.");
    }
}
