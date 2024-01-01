package TEMA5.POO.Persona;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechadeNacimiento;
    private int edad;
    private double altura;
    private double peso;
    private boolean casado;

    public Persona(String dni, String nombre, String apellidos, int edad, char sexo, LocalDate fechadeNacimiento, double altura, double peso, boolean casado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechadeNacimiento = fechadeNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni='" + this.dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sexo=" + sexo +
                ", fechadeNacimiento=" + formateoFecha() +
                ", edad=" + calcularEdad() +
                ", altura=" + altura +
                ", peso=" + peso +
                ", casado=" + casado +
                '}';
    }

    public String formateoFecha() {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        return fechadeNacimiento.format(dateFormat);
    }

    public long calcularEdad() {

        LocalDate fechaActual = LocalDate.now();

        return ChronoUnit.YEARS.between(this.fechadeNacimiento, fechaActual);
    }

    public String calcularDNI() {
        Scanner scanner = new Scanner(System.in);

        do {

            if (dni.length() != 8) {
                System.out.println("DNI incorrecto, vuelvelo a introducir");
                dni = scanner.next();
            }

        } while (dni.length() != 8);

        String letra;

        switch (Integer.parseInt(dni) % 23) {
            case 0:
                letra = "T";
                break;
            case 1:
                letra = "R";
                break;
            case 2:
                letra = "W";
                break;
            case 3:
                letra = "A";
                break;
            case 4:
                letra = "G";
                break;
            case 5:
                letra = "M";
                break;
            case 6:
                letra = "Y";
                break;
            case 7:
                letra = "F";
                break;
            case 8:
                letra = "P";
                break;
            case 9:
                letra = "D";
                break;
            case 10:
                letra = "X";
                break;
            case 11:
                letra = "B";
                break;
            case 12:
                letra = "N";
                break;
            case 13:
                letra = "J";
                break;
            case 14:
                letra = "Z";
                break;
            case 15:
                letra = "S";
                break;
            case 16:
                letra = "Q";
                break;
            case 17:
                letra = "V";
                break;
            case 18:
                letra = "H";
                break;
            case 19:
                letra = "L";
                break;
            case 20:
                letra = "C";
                break;
            case 21:
                letra = "K";
                break;
            case 22:
                letra = "E";
                break;
            default:
                letra = "Error";
                break;
        }
        return letra;
    }

    public int pesoIdeal() {
        double pesoIdeal = 0.75 * (this.altura - 150) + 50;

        if (this.peso < pesoIdeal) {
            return -1;
        } else if (this.peso == pesoIdeal) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean mayorEdad() {

        return calcularEdad() >= 18;
    }

    public long edadPersona() {
        return calcularEdad();
    }
}