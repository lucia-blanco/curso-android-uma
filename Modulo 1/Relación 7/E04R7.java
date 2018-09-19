/*
 * Ejercicio 4 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E04R7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = leer(teclado);
        int media = media(array);
        System.out.print("Hay " + altos(array, media) + " alumnos con altura por encima de la media");
        System.out.println(" y " + bajos(array, media) + " alumnos con altura por debajo de la media");
    }

    private static int altos (int[] array, int media) {
        int altos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > media) {
                altos++;
            }
        }
        return altos;
    }

    private static int bajos (int[] array, int media) {
        int bajos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < media) {
                bajos++;
            }
        }
        return bajos;
    }

    private static int media (int[] array) {
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        return suma/array.length;
    }

    private static int[] leer (Scanner teclado) {
        System.out.print("Introduce el número de alumnos de la clase: ");
        int num = teclado.nextInt();

        System.out.print("Introduce la altura (en centímetros): ");
        int[] array = new int[num];
        for (int i= 0; i < array.length; i++) {
            array[i] = teclado.nextInt();
        }
        return array;
    }
}
