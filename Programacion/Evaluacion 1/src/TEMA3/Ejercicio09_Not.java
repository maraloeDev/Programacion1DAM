package TEMA3;

public class Ejercicio09_Not {

    public static void main(String[] args) {

        int binario = 10010001;
        int decimal = 0;
        int exponente = 0;
        int digito = 0;
        int complemento = 0;

        while (binario != 0) {
            digito = binario % 10;
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            exponente++;
            binario = binario / 10;
        }

        System.out.println("El número binario " + binario + " en decimal es " + decimal);

        while (decimal != 0) {
            digito = decimal % 2;
            complemento = complemento * 10 + digito;
            decimal = decimal / 2;
        }

        System.out.println("El complemento del número binario " + binario + " es " + complemento);



    }

}
