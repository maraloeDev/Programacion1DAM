package TEMA2;

public class Ejercicio08_SentenciaLogica {

    public static void main(String[] args) {

        boolean positivo = true;

        int numero = -1;

        if (numero < 0){
            positivo=false;

            System.out.println(positivo);
        } else if (numero > 0 && numero <100) {
            positivo=true;
            System.out.println(positivo);
        } else {
            positivo=true;
            System.out.println(positivo);
        }
    }
}
