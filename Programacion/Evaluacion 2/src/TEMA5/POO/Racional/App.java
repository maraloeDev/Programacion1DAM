package TEMA5.POO.Racional;

public class App {

    public static void main(String[] args) {

        Racional racional = new Racional();

        double numerador = racional.getNumerador();
        double denominador = racional.getDenominador();

        System.out.println(racional.toString());

        System.out.println("SUMA " + racional.sumar(racional));
        System.out.println("RESTAR " + racional.restar(racional));
        System.out.println("DIVISION " + racional.dividir(racional));
        System.out.println("MULTIPLICACION " + racional.producto(racional));

        System.out.println("toDecimal " + racional.toDecimal());
    }
}
