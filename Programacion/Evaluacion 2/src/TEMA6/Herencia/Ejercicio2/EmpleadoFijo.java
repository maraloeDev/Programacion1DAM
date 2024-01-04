package TEMA6.Herencia.Ejercicio2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmpleadoFijo extends Empleado {

    private LocalDate anioAlteEmpresa;
    private int complementoAnual;

    public EmpleadoFijo(String nombre, String dni, double sueldo, LocalDate anioAlteEmpresa, int complementoAnual) {
        super(nombre, dni, sueldo);
        this.anioAlteEmpresa = anioAlteEmpresa;
        this.complementoAnual = complementoAnual;
    }

    public LocalDate getAnioAlteEmpresa() {
        return anioAlteEmpresa;
    }

    public void setAnioAlteEmpresa(LocalDate anioAlteEmpresa) {
        this.anioAlteEmpresa = anioAlteEmpresa;
    }

    public long sueldoFijo(){

        LocalDate hoy = LocalDate.now();

        return (int) getSueldo() + ((complementoAnual) *  ChronoUnit.YEARS.between(anioAlteEmpresa, hoy));
    }
}
