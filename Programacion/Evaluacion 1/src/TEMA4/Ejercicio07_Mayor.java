package TEMA4;

import java.util.Random;

public class Ejercicio07_Mayor {

    public static void main(String[] args) {

        Random aleatorio = new Random();


        int numero1;
        int mayor = 0;
        for (int i = 0; i < 20; i++) {

            numero1 = aleatorio.nextInt(1,1000);
            System.out.println("Numero 1: " + numero1);
            if(numero1 > mayor) {
                mayor = numero1;
            }
        }

        System.out.println("El numero mayor es: " + mayor);
    }
}
