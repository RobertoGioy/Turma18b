import java.util.Scanner;

public class URI1064 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        final int LIMITE = 6;
        float num, media = 0, soma = 0;
        int count = 0;
        boolean positivo;

        for (int i = 0; i < LIMITE; i++) {
            num = captura.nextFloat();
            positivo = ehPositivo(num);
            
            if (positivo == true) {
                soma += num;
                count ++;
            }            
        }
        media = calculaMedia(soma, count);    
        System.out.printf("%d valores positivos\n", count);
        System.out.printf("%.1f\n",media);

        captura.close();
    }

    static boolean ehPositivo (float num) {
        if (num >= 0) {
            return true;
        }
        return false;
    }

    static float calculaMedia (float valor, int contador) {
        return (valor / contador);
    }
}
