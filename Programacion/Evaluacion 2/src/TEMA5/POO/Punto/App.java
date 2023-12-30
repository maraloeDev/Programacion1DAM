package TEMA5.POO.Punto;

public class App {

    public static void main(String[] args) {

        Punto punto1 = new Punto(10,35);

        System.out.println("\033[1mRecuperacion de valores de X e Y actuales\033[0m " + punto1.getX() + "," + punto1.getY());

        punto1.setX(25);
        punto1.setY(40);
        System.out.println("\033[1mModificacion de valores de X e Y actuales\033[0m " + punto1.getX() + "," + punto1.getY());

        System.out.println("\033[1mEl estado del objeto de forma textual\033[0m" + punto1.toString());;

        punto1.desplazar(25, 59);
        System.out.println("\033[1mDesplazamiento de los puntos X e Y\033[0m " + punto1.toString());

        punto1.mover(1,2);
        System.out.println("\033[1mNueva posicion de los puntos X e Y\033[0m " + punto1.toString());

        punto1.distancia(23,58);
        System.out.println("\033[1mCalculo de posicion de los puntos X e Y\033[0m " + punto1.toString());


        System.out.println("El centro de la pantalla es " + punto1.centroPantalla());
    }
}
