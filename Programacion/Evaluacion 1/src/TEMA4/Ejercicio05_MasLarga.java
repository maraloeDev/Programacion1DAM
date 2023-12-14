package TEMA4;

import java.util.Scanner;

public class Ejercicio05_MasLarga {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String frase = "";
        String cadenaLimpia = "";
        do {
            frase = scanner.nextLine();
            System.out.println("Introduce una frase: ");

            if(frase.length() > cadenaLimpia.length()){
                cadenaLimpia+=frase;
            }
        } while (!frase.isEmpty());

        System.out.println("La frase mas larga es " + cadenaLimpia);


    }
}
