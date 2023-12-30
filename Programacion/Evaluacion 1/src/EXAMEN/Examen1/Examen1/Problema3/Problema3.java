package EXAMEN.Examen1.Examen1.Problema3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Problema3 {

    public static void main(String[] args) {
        //Obtenemos la fecha actual
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String fecha = hourdateFormat.format(date);
        System.out.println("Fecha: " + fecha);

        //Obtenemos la fecha actual
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fecha2 = localDate.format(formatter);
        System.out.println("Fecha: " + fecha2);

    }
}
