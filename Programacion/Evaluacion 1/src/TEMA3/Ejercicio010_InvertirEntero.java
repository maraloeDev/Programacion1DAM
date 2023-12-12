package TEMA3;

import java.util.Scanner;

public class Ejercicio010_InvertirEntero {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        String cadena = "";

while (numero > 0) {
            cadena += numero % 10;
            numero /= 10;
        }

        System.out.println("El número invertido es: " + cadena);
    }
}
