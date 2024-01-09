package TEMA2;

import java.util.Scanner;

public class Ejercicio010_Pascua {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un año: ");
        int año = scanner.nextInt();

        int A = año % 19;
        int B = año % 4;
        int C = año % 7;
        int D = (19 * A + 24) % 30;
        int E = (2 * B + 4 * C + 6 * D + 5) % 7;
        int N = 22 + D + E;
        String mes = (N <= 31) ? "Marzo" : "Abril";
        System.out.println("El domingo de Pascua es el " +(N - 31)+  mes);
    }
}
