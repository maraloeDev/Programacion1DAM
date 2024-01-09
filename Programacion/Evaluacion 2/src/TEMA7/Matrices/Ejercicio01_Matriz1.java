package TEMA7.Matrices;

import java.util.Random;

public class Ejercicio01_Matriz1 {

    static int [][] numeros = new int[5][5];
    public static void main(String[] args) {

        Random rndm= new Random();

        for (int f = 1; f < numeros.length; f++) {
            System.out.println();
            for (int c = 1; c < numeros[f].length; c++) {


                if((f % 2)==0){
                    numeros[f][c] = rndm.nextInt(0, 10) * 2;
                    System.out.print(numeros[f][c] + " ");
                } else if ((f % 2)!=0){
                    numeros[f][c] = rndm.nextInt(0, 10) * 3;
                    System.out.print(numeros[f][c] + " ");
                }
                
            }
            
        }

        System.out.println("\n Matriz: ");
        imprimirMatriz();

        sumaMatriz();

        System.out.println("\n Diagonal: ");
        diagonal();
    }

    public static void imprimirMatriz() {

        for (int f = 1; f < numeros.length; f++) {
            System.out.println();
            for (int c = 1; c < numeros[f].length; c++) {
                System.out.print(numeros[f][c] + " ");
            }

        }
    }
        public static void sumaMatriz(){

            int suma = 0;

            for (int f = 1; f < numeros.length ; f++) {
                System.out.println();
                for (int c = 1; c < numeros[f].length ; c++) {
                    suma += numeros[f][c];
                }

            }
            System.out.println("La suma de los elementos de la matriz es: " + suma);
        }

        public static void diagonal(){

            for (int f = 1; f < numeros.length; f++) {
                System.out.println();
                for (int c = 0; c < numeros[f].length; c++) {

                    if(f==c){
                        System.out.print( numeros[f][c] + "\t");
                    }

                }

            }
                System.out.println();
        }
    }
