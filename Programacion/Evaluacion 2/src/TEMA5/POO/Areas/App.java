package TEMA5.POO.Areas;

import TEMA5.POO.Punto.Punto;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class App {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(32,45,24);
        Rectangulo rectangulo = new Rectangulo(12, 34, 56, 78);
        Cuadrado cuadrado = new Cuadrado(12, 34, 56);
        Triangulo triangulo = new Triangulo(12, 34, 56, 78);

        System.out.println(circulo.toString());
        System.out.println("Área: " + circulo.area());
        System.out.println("Perímetro: " + circulo.perimetro());

        System.out.println(rectangulo.toString());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());

        System.out.println(cuadrado.toString());
        System.out.println("Área: " + cuadrado.area());
        System.out.println("Perímetro: " + cuadrado.perimetro());
        System.out.println("Diagonal: " + cuadrado.diagonal());

        System.out.println(rectangulo.toString());
        System.out.println("Área: " + rectangulo.area());
        System.out.println("Perímetro: " + rectangulo.perimetro());
        System.out.println("Diagonal: " + rectangulo.diagonal());

        System.out.println(triangulo.toString());
        System.out.println("Área: " + triangulo.area());
        System.out.println("Perímetro: " + triangulo.perimetro());

        circulo.mover(2, 3);
        rectangulo.mover(-1, 2);

        System.out.println(circulo.toString());
        System.out.println(rectangulo.toString());

        ArrayList<String> FigurasGeometricas = new ArrayList<>();
        FigurasGeometricas.add(String.valueOf(circulo));
        FigurasGeometricas.add(String.valueOf(cuadrado));
        FigurasGeometricas.add(String.valueOf(rectangulo));
        FigurasGeometricas.add(String.valueOf(triangulo));

        // Mostrar figuras ordenadas por área
        System.out.println("\nFiguras ordenadas por área:");
        for (String figura : FigurasGeometricas) {
            System.out.println(figura.toString() + " - Área: " + figura);
        }



    }
}
