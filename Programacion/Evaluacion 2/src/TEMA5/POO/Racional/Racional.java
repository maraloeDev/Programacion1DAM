package TEMA5.POO.Racional;

import java.nio.file.DirectoryNotEmptyException;
import java.text.DecimalFormat;
import java.util.Objects;
import java.util.Random;

public class Racional {

    private double numerador;
    private double denominador;

    public Racional() {
        this.numerador = 15;
        this.denominador = 55;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    @Override
    public String toString() {
        return "<" + numerador + ">/<" + denominador + ">";
    }

    public int sumar(Racional r) {
        int sumaDenominador = (int) (r.getDenominador() + this.getDenominador());
        int sumaNumerador = (int) (r.getNumerador() + this.getNumerador());
        return (int)sumaDenominador / sumaNumerador;
    }

    public int restar(Racional r) {
        int restaDenominador = (int) (r.getDenominador() * r.getNumerador() - r.getDenominador() * r.getNumerador());
        int restaNumerador = (int) (r.getNumerador() * this.getNumerador());
        return restaDenominador / restaNumerador;
    }

    public int producto(Racional r) {
        int productoDenominador = (int) (r.getDenominador() * this.getDenominador());
        int productoNumerador = (int) (r.getNumerador() * this.getNumerador());
        return productoDenominador / productoNumerador;
    }

    public int dividir(Racional r) {
        int dividirDenominador = (int) (r.getDenominador() * this.getNumerador());
        int dividirNumerador = (int) (r.getNumerador() * this.getDenominador());
        return dividirDenominador / dividirNumerador;
    }

    public boolean equals(Racional r) {
        return this.numerador == r.numerador && this.denominador == r.denominador;
    }

    public int compareTo(Racional r) {
        double resultadoActual = (double) this.numerador / this.denominador;
        double resultadoParametro = (double) r.numerador / r.denominador;

        if (resultadoActual < resultadoParametro) {
            return -1;
        } else if (resultadoActual > resultadoParametro) {
            return 1;
        } else {
            return 0;
        }
    }

    public String toDecimal() {
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(numerador / denominador);
    }
}