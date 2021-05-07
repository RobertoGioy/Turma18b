import java.util.Scanner;

public class URI1114 {
    public static void main(String[] args) {
        Scanner captura = new Scanner (System.in);
        final int SENHACORRETA = 2002;

        int senha;        

        do {
            senha = captura.nextInt();
            System.out.println((senha == SENHACORRETA) ? "Acesso Permitido" : "Senha Invalida"); 
        } while (senha != SENHACORRETA);

        captura.close();
    }
}
