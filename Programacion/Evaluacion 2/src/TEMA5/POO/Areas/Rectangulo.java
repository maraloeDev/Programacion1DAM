package TEMA5.POO.Areas;

import TEMA5.POO.Punto.Punto;

import java.text.DecimalFormat;

public class Rectangulo extends Punto{

    private double ancho;
    private double largo;
    private double lado;

    public Rectangulo(int x, int y, double ancho, double largo) {
        super(x, y);
        this.ancho = ancho;
        this.largo = largo;
        this.lado = lado;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", largo=" + largo +
                '}';
    }

    public double area() {

        return (ancho*largo);
    }

    public double perimetro() {
        return 2 * (ancho+largo);
    }

    public String diagonal(){
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(Math.sqrt(Math.pow(ancho,2) + Math.pow(largo,2)));
    }
}
