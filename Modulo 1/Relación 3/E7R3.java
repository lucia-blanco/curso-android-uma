/*
 * Ejercicio 7 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E7R3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();

        System.out.print("El número " + num + " es");

        if (num > 0) {
            System.out.println(" positivo.");
        } else {
            System.out.println(" negativo.");
        }
    }
}