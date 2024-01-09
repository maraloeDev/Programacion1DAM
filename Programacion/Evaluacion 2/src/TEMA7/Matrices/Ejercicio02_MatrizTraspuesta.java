package TEMA7.Matrices;

import java.util.Random;

public class Ejercicio02_MatrizTraspuesta {

    static Random rndm = new Random();
    static int[][] matriz = new int[4][5];
    static int[][] matrizTraspuesta = new int[5][4];

    public static void main(String[] args) {


        for (int f = 0; f < matriz.length; f++) {
            System.out.println();
            for (int c = 0; c < matriz[f].length; c++) {

                matriz[f][c] = rndm.nextInt(1, 100);
                System.out.print(matriz[f][c] + " ");

            }

        }
        System.out.println();
        System.out.println("La matriz traspuesta es: ");
        traspuesta(matrizTraspuesta);

    }

    public static void traspuesta(int matrizTraspuesta[][]) {
        for (int f = 0; f < matrizTraspuesta.length; f++) {
            System.out.println();
            for (int c = 0; c < matrizTraspuesta[f].length; c++) {
                matrizTraspuesta[f][c] = matriz[c][f];
                System.out.print(matrizTraspuesta[f][c] + " ");

            }

        }
    }
}
