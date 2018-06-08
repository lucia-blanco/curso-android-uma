/*
 * Ejercicio 6 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E6R4 {
    private static double ocho = 8;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sec;
        double sum = 0;

        do {
            System.out.print("Introduce un número de la secuencia: ");
            sec = teclado.nextDouble();

            sum += sec%ocho;
        } while ( sec != 0 );
        System.out.print("La suma de los restos por dividir entre 8 cada número de la secuencia es: " + sum);
    }
}