package TEMA7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicioo04_Frases {
        static String frases[] = new String[5];
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < frases.length; i++) {
            System.out.print(i +1 + " . Introduce una frase: ");
            frases[i] = scanner.nextLine();
        }
        imprimeFrases();
        mayorFrase();

    }

    public static void imprimeFrases(){
            System.out.println("Las frases introducidas son: " + Arrays.toString(frases));
    }

    public static void mayorFrase(){

        String mayor = "";
        for (int i = 0; i < frases.length; i++) {

            if (Integer.parseInt(mayor) > frases.length){
                frases[i]= String.valueOf(Integer.parseInt(mayor));
            }

        }

        System.out.println("La frase mas grande del array es: " + mayor);
            
        }

    }