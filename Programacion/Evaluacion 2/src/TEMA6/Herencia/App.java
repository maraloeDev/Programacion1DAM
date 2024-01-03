package TEMA6.Herencia;

import static java.time.LocalDate.of;

public class App {

    public static void main(String[] args) {

        Barco barco =new Barco("123ZZ",20);

        Alquiler alquiler = new Alquiler("Pepe","47583974X",
                of(2020,12,23), of(2020,12,24),
                2, barco);

        Yates yates = new Yates("123ZZ",20, 2);
        aMotor aMotor = new aMotor("123ZZ",20, 2);
        Veleros veleros = new Veleros("123ZZ",20, 2);


        System.out.println("El precio del barco es " + alquiler.alquilerBarco());
        System.out.println("La funcion del barco es " + barco.modulo());
    }
}
