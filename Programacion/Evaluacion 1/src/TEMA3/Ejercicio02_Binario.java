package TEMA3;

import java.util.Scanner;

public class Ejercicio02_Binario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int b2, b1, b0, decimal;
        System.out.println("Introduce el primer número binario: ");
        b2 = scanner.nextInt();

        System.out.println("Introduce el segundo número binario: ");
        b1 = scanner.nextInt();

        System.out.println("Introduce el tercer número binario: ");
        b0 = scanner.nextInt();

        if (b2 == 0 || b2 == 1 && b1 == 0 || b1 == 1 && b0 == 0 || b0 == 1) {
            decimal = 2 * 2 * b2 + 2 * b1 + b0;
            System.out.println("El número binario " + b2 + b1 + b0 + " en decimal es: " + decimal);
        } else {
            System.out.println("Error, los números introducidos no son binarios.");
        }
    }
}
