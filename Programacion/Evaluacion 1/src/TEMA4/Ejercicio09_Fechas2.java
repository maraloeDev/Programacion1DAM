package TEMA4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio09_Fechas2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una fecha (con formato dd/mm/yyyy)");
        String fecha = scanner.nextLine();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        do {
            System.out.println("Fecha incorrecta, vuelve a introducirlo");
            fecha = scanner.nextLine();

        } while (!fecha.contains("/") || fecha.contains("-"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaInicial;

        fechaInicial = LocalDate.parse(fecha, formatter);

        // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();

        // Calcular la diferencia en días
        long diasTranscurridos = fechaInicial.until(fechaActual).getDays();

        // Mostrar el resultado
        System.out.println("Días transcurridos desde " + fecha + " hasta hoy: " + diasTranscurridos + " días.");
    }
}
