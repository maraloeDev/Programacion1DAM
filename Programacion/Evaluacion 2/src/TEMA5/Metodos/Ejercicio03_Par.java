package TEMA5.Metodos;

import java.util.Scanner;

public class Ejercicio03_Par {

    public boolean par( int numero){

    Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero");
        numero = scanner.nextInt();

        if ((numero %2)==0){
            return true;
        } else {
            return false;
        }
    }
}
