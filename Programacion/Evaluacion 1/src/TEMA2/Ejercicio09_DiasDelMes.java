package TEMA2;

public class Ejercicio09_DiasDelMes {

    public static void main(String[] args) {
        int mes = 2;
        int dias = 0;
        dias = (mes == 2) ? 28 : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 30 : 31;
        System.out.println("El mes " + mes + " tiene " + dias + " días.");


    }

}
