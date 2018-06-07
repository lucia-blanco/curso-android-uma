/*
 * Ejercicio 5 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E5R3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int num = teclado.nextInt();

        System.out.print("El número " + num);

        if (num%3 != 0 && num%4 != 0 && num%5 != 0){
            System.out.print(" no");
        }

        System.out.print(" es múltiplo de ");

        if (num%3 == 0){
            System.out.print(" 3");
        }

        if (num%4 == 0) {
            System.out.print(" 4");
        }
        if (num%5 == 0) {
            System.out.print(" 5");
        }

        if (num%3 != 0 && num%4 != 0 && num%5 != 0){
            System.out.print(" 3 4 5 ");
        }

        System.out.println();

    }
}
