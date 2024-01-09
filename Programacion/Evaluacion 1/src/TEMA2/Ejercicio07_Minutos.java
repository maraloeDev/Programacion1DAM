package TEMA2;

public class Ejercicio07_Minutos {

    public static void main(String[] args) {

        int segundos = 200;
        int minutos = segundos / 60;
        int segundosRestantes = segundos % 60;

        System.out.println(segundos + " segundos son " + minutos + " minutos y " + segundosRestantes + " segundos.");
    }
}
