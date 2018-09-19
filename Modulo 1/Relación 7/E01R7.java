/*
 * Ejercicio 1 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E01R7 {
    private static final int MAX = 10;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el array: ");
        int[] array = leer(teclado);
        System.out.println("El mayor es: " + mayor(array));
    }

    private static int mayor (int[] array) {
        int maxim = 0;
        for (int i : array) {
            if (array[i] > maxim) {
                maxim = array[i];
            }
        }
        return maxim;
    }

    private static int[] leer (Scanner teclado) {
        int[] array = new int[MAX];
        for (int i= 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }
        return array;
    }
}
