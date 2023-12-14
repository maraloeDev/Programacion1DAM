package TEMA4;

import java.util.Scanner;

public class Ejercicio02_Invertir {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();
        String fraseInvertida = "";

        for (int i = 0; i < frase.length(); i++) {
            if (Character.isUpperCase(frase.charAt(i))) {
                fraseInvertida += Character.toLowerCase(frase.charAt(i));
            } else {
                fraseInvertida += Character.toUpperCase(frase.charAt(i));
            }
        }
        System.out.println("La frase invertida es: " + fraseInvertida);
    }
}
