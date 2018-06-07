/*
 * Ejercicio 6 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E6R3 {
    private static final int pre1 = 100;
    private static final int pre2 = 95;
    private static final int pre3 = 90;
    private static final int pre4 = 85;


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int precio = 0;
        int num = 0;

        do {
            System.out.print("Introduce el número de artículos: ");
            num = teclado.nextInt();
        } while (num <= 0);

        switch(num){
            case 1:
                precio = pre1;
                break;
            case 2:
                precio = pre2;
                break;
            case 3:
                precio = pre3;
                break;
            default:
                precio = pre4;
        }

        System.out.print("El precio total a pagar es de " + (num*precio));
    }
}