/*
 * Ejercicio 11 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E11R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 0;

        do {
            System.out.print("Introduce un valor n (mayor que 2): ");
            n = teclado.nextInt();
        } while (n <= 2);

        int num1 = 0;
        int num2 = 1;
        int fibo = 0;
        System.out.print("Las primeras "+ n +" de la serie de Fibonacci son: " + num1 + " " + num2);
        for (int i = 0; i < (n-2); i++){
            fibo = num1 + num2;
            System.out.print(" "+fibo+" ");
            num1 = num2;
            num2 = fibo;
        }
    }
}