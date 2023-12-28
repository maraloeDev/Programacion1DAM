package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio09_Coordenadas {

    public static void main(String[] args) {

        // Obtener la distancia (r) y el ángulo en grados (theta) desde el teclado
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la distancia (r): ");
        double r = scanner.nextDouble();

        System.out.print("Ingrese el ángulo en grados (theta): ");
        double thetaDegrees = scanner.nextDouble();

        // Convertir el ángulo de grados a radianes
        double thetaRadians = Math.toRadians(thetaDegrees);

        // Calcular las coordenadas cartesianas
        double x = r * Math.cos(thetaRadians);
        double y = r * Math.sin(thetaRadians);

        // Mostrar las coordenadas cartesianas resultantes
        System.out.println("Coordenadas cartesianas (x, y): (" + x + ", " + y + ")");

        // Cerrar el scanner
        scanner.close();
    }
}
