package TEMA2;

public class Ejercicio06_Intercambio {

    public static void main(String[] args) {

        int a= 99;
        int b= 23;

        System.out.println("Valor de antes de a " + a);
        System.out.println("Valor de antes de b " + b);

        a=b;
        b=a;
        System.out.println("Valor de despues de a " + a);
        System.out.println("Valor de despues de b " + b);
    }
}
