package TEMA4;

import java.util.Scanner;

public class Ejercicio01_Busqueda {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Cadena donde buscar: ");
        String cadena = scanner.nextLine();

        System.out.print("Cadena a buscar: ");
        String buscar = scanner.nextLine();

        int contador = 0;
        String posiciones = "";

        int posicion = cadena.indexOf(buscar);
        while (posicion != -1) {
            contador++;
            posiciones += posicion + ",";
            posicion = cadena.indexOf(buscar, posicion + 1);
        }
        if (contador == 0) {
            System.out.println("No se ha encontrado la cadena.");
        } else {
            System.out.println("Posiciones en las que aparece: " + posiciones.substring(0, posiciones.length() - 1));
            System.out.println("Nº de ocurrencias: " + contador);
        }

    }
}
