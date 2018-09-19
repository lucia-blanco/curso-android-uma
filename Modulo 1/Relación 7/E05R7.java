/*
 * Ejercicio 5 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E05R7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = leer (teclado);
            rotar(array);
        //Imprime
        System.out.println();
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    private static int[] rotar (int[] array) {
        for (int j = 0; j < array.length/2; j++) {
            int aux = array[j];
            array[j] = array[array.length-j-1];
            array[array.length-j-1] = aux;
        }
        return array;
    }

    private static int[] leer (Scanner teclado) {
        System.out.print("Introduce el número de elementos del array: ");
        int num = teclado.nextInt();

        System.out.print("Introduce un array: ");
        int[] array = new int[num];
        for (int i= 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }
        return array;
    }
}
