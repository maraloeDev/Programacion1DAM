package TEMA5.POO.Persona;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;

public class App {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM.yyyy");
        Persona persona = new Persona("123445678", "Eduardo", "Martin Sonseca",
                'M', LocalDate.of(1999,12,4), 23, 53, false);

        System.out.println(persona.getFechadeNacimiento());
    }
}
