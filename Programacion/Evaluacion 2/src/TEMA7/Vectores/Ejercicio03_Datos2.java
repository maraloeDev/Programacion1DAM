package TEMA7.Vectores;

import java.util.Random;

public class Ejercicio03_Datos2 {

    public static void main(String[] args) {
        Random rndm = new Random();
        int[] enteros = new int[10];
        int suma = 0;
        int cuentaPares = 0;
int i = 0;
        for (i = 0; i <= enteros.length - 1; i++) {
            enteros[i] = rndm.nextInt(0, 10);

            if ((enteros[i] % 2) == 0) {
                System.out.println("El elemento par " + enteros[i] + " ocupa la posición impar " + i);
                suma += enteros[i];
                cuentaPares++;
            }

        }
        System.out.println("La cuenta de los numeros pares son " + cuentaPares);
        System.out.println("La suma de los numeros pares son " + suma);
    }
}
