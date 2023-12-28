package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio08_MayorDe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero: ");
        int a = scanner.nextInt();

        System.out.println("Introduce un numero: ");
        int b = scanner.nextInt();

        System.out.println("Introduce un numero: ");
        int c = scanner.nextInt();

    if((a>b) && (a>c)){
        System.out.println("El mayor de los numeros es " + a);
    } else if ((b>a) && (b>c)) {
        System.out.println("El mayor de los numeros es " + b);
    } else {
        System.out.println("El mayor de los numeros es " + c);
    }

    }


    public static int elMayor(int a, int b, int c){
        int elMayorDeDos= elMayor(a, b);
        return elMayor(elMayorDeDos, c);

    }

    public static int elMayor(int a, int b) {
        return (a > b) ? a : b;

    }
}
