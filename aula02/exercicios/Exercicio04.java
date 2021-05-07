
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        double salarioBruto, valorPrestacao;

        System.out.println("Valor do sálario bruto: ");
        salarioBruto = inputs.nextDouble();
        System.out.println("Valor da prestação pretendida: ");
        valorPrestacao = inputs.nextDouble();

        System.out.println(((salarioBruto * 0.3) >= valorPrestacao) ? "Seu empréstimo pode ser concedido" : "Empréstimo não autorizado");
  
        inputs.close();
    }
}
