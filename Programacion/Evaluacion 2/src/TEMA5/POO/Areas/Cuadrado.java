package TEMA5.POO.Areas;

import TEMA5.POO.Punto.Punto;

import java.text.DecimalFormat;

public class Cuadrado extends Punto {

    private double lado;

    public Cuadrado(int x, int y, double lado) {
        super(x, y);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + lado +
                '}';
    }

    public double area() {

        return Math.pow(lado,2);
    }

    public double perimetro() {
        return Math.pow(lado,4);
    }

    public String diagonal(){

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(Math.sqrt(Math.pow(lado,2) + Math.pow(lado,2)));
    }
}
