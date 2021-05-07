package exemplos;

public class Exemplo05 {
    public static void main(String[] args) {
        double valor;

        valor = 12.6786789;

        //System.out.printf(FORMATO, VALORES OU VARIAVEIS)
        /*
            %d = numeros inteiros
            %f = numeros com decimal
            %s = string
        */

        System.out.printf("O valor inteiro é %d\n", 12);
        System.out.printf("O valor decimal é %.2f\n", valor);

        System.out.printf("%03d\n", 1);
        System.out.printf("%03d\n", 10);
        System.out.printf("%03d\n", 100);
    }
}
