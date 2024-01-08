package TEMA7.Vectores;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio02_Datos {

    static Random rndm = new Random();
    static int[] enteros = new int[10];

    public static void main(String[] args) {


        for (int i = 0; i < enteros.length - 1; i++) {
            enteros[i] = rndm.nextInt(0, 10);
            System.out.print(enteros[i]+ " ");
        }
        System.out.println();
        sumaPares();
    }

    public static void sumaPares() {
        int suma = 0;
        for (int i = 0; i <= enteros.length - 1; i++) {
            if ((enteros[i] % 2) == 0) {
                suma += enteros[i];
            }
        }
        System.out.println("La suma de todos los numeros pares son: " + suma);
    }
}
