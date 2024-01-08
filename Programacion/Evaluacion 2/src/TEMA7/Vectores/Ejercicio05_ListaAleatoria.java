package TEMA7.Vectores;

import java.util.Random;

public class Ejercicio05_ListaAleatoria {

    public static void main(String[] args) {

        int lista[] = new int[10];
        int i = 0;
        int j = 0;
        int num = 0;
        boolean repetido = false;
        Random random = new Random();

        for (i = 0; i < lista.length; i++) {
            num = random.nextInt(10) + 1;
            for (j = 0; j < lista.length; j++) {
                if (num == lista[j]) {
                    repetido = true;
                }
            }
            if (repetido == false) {
                lista[i] = num;
            } else {
                i--;
            }
            repetido = false;
        }
        System.out.println("La lista aleatoria es: ");
        for (i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }

    }
}
