package TEMA7.Vectores;

public class Ejercicio06_Capicua {

    public static void main(String[] args) {

        int numeros[] = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        System.out.println("El array generado es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nEl array invertido es: ");
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println("\nEl array invertido es: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
    }
}
