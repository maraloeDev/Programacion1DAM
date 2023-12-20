package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio1 {

static Scanner scanner = new Scanner(System.in);
    public double toFahrenheit(double celsius) {
        celsius = scanner.nextInt();
        double farenheit = (celsius *9/5) +32;
        return celsius;
    }
}
