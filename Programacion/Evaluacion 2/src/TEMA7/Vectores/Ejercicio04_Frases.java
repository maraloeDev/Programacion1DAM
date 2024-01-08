package TEMA7.Vectores;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04_Frases {
    static String frases[] = new String[5];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < frases.length; i++) {
            System.out.print(i + 1 + " Introduce una frase: ");
            frases[i] = scanner.nextLine();
        }
        imprimeFrases();
        mayorFrase();
        menorFrase();
    }
    public static void imprimeFrases() {
        System.out.println("Las frases introducidas son: " + Arrays.toString(frases));
    }

    public static void mayorFrase() {

        String mayor = "";
        int i = 0;
        int pos = 0;
        for (i = 0; i < frases.length - 1; i++) {

            if (frases[i].length() > mayor.length()) {
                mayor = frases[i];
                pos++;
            }
        }

        System.out.println("La frase mas grande del array es: " + mayor + ", y la posición que ocupa es la " + pos);
    }

    public static void menorFrase() {

        String menor = frases[0];
        int i = 0;
        int pos = 0;
        for (i = 0; i < frases.length - 1; i++) {

            if (frases[i].length() < menor.length()) {
                menor = frases[i];
                pos++;
            }
        }

        System.out.println("La frase mas pequeña del array es: " + menor + ", y la posición que ocupa es la " + pos);
    }
}
