/*
 * Ejercicio 10 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E10R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;
        double dividendo = 2;
        double divisor = 3;
        double pi = 4;

        do {
            System.out.print("Introduce un valor n: ");
            n = teclado.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {
            pi *= (dividendo/divisor);
            if (i%2 == 0){
                divisor += 2;
            } else {
                dividendo += 2;
            }
        }
        System.out.print("pi = " + pi);
    }
}
