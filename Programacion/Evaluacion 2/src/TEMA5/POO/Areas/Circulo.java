package TEMA5.POO.Areas;

import TEMA5.POO.Punto.Punto;

public class Circulo extends Punto {

    private double radio;

    public Circulo(int x, int y, double radio) {
        super(x, y);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    public double area() {

        return Math.PI * Math.pow(radio, 2);
    }

    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
