package TEMA5.Metodos;

public class Ejercicio05_Primo {

    public static void main(String[] args) {
        int numero = 7;
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es primo");
        } else {
            System.out.println("El número " + numero + " no es primo");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}
