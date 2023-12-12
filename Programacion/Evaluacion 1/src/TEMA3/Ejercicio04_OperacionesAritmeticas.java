package TEMA3;

import java.util.Random;

public class Ejercicio04_OperacionesAritmeticas {

    public static void main(String[] args) {
        Random rndm = new Random();

        int nrndm1 = rndm.nextInt(0, 10);
        int nrndm2 = rndm.nextInt(0, 10);

        System.out.println("La suma de " + nrndm1 + " y " + nrndm2 + " es: " + (nrndm1 + nrndm2));
        System.out.println("La resta de " + nrndm1 + " y " + nrndm2 + " es: " + (nrndm1 - nrndm2));
        System.out.println("La multiplicación de " + nrndm1 + " y " + nrndm2 + " es: " + (nrndm1 * nrndm2));

        if ((nrndm1 / nrndm2) == 0) {
            System.out.println("La division da 0");
        } else {
            System.out.println("La división de " + nrndm1 + " y " + nrndm2 + " es: " + (nrndm1 / nrndm2));
            System.out.println("El resto de " + nrndm1 + " y " + nrndm2 + " es: " + (nrndm1 % nrndm2));
        }
    }
}
