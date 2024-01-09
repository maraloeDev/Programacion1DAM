package TEMA2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio05_PorcentajesNotas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

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



        System.out.println("SB="+SB + "( " + df.format((double) SB*100/60) + "% )");
        System.out.println("N="+N + "( " + df.format((double) N*100/60) + "% )");
        System.out.println("A="+A + "( " + (df.format((double) A*100/60) + "% )"));
        System.out.println("S="+S + "( " + df.format((double) S*100/60) + "% )");
        System.out.println("NP="+NP + "( " + df.format((double) NP*100/60) + "% )");
        System.out.println("Total=" + (SB+N+A+S+NP) + "( " + df.format((double) (SB+N+A+S+NP)*100/60) + "% )");
        System.out.println("Total Presentados=" + (SB+N+A+S) + "( " + df.format((double) (SB+N+A+S)*100/60) + "% )");
        System.out.println("Total Aprobados=" + (SB+N+A) + "( " + df.format((double) (SB+N+A)*100/60) + "% )");
        System.out.println("Total Suspensos=" + (S) + "( " + df.format((double) (S)*100/60) + "% )");
        System.out.println("Total No Presentados=" + (NP) + "( " + df.format((double) (NP)*100/60) + "% )");
    }
}
