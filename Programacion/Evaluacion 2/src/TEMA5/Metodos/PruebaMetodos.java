package TEMA5.Metodos;

public class PruebaMetodos {
    public static void main(String[] args) {
        Ejercicio01_toFahrenheit ejercicio01_toFahrenheit = new Ejercicio01_toFahrenheit();
        Ejercicio02_Divisor ejercicio02_Divisor = new Ejercicio02_Divisor();
        Ejercicio03_Par ejercicio03_par = new Ejercicio03_Par();

        System.out.println("Ejercicio 1: " + ejercicio01_toFahrenheit.toFahrenheit(0));
        //System.out.println("Ejercicio 2: " + ejercicio02_Divisor.divisor());
        System.out.println("Ejercicio 3: " + ejercicio03_par.par(24));
    }
}
