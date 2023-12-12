package TEMA3;

import java.util.Scanner;

public class Ejercicio01_EstanEnOrden {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un numero :");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce un numero :");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce un numero :");
        int numero3 = scanner.nextInt();


        //Escribe un programa EstanEnOrden que lea tres enteros y diga si están ordenados de menor
        //a mayor, de mayor a menor o desordenados.



            if (numero1 > numero2 && numero2 > numero3){
                System.out.println("Estan ordenados de mayor a menor");

            } else if (numero1 < numero2 && numero2 < numero3) {
                System.out.println("Estan ordenados de menor a mayor");

            }else {
                System.out.println("Estan desordenados");
            }
        }
    }

