package uri;

import java.util.Scanner;

public class URI1037 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resposta;
   
        float valor;
        valor = teclado.nextFloat();

        if ((valor < 0.0)  || (valor > 100.0)) {
            resposta= "Fora de intervalo";
        } else if ((valor >= 0) && (valor <= 25.0)) {
            resposta= "Intervalo [0,25]";
        } else if ((valor > 25.0) && (valor <= 50.0)) {
            resposta= "Intervalo (25,50]";
        } else {
            resposta= "Intervalo (75,100]";
        }

        System.out.println(resposta);
        teclado.close();
    }
}
