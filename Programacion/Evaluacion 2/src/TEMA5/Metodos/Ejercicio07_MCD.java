package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio07_MCD {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar dos números enteros positivos al usuario
        System.out.print("Ingrese el primer número entero positivo: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número entero positivo: ");
        int num2 = scanner.nextInt();

        // Asegurarse de que ambos números son positivos
        if (num1 > 0 && num2 > 0) {
            // Llamar al método mcd para calcular el MCD
            int resultado = mcd(Math.max(num1, num2), Math.min(num1, num2));

            // Mostrar el resultado
            System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + resultado);
        } else {
            System.out.println("Por favor, ingrese números enteros positivos.");
        }

        scanner.close();
    }

    // Método para calcular el MCD utilizando el algoritmo de Euclides
    public static int mcd(int mayor, int menor) {
        while (menor != 0) {
            int temp = menor;
            menor = mayor % menor;
            mayor = temp;
        }
        return mayor;
    }
}
