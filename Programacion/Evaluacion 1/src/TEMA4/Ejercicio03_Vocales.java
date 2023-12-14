package TEMA4;

import java.util.Scanner;

public class Ejercicio03_Vocales {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();

        int nVocales = 0;

        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                nVocales++;
            }

        }
                System.out.println("El numero de vocales es: " + nVocales);
    }
}
