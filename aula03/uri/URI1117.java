import java.util.Scanner;

public class URI1117 {
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        float nota, media = 0;
        boolean validaNota;

        do {
            nota = captura.nextFloat();
            validaNota = validaNota(nota);

            if (validaNota) {
                media+= nota;
            }
            
        } while (nota < 0 || nota > 10);

        do {
            nota = captura.nextFloat();
            validaNota = validaNota(nota);

            if (validaNota) {
                media+= nota;
            }
            
        } while (nota < 0 || nota > 10);

        media = media / 2;

        System.out.printf("media = %.2f\n", media);

        captura.close();
    }

    static boolean validaNota (float nota) {
        if (nota >= 0 && nota <= 10) {
            return true;
        }
        System.out.println("nota invalida");
        return false;
    }
}
