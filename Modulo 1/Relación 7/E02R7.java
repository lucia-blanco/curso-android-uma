/*
 * Ejercicio 2 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E02R7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] a = leer(teclado);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        boolean esta = esta(a, num);
        System.out.print("El número " + num);
        if (!esta) {
            System.out.print(" no");
        }
        System.out.println(" está en el array");
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

    private static boolean esta (int[] array, int num) {
        boolean esta = false;
        for (int i= 0; i < array.length; i++) {
            if (array[i] == num) {
                esta = true;
            }
        }
        return esta;
    }
}
