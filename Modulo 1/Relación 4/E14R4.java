/*
 * Ejercicio 14 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E14R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 1;
        int mayor = -1;
        int secMayor = -1;

        do {
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(teclado.nextLine());
            if (num > mayor) {
                secMayor = mayor;
                mayor = num;
            } else if (num < mayor && num > secMayor) {
                secMayor = num;
            }
        } while (num != 0);

        if (secMayor == 0) {
            System.out.println("Todos los números son iguales, no hay mayor estricto.");
        } else {
            System.out.println(mayor + " es el mayor.");
            System.out.println(secMayor + " es el segundo mayor.");
        }

    }
}
