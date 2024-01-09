package TEMA2;

import java.util.Scanner;

public class Ejercicio03_Calculo {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
int n1=0;
int n2=0;
String operacion="";

        System.out.print("Introduce un numero: ");
        n1 = scanner.nextInt();


        System.out.print("Introduce un numero: ");
        n2 = scanner.nextInt();

        System.out.println("Introduce una operacion [+, -, *, /, %]");
        operacion = scanner.next();


        String resultado =
                operacion.equals("+")? String.valueOf(n1 + n2) :
                        operacion.equals("-") ? String.valueOf(n1 - n2) :
                                operacion.equals("*")? String.valueOf(n1 * n2) :
                                        operacion.equals("/")? String.valueOf((double)n1 / n2) :
                                                operacion.equals("%")? String.valueOf(n1 % n2) : "0";

        System.out.println("La suma de los numeros introducidos es " + resultado);

        }
    }

