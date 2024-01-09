package TEMA7.Matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio03_Permutacion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Introduce el numero de filas de la matriz: ");
        int filas = scanner.nextInt();

        System.out.println("Introduce el numero de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int enteros[][] = new int[filas][columnas];

        for (int f = 0; f < enteros.length; f++) {
            System.out.println();
            for (int c = 0; c < enteros[f].length; c++) {
                enteros[f][c] = random.nextInt(0, 100);
                System.out.print(enteros[f][c] + " ");
            }

        }

        System.out.println("----------------------------------");
        System.out.println("Permuta de filas: ");
        permutaFilas(enteros, 0, 1);

        System.out.println("---------------------------4444-------");
        System.out.println("Permuta de columnas: ");
        permutaColumnas(enteros, 0, 1);
    }

    public static void permutaFilas(int[][] matriz, int fila1, int fila2) {

        for (int f = 0; f < matriz.length; f++) {
            System.out.println();
            for (int c = 0; c < matriz[f].length; c++) {

                matriz[fila1] = matriz[fila2];
                matriz[fila2] = matriz[fila1];

                System.out.print(matriz[f][c] + " ");

            }

        }
    }

    public static void permutaColumnas(int[][] matriz, int columna1, int columna2) {

        for (int f = 0; f < matriz.length; f++) {
            System.out.println();
            for (int c = 0; c < matriz[f].length; c++) {

                matriz[columna1] = matriz[columna2];
                matriz[columna2] = matriz[columna1];

                System.out.print(matriz[f][c] + " ");

            }

        }
    }
}
