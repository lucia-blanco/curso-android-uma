/*
 * Ejercicio 8 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E8R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int sum = 0;

        System.out.print("Introduce un número de modelos de coche: ");
        int num = teclado.nextInt();

        for (int i = 1; i <= num; i++) {
            System.out.print("Precio modelo " + i + ": ");
            sum += teclado.nextInt();
        }
        System.out.print("El valor medio de los "+ num + " modelos de coche asciende a: " + (sum/num) + " €");
    }
}