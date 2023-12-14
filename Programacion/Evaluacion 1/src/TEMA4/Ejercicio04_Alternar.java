package TEMA4;

import java.util.Scanner;

public class Ejercicio04_Alternar {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        String cadena2 = "";
        int i = 0;
        int j = cadena.length() - 1;

        while (i < cadena.length() / 2) {
            cadena2 += cadena.charAt(i);
            cadena2 += cadena.charAt(j);
            i++;
            j--;
        }

        if (cadena.length() % 2 != 0) {
            cadena2 += cadena.charAt(i);
        }

        System.out.println(cadena2);
    }
}
