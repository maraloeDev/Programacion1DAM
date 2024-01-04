package TEMA6.Herencia.Ejercicio2;

import java.time.LocalDate;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Random random = new Random();
        int nH = random.nextInt(2, 8);
        EmpleadoTemporal empleadoTemporal = new EmpleadoTemporal("Pepe", "45678321A", 1000, LocalDate.of(2000, 4, 12), LocalDate.of(2001, 3, 3));
        EmpleadoFijo empleadoFijo = new EmpleadoFijo("Alba", "12345678X", 1200, LocalDate.of(2000, 1, 4), 1500);
        EmpleadoHoras empleadoHoras = new EmpleadoHoras("Pedro", "12345432X", 2000, 20, nH);
        Empleado empleado1;

        //Hacer cambios de personal con empleado fijo, temporal, y por horas
        empleado1 = empleadoFijo;

        System.out.println("El sueldo para el empleado temporal es " + empleadoTemporal.sueldoTemporal() + " € y va a trabajar desde " + empleadoTemporal.getFechaAlta() + " hasta el " + empleadoTemporal.getFechaBaja());
        System.out.println("El sueldo para el empleado por horas es " + empleadoHoras.sueldoHoras() * 20 + " €, el precio de la hora trabajada es de " + empleadoHoras.getPrecioH() + " h  y el numero de horas es de " + empleadoHoras.getnHoras() * 20 + " h");
        System.out.println("El sueldo para el empleado fijo es " + empleadoFijo.sueldoFijo() + " € el año de alta de la empresa es el " + empleadoFijo.getAnioAlteEmpresa());
        System.out.println("Sueldo total del jefe: " + empleado1.sueldoEmpleados() + " €");
    }
}