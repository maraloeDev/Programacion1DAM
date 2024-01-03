package TEMA6.Herencia;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class Alquiler {

    private String nombre;
    private String dniCliente;
    private LocalDate fechaInicial;
    private LocalDate fechaFinal;
    private int posicion;
    private Barco barcoAocupar;

    public Alquiler(String nombre, String dniCliente, LocalDate fechaInicial, LocalDate fechaFinal, int posicion, Barco barcoAocupar) {
        this.nombre = nombre;
        this.dniCliente = dniCliente;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
        this.posicion = posicion;
        this.barcoAocupar = barcoAocupar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(String dniCliente) {
        this.dniCliente = dniCliente;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Barco getBarcoAocupar() {
        return barcoAocupar;
    }

    public void setBarcoAocupar(Barco barcoAocupar) {
        this.barcoAocupar = barcoAocupar;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "nombre='" + nombre + '\'' +
                ", dniCliente='" + dniCliente + '\'' +
                ", fechaInicial=" + fechaInicial +
                ", fechaFinal=" + fechaFinal +
                ", posicion=" + posicion +
                ", barcoAocupar=" + barcoAocupar +
                '}';
    }

    public double alquilerBarco() {

        double diasAlquiler =(ChronoUnit.DAYS.between(fechaInicial,fechaFinal)) * barcoAocupar.modulo();
        double valorAlquiler=0;
        if (barcoAocupar instanceof Veleros) {
            valorAlquiler += ((Veleros) barcoAocupar).modulo();
        } else if (barcoAocupar instanceof Yates) {
            valorAlquiler += ((Yates) barcoAocupar).modulo();
        } else if (barcoAocupar instanceof aMotor) {
            valorAlquiler += ((aMotor) barcoAocupar).modulo();
        }

        return diasAlquiler;
    }
}
