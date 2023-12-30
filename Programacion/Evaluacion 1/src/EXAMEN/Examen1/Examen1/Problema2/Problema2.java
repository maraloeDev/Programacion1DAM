package EXAMEN.Examen1.Examen1.Problema2;

import java.util.Scanner;

public class Problema2 {

    public static void main(String[] args) {
        /* Realiza un programa Java que dado un nº de DNI introducido por teclado, determine su letra. Ésta
se obtiene dividiendo el nº entre 23 y al resto de dicha división (N) que estará comprendido entre 1
y 22 se le asigna la letra correspondiente. Para calcular la letra, ten en cuenta la siguiente tabla de
asignaciones: en java */


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el DNI: ");
        int dni = sc.nextInt();
        char letra = ' ';
        int resto = dni % 23;

        switch (resto) {
            case 0:
                letra = 'T';
                break;
            case 1:
                letra = 'R';
                break;
            case 2:
                letra = 'W';
                break;
            case 3:
                letra = 'A';
                break;
            case 4:
                letra = 'G';
                break;
            case 5:
                letra = 'M';
                break;
            case 6:
                letra = 'Y';
                break;
            case 7:
                letra = 'F';
                break;
            case 8:
                letra = 'P';
                break;
            case 9:
                letra = 'D';
                break;
            case 10:
                letra = 'X';
                break;
            case 11:
                letra = 'B';
                break;
            case 12:
                letra = 'N';
                break;
            case 13:
                letra = 'J';
                break;
            case 14:
                letra = 'Z';
                break;
            case 15:
                letra = 'S';
                break;
            case 16:
                letra = 'Q';
                break;
            case 17:
                letra = 'V';
                break;
            case 18:
                letra = 'H';
                break;
            case 19:
                letra = 'L';
                break;
            case 20:
                letra = 'C';
                break;
            case 21:
                letra = 'K';
                break;
            case 22:
                letra = 'E';
                break;
            default:
                System.out.println("Error");
                break;

        }
            System.out.println("La letra del DNI es: " + letra);
    }


}
