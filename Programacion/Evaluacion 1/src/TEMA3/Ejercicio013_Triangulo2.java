package TEMA3;

public class Ejercicio013_Triangulo2 {

    public static void main(String[] args) {

/* Escribe un programa Triangulo2 que muestre lo siguiente:
1 2 3 4
1 2 3
1 2
1*/

        int num = 4;
        int num2 = 1;

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println("");
            num2++;
        }
    }
}
