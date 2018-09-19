/*
 * Ejercicio 3 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E03R7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = leer(teclado);
        System.out.print(" El " + mayorMinimo(array) + " es mayor que el mínimo.");
    }

    private static int mayorMinimo (int[] array) {
        int minim = 1000;
        int mayorMinim = 0;
        for (int i= 0; i < array.length; i++) {
            if (array[i] < minim) {
                minim = array[i];
            }
        }

        for (int i= 0; i < array.length; i++) {
            if (array[i] > minim) {
                mayorMinim = array[i];
            }
        }
        return mayorMinim;
    }

    private static int[] leer (Scanner teclado) {
        int num = 1000;
        int[] arrayAux = new int[num];
        int arr;
        int i = 0;
        System.out.print("Introduce un array: ");
        do {
            arr = teclado.nextInt();
            arrayAux[i] = arr;
            i++;
        } while (arr != 0);

        i = 0;
        while (arrayAux[i] != 0){
            i++;
        }

        int [] array = new int[i];
        int j = 0;
        while (j < i){
            array[j] = arrayAux[j];
            j++;
        }

        return array;
    }

}
