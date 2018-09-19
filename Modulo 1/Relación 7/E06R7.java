/*
 * Ejercicio 6 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E06R7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = leer(teclado);

        for (int i = 0; i < 10; i++) {
            System.out.print(i + ": " + contar(array, i));
            if (i < 9){
                System.out.print("; ");
            }
        }
    }

    private static int contar (int[] array, int i) {
        int rep = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i){
                rep++;
            }
        }
        return rep;
    }

    private static int[] leer (Scanner teclado) {
        int num = 1000;
        int[] arrayAux = new int[num];
        int arr;
        int i = 0;
        System.out.print("Introduce un array (finaliza con un número negativo): ");
        do {
            arr = teclado.nextInt();
            arrayAux[i] = arr;
            i++;
        } while (arr >= 0);

        i = 0;
        while (arrayAux[i] >= 0){
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
