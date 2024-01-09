package TEMA7.Matrices;

public class Ejercicio04_SoloColumnas {

    public static void main(String[] args) {

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + " ");
            }

        }

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {

                if (j == 0) {

                    System.out.print(matriz[i][j] + " ");

                }

            }

            System.out.println("");

        }

    }
}
