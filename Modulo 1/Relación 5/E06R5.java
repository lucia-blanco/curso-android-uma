/*
 * Ejercicio 6 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E06R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int cnt = 0;

        do {
            System.out.print("Introduce un número: ");
            i = teclado.nextInt();
        } while (i < 0);

        System.out.print("Los " + i + " primeros números primos son:");
        int num = 1;
        while (cnt < i) {
            num++;
            if (primo(num)) {
                System.out.print("- " + num + " ");
                cnt++;
            }
        }
    }

    private static boolean primo (int num) {
        boolean primo = true;
        for (int j = 2; j < num; j++) {
            if (num % j == 0) {
                primo = false;
            }
        }
       return primo;
    }
}
