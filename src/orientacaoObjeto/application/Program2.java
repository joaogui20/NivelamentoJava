package orientacaoObjeto.application;

import orientacaoObjeto.entities.Funcionary;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Funcionary func = new Funcionary();

        System.out.print("Name: ");
        func.name = sc.nextLine();
        System.out.print("Gross salary: ");
        func.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        func.tax = sc.nextDouble();

        System.out.println();
        System.out.print("Employee: " + func);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        func.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: " + func);

        sc.close();
    }
}
