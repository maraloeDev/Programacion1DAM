package TEMA2;

import java.util.Scanner;

public class Ejercicio011_Celsius {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Indica una temperatura en grados Celsius");

        double gCelsius = scanner.nextDouble();

        double gFahrenheit = (gCelsius * 9/5) + 32;

        System.out.println(gCelsius + " grados Celsius son " + gFahrenheit + " grados Fahrenheit");

    }
}
