package EXAMEN.Examen1.Examen1.Problema1;

import java.util.Random;
import java.util.Scanner;

/* Escribe un programa Java que genere un nº aleatorio entre 1 y 100 y tú lo trates de adivinar. Para
ello, te preguntará el número repetidamente hasta que lo consigas.
En cada intento fallido, el intervalo se irá cerrando.Escribe un programa Java que genere un nº aleatorio entre 1 y 100 y tú lo trates de adivinar. Para
ello, te preguntará el número repetidamente hasta que lo consigas.
En cada intento fallido, el intervalo se irá cerrando. */
public class Problema1 {

    public static void main(String[] args) {

        Random rndm = new Random();
        Scanner scanner = new Scanner(System.in);

        int nAleatorio = rndm.nextInt(1, 100);
        boolean acierto = true;
        int numero = 0;
        int min=0;
        int max =100;

            System.out.println("El numero secreto esta entre " + min + " y " + max);
        while (acierto){
            numero= scanner.nextInt();
            if (numero==nAleatorio){

            System.out.println("Acertaste!!!");

            acierto=false;
            } else {
                if (nAleatorio >= (min + max)/2){
                    min= (min + max)/2;
                    System.out.println("El numero secreto esta entre " + min + " y " + max);

                } else {
                    max= (max + min)/2;
                    System.out.println("El numero secreto esta entre " + min + " y " + max);

                }
            }

        }
    }
}
