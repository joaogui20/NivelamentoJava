package condicional;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial, horaFinal;

        horaInicial = sc.nextInt();
        horaFinal = sc.nextInt();

        int totalHora;

        if (horaInicial < horaFinal) {
            totalHora = horaFinal - horaInicial;
        } else {
            totalHora = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + totalHora + " HORA(S)");

        sc.close();
    }
}
