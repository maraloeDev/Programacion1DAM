package TEMA6.Herencia.Ejercicio2;

public class Empleado {

    private String nombre;
    private String dni;
    private double sueldo;

    public Empleado(String nombre, String dni, double sueldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public int sueldoEmpleados() {
        int valorSueldo = 0;
        if (this instanceof EmpleadoTemporal) {
            valorSueldo += ((EmpleadoTemporal) this).sueldoTemporal();
        } else if (this instanceof EmpleadoFijo) {
            valorSueldo += ((EmpleadoFijo) this).sueldoFijo();
        } else if (this instanceof EmpleadoHoras) {
            valorSueldo += ((EmpleadoHoras) this).sueldoHoras();
        }
        return valorSueldo;
    }
}
