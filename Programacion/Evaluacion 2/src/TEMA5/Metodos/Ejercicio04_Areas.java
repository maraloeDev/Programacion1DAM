package TEMA5.Metodos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio04_Areas {

    public static void circulo() {

        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Introduce un radio");
        int radio = scanner.nextInt();

        double area = (Math.PI) * Math.pow(radio, 2);

        System.out.println("El area del circulo es " + decimalFormat.format(area));

    }

    public static void cuadrado() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Introduce un lado");
        int lado = scanner.nextInt();

        double area = Math.pow(lado, 2);

        System.out.println("El area del cuadrado es " + decimalFormat.format(area));

    }

    public static void rectangulo() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Introduce una base");
        int base = scanner.nextInt();

        System.out.println("Introduce una altura");
        int altura = scanner.nextInt();

        double area = (base * altura);

        System.out.println("El area del rectangulo es " + decimalFormat.format(area));

    }

    public static void triangulo() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.println("Introduce una base");
        int base = scanner.nextInt();

        System.out.println("Introduce una altura");
        int altura = scanner.nextInt();

        double area = (double) (base * altura) / 2;

        System.out.println("El area del rectangulo es " + decimalFormat.format(area));

    }

    public static void solucion(){
        Scanner scanner = new Scanner(System.in);

        int opts;

        do {

            System.out.println("""
                    Elige un calulo de area
                    1- Circulo\s
                    2- Cuadrado\s
                    3- Rectangulo\s
                    4-Triangulo""");

            opts = scanner.nextInt();

            switch (opts) {
                case 1:
                    circulo();
                    break;
                case 2:
                    cuadrado();
                    break;
                case 3:
                    rectangulo();
                    break;
                case 4:
                    triangulo();
                    break;
                default:
                    System.out.println("Figura no encontrada [Numeros del 1 al 5]");
            }
        } while (opts != 4);
    }

    public static void main(String[] args) {

        solucion();
    }
}
