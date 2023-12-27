package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio01_toFahrenheit {

    public double toFahrenheit(double celsius) {

        Scanner scanner = new Scanner(System.in);
        celsius = scanner.nextInt();
        double farenheit = (celsius * 9 / 5) + 32;
        return celsius;
    }
}
