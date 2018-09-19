/*
 * Ejercicio 5 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E5R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int sec;
        boolean keep = true;

        do {
            System.out.print("Introduce un número (distinto de 0): ");
            num = teclado.nextInt();
        } while (num == 0);

        do {
            System.out.print("Introduce un número de la secuencia: ");
            sec = teclado.nextInt();
            if (sec == num) {
                System.out.println("El número " + num + " se encuentra en la secuencia.");
                keep = false;
            } else if (sec == 0) {
                keep = false;
                System.out.println("El número " + num + " no se encuentra en la secuencia.");
            }
        } while ( keep );
    }
}