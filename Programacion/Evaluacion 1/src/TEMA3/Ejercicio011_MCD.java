package TEMA3;

public class Ejercicio011_MCD {

    public static void main(String[] args) {


            int num1 = 532;
            int num2 = 112;
            int resto = 0;

            while (num2 != 0) {
                resto = num1 % num2;
                num1 = num2;
                num2 = resto;
            }

            System.out.println("El MCD es: " + num1);
    }
}
