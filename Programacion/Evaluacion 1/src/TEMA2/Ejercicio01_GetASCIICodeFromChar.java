package TEMA2;

import java.util.Scanner;

public class Ejercicio01_GetASCIICodeFromChar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un caracter");

        char caracter = scanner.next().charAt(0);

        System.out.println("El caracter " + caracter + " en ASCII es " + (int) caracter);
    }
}
