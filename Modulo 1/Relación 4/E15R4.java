/*
 * Ejercicio 15 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E15R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 1;
        int pos1 = 0;
        int pos2 = 0;
        int cnt = 1;

        do {
            System.out.print("Introduce un número: ");
            n = teclado.nextInt();
            if (n == 12) {
                if (pos1 == 0){
                    pos1 = cnt;
                }
                pos2 = cnt;
            }
            cnt++;
        } while (n != 0);
        System.out.println("La primera posición de las ocurrencias de 12 es: " + pos1);
        System.out.println("La segunda posición de las ocurrencias de 12 es: " + pos2);
    }
}
