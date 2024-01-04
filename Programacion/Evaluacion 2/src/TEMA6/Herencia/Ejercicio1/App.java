package TEMA6.Herencia.Ejercicio1;

import java.time.LocalDate;

import static java.time.LocalDate.of;

public class App {

    public static void main(String[] args) {

        Barco barco =new Barco("123ZZ",20);

        Alquiler alquiler = new Alquiler("Pepe","47583974X",
                of(2020,12,23), of(2020,12,24),
                2, barco);

        Yates yates = new Yates("123ZZ",20, 65);
        aMotor aMotor = new aMotor("123ZZ",30, 500);
        Veleros veleros = new Veleros("123ZZ",40, 2);

        Alquiler alquilerYate = new Alquiler("Pepe", "47583974X",
                LocalDate.of(2020, 12, 23), LocalDate.of(2020, 12, 24),
                2, yates);

        Alquiler alquilerMotor = new Alquiler("Juan", "12345678A",
                LocalDate.of(2020, 12, 25), LocalDate.of(2020, 12, 26),
                3, aMotor);

        Alquiler alquilerVelero = new Alquiler("Ana", "87654321B",
                LocalDate.of(2020, 12, 27), LocalDate.of(2020, 12, 28),
                4, veleros);

        System.out.println("El precio del barco siendo un yate es " + alquilerYate.alquilerBarco());
        System.out.println("El precio del barco siendo a motor es " + alquilerMotor.alquilerBarco());
        System.out.println("El precio del barco siendo un velero es " + alquilerVelero.alquilerBarco());

    }
}
