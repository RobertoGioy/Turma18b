package uri;

import java.util.Scanner;

public class URI1004 {
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);

        int valorA, valorB, prod;

        valorA = inputs.nextInt();
        valorB = inputs.nextInt();

        prod = valorA * valorB;

        System.out.println("PROD = " + prod);

        inputs.close();
    }
}
