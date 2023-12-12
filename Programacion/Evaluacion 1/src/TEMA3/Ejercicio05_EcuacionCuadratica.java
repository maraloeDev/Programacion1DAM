package TEMA3;

public class Ejercicio05_EcuacionCuadratica {

    public static void main(String[] args) {

        double a = 1;
        double b = 5;
        double c = 2;
        double x1, x2;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
