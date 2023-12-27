package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio02_Divisor {

    public String divisor() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un entero ");
        int entero = scanner.nextInt();

        System.out.println("Introduce un divisor ");
        int divisor = scanner.nextInt();

        int divisorMax = 0;

        do {
            if (divisor > divisorMax) {
                divisorMax = divisor;
            }


            System.out.println("__________________");
            System.out.println("Introduce un divisor ");
            divisor = scanner.nextInt();

            System.out.println("Introduce un entero ");
            entero = scanner.nextInt();

        } while (divisor >= entero);

        System.out.println();
        return "El divisor mas grande es " + divisorMax;
    }
}
