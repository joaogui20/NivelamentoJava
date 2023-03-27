package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int cod, qtd;
        double valor;

        cod = sc.nextInt();
        qtd = sc.nextInt();

        if (cod == 1) {
            valor = (double) qtd * 4.00;
        } else if (cod == 2) {
            valor = (double) qtd * 4.50;
        } else if (cod == 3) {
            valor = (double) qtd * 5.00;
        } else if (cod == 4) {
            valor = (double) qtd * 2.00;
        } else {
            valor = (double) qtd * 1.50;
        }

        System.out.printf("Total: R$ %.2f%n", valor);

        sc.close();
    }
}
