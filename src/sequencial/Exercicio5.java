package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod1, qtd1, cod2, qtd2;
        double valor1, valor2, total;

        cod1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = qtd1 * valor1 + qtd2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }
}
