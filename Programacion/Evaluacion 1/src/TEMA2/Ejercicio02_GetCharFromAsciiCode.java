package TEMA2;

import java.util.Scanner;

public class Ejercicio02_GetCharFromAsciiCode {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero :");

        double n = scanner.nextDouble();

        System.out.println("El numero " + n + "en caracter es " + (char) n);
    }
}
