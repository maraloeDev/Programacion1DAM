package TEMA3;

public class Ejercicio014_Triangulo3 {

    public static void main(String[] args) {

        int num = 4;
        int i, j;

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        for (i = num - 1; i >= 1; i--) {
            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
