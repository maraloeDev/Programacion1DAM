package TEMA7.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01_Personas {

    static String[] nombres = new String[5];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        for (int i = 0; i <= nombres.length - 1; i++) {
            System.out.println("Introduce un nombre: ");
            nombres[i] = scanner.nextLine();

        }

        System.out.println("Personas en el Array: ");
        imprimePersonas();
        System.out.println("-----");
        System.out.println("Numeros pares :");
        pares();
    }

    public static void imprimePersonas() {
        for (int i = 0; i <= nombres.length - 1; i++) System.out.println(nombres[i]);
    }

    public static void pares() {

        for (int i = 0; i <= nombres.length - 1; i++) System.out.println((i % 2 == 0) ? nombres[i] : "");
    }
}