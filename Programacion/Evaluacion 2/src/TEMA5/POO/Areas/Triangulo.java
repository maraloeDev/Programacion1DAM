package TEMA5.POO.Areas;

import TEMA5.POO.Punto.Punto;

public class Triangulo extends Punto{

    private double base;
    private double altura;
    private double lado;


    public Triangulo(int x, int y, double base, double altura) {
        super(x, y);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public double area() {

        return (base * altura) /2;
    }

    public double perimetro() {
        return 2 * Math.pow(lado,3);
    }
}
