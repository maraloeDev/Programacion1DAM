package TEMA5.POO.Persona;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class App {
    static Persona persona = new Persona("47583974", "Eduardo", "Martin Sonseca", 24, 'M',
            LocalDate.of(1999, 12, 4), 178, 1.30, false);

    public static void main(String[] args) {

        System.out.println("La fecha de la persona es " + persona.formateoFecha());
        System.out.println("La edad actual de la persona es " + persona.calcularEdad());
        System.out.println("La letra del DNI es " + persona.calcularDNI());
        System.out.println(persona.toString());
        System.out.println(persona.pesoIdeal());
        System.out.println("La persona es " + persona.mayorEdad());
        System.out.println("La persona tiene " + persona.edadPersona());
    }
}
