/*
 * Ejercicio 0 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E0R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int m, n, comb;

        do {
            System.out.print("Introduzca m y n (m >= n): ");
            m = teclado.nextInt();
            n = teclado.nextInt();
        } while ((m < n) || (m < 0) || (n < 0));
        comb = combinatorio(m, n);
        System.out.println("El numero combinatorio de " + m + " sobre " + n + " es: " + comb);
        teclado.close();
    }

    private static int combinatorio(int m, int n){
        if (m - n > n) {
            return producto (m-n+1, m)/factorial(n);
        } else {
            return producto (n+1, m)/factorial(m-n);
        }
    }

    private static int factorial(int x) {
        int fact = 1;
        for (int i = 2; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    private static int producto (int x, int y) {
        int prod = 1;
        for (int i = x; i <= y; i++){
            prod *= i;
        }
        return prod;
    }
}