package TEMA4;

import java.util.Scanner;

public class Ejercicio06_Ordenar {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        String palabra1, palabra2;
        int comparacion;

        System.out.print("Introduce par de palabras: ");
        palabra1 = scanner.nextLine();
        palabra2 = scanner.nextLine();

        comparacion = palabra1.compareToIgnoreCase(palabra2);

        if (comparacion < 0) {
            System.out.println(palabra1 + " " + palabra2);
        } else if (comparacion > 0) {
            System.out.println(palabra2 + " " + palabra1);
        } else {
            System.out.println("Las palabras son iguales");
        }
    }
}
