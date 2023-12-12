package TEMA2;

import java.util.Scanner;

public class Ejercicio05_PorcentajesNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("Introduce un numero de sobresalientes: ");
            int SB = scanner.nextInt();

            System.out.print("Introduce un numero de notables: ");
            int N = scanner.nextInt();

            System.out.print("Introduce un numero de aprobados: ");
            int A = scanner.nextInt();

            System.out.print("Introduce un numero de suspensos: ");
            int S = scanner.nextInt();

            System.out.print("Introduce un numero de no presentado: ");
            int NP = scanner.nextInt();


        System.out.println("SB="+SB);
        System.out.println("N="+N);
        System.out.println("A="+A);
        System.out.println("S="+S);
        System.out.println("NP="+NP);
        System.out.println("Total=" + (SB+N+A+S+NP));
        System.out.println("Total Presentados=" + (SB+N+A+S));
        System.out.println("Total Aprobados=" + (SB+N+A));
        System.out.println("Total Suspensos=" + (S));
        System.out.println("Total No Presentados=" + (NP));
    }
}
