package TEMA5.POO.Persona;

import java.time.LocalDate;
import java.util.Date;

public class Persona {

    private String dni;
    private String nombre;
    private String apellidos;
    private char sexo;
    private LocalDate fechadeNacimiento;
    private int edad;
    private double peso;
    private boolean casado;

    public Persona(String dni, String nombre, String apellidos, char sexo, LocalDate fechadeNacimiento, int edad, double peso, boolean casado) {
        if (dni != null && dni.length()!=8) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.sexo = sexo;
            this.fechadeNacimiento = fechadeNacimiento;
            this.edad = edad;
            this.peso = peso;
            this.casado = casado;
        } else {
            System.out.println("DNI No valido!!! Tiene que ser de 8 caracteres");
        }
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

    public LocalDate  getFechadeNacimiento(){
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(LocalDate  fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
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
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", sexo=" + sexo +
                ", fechadeNacimiento=" + fechadeNacimiento +
                ", edad=" + edad +
                ", peso=" + peso +
                ", casado=" + casado +
                '}';
    }
}
