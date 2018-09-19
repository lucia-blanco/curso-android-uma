/*
 * Ejercicio 8 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E08R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max, min;
        boolean cumple = true;
        int cnt = 1;

        do {
            System.out.print("Introduzca límite inferior: ");
            min = teclado.nextInt();
        } while (min < 1);
        do {
            System.out.print("Introduzca límite superior: ");
            max = teclado.nextInt();
        } while (max < min);
        while (cumple && cnt <= max-min){
            int num = min + cnt;
            if (num%2 != 0){
                num++;
            }
            cumple = goldbach(num);
            cnt ++;
        }
        if (max-min < 1){
            cumple = false;
        }
        if (cumple) {
            System.out.print("Todos los pares en el rango elegido cumplen la conjetura");
        } else {
            System.out.print("No todos los pares en el rango elegido cumplen la conjetura");
        }
    }

    private static boolean goldbach (int num){
        boolean cumple = false;
        int N = 1;
        int primo = 1;
        while (!cumple && primo < num) {
            primo = sigPrimo(N);
            int res = num - primo;
            if (primo(res)) {
                cumple = true;
                System.out.print(res + " + " + primo);
            }
            N++;
        }
        return cumple;
    }

    private static int sigPrimo (int N) {
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
