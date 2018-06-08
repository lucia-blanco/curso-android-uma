/*
 * Ejercicio 7 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E7R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double aux = 1;
        int cnt = 0;

        System.out.print("Introduce un número natural: ");
        int num = teclado.nextInt();

        while (num > 0) {
            aux = num%10;
            num -= aux;
            num /= 10;
            if(aux%2 == 0){
                cnt++;
            }
        }
        System.out.println("Hay " + cnt + "c dígitos pares en el número.");
    }
}