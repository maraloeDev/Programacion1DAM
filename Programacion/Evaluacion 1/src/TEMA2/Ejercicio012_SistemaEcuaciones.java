package TEMA2;

import java.util.Scanner;

public class Ejercicio012_SistemaEcuaciones {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Introduce el valor de c: ");
        double c = scanner.nextDouble();

        System.out.print("Introduce el valor de d: ");
        double d = scanner.nextDouble();

        System.out.print("Introduce el valor de e: ");
        double e = scanner.nextDouble();

        System.out.print("Introduce el valor de f: ");
        double f = scanner.nextDouble();

        //Operaciones

        double x = (e * d - b * f) / (a * d - b * c);

        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("El valor de x es: " + x);

        System.out.println("El valor de y es: " + y);
    }
}
