package TEMA6.Herencia.Ejercicio2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado{

    private LocalDate fechaAlta;
    private LocalDate fechaBaja;


    public EmpleadoTemporal(String nombre, String dni, double sueldo, LocalDate fechaAlta, LocalDate fechaBaja) {
        super(nombre, dni, sueldo);
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
    }

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public int sueldoTemporal(){
        return (int) this.getSueldo();
    }
}
