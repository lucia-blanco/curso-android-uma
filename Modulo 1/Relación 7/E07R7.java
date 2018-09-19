/*
 * Ejercicio 7 | Modulo 1 | Relación 7
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E07R7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] rep = contar(leer(teclado));
        int mayor = mayor(rep);
        for (int j = 0; j < mayor; j++) {
            for (int i = 0; i < rep.length; i++) {
                if (rep[i] < mayor-j) {
                    System.out.print("O ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.print("0 1 2 3 4 5 6 7 8 9 ");
    }

    private static int[] contar (int[] array) {
        int[] rep = new int [10];
        for (int i = 0; i < rep.length; i++) {
            int repNum = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == i){
                    repNum++;
                }
            }
            rep[i] = repNum;
        }
        return rep;
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
