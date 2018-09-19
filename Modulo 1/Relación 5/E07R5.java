/*
 * Ejercicio 7 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E07R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        do {
            System.out.print("Introduce un número: ");
            n = teclado.nextInt();
        } while (n < 2);
        int N = 1;
        int primo = sigPrimo(N);
        while (n > 1) {
            primo = sigPrimo(N);
            if ((n%primo) == 0){
                System.out.println(primo);
                n /= primo;
            } else {
                N++;
            }

        }
    }
    public static int sigPrimo (int N) {
        int num = 1;
        while (N > 0) {
            num++;
            if (primo(num)) {
                N--;
            }
        }
        return num;
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
