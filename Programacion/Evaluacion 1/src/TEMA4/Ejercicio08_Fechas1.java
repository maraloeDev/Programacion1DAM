package TEMA4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio08_Fechas1 {

    // CUANDO SE USA DATE, SE QUITA 1900 AL AÑO, Y 1 AL MES!!!!!!!!!!
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un dia");
        int dia = scanner.nextInt();

        System.out.println("Introduce un mes");
        int mes = scanner.nextInt();

        System.out.println("Introduce un anio");
        int anio = scanner.nextInt();

        DateFormat fechaCorta = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat fechaLarga = DateFormat.getDateInstance(DateFormat.FULL);
        Date date = new Date(anio-1900,mes-1,dia);

        System.out.println("El formato en fecha larga es " + fechaLarga.format(date));
        System.out.println("El formato en fecha corta es " + fechaCorta.format(date));
            }
}
