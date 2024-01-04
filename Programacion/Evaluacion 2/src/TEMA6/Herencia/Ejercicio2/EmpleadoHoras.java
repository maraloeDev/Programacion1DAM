package TEMA6.Herencia.Ejercicio2;

public class EmpleadoHoras extends Empleado{

    private double precioH=0;
    private int nHoras;

    public EmpleadoHoras(String nombre, String dni, double sueldo, double precioH, int nHoras) {
        super(nombre, dni, sueldo);
        this.precioH = precioH;
        this.nHoras = nHoras;
    }

    public double getPrecioH() {
        return precioH;
    }

    public void setPrecioH(double precioH) {
        this.precioH = precioH;
    }

    public int getnHoras() {
        return nHoras;
    }

    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    public int sueldoHoras(){
        return (int) precioH * nHoras;
    }
}
