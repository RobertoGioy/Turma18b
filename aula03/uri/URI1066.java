import java.util.Scanner;

public class URI1066 {
    public static void main(String[] args) {
        Scanner captura = new Scanner(System.in);
        final int LIMITE = 5;
        int num, par = 0, impar = 0, positivo = 0, negativo = 0, validaPositivo;
        boolean validaPar;

        for (int i = 0; i < LIMITE; i++) {
            num = captura.nextInt();
            
            // verifica se e positivo
            validaPositivo = ehPositivo(num);
            
            if (validaPositivo == 1 ) {
                positivo++;
            }
            if (validaPositivo == 2) {
                negativo++;
            }
            
            // verifica se e par
            validaPar = ehPar(num);
            if (validaPar == true) {
                par++;
            }
            if (validaPar == false) {
                impar++;
            }            
        }
        
        System.out.printf("%d valor(es) par(es)\n", par);
        System.out.printf("%d valor(es) impar(es)\n", impar);
        System.out.printf("%d valor(es) positivo(s)\n", positivo);
        System.out.printf("%d valor(es) negativo(s)\n", negativo);

        captura.close();
        
    }

    static int ehPositivo (int num) {
        if (num == 0) {
            return 0;
        }
        if (num > 0) {
            return 1;
        }
        return 2;
    }

    static boolean ehPar (int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
}
