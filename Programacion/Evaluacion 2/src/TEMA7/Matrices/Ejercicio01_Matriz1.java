package TEMA7.Matrices;

import java.util.Random;

public class Ejercicio01_Matriz1 {

    public static void main(String[] args) {

    int [][] numeros = new int[5][5];
        Random rndm= new Random();

        for (int f = 0; f < numeros.length; f++) {
            System.out.println();
            for (int c = 0; c < numeros[f].length; c++) {
                numeros[f][c]= rndm.nextInt(10);

                System.out.print(numeros[f][c] + " ");
                
            }
            
        }
    }
}
