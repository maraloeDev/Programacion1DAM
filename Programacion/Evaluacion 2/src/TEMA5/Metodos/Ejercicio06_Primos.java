package TEMA5.Metodos;

import static TEMA5.Metodos.Ejercicio05_Primo.esPrimo;

public class Ejercicio06_Primos {

    public static void main(String[] args) {
        int contador = 0;
        int numero = 2;
        while (contador < 100) {
            if (esPrimo(numero)) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        }
    }
}