/*
 * Ejercicio 11 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E11R3 {
    private static final int gFijos = 1;
    private static final double e100 = 0.5;
    private static final int prim = 100;
    private static final double e150 = 0.35;
    private static final int sec = 150;
    private static final double eRes = 0.25 ;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double total = 1;

        System.out.print("Introduce el primer valor de kw: ");
        int kw1 = teclado.nextInt();
        System.out.print("Introduce el segundo valor de kw: ");
        int kw2 = teclado.nextInt();

        int kw = kw2 - kw1;

        if (kw <= prim) {
            System.out.println("El total a pagar es de: " + (kw*e100 + 1));
        } else if (kw <= (prim +sec)){
            System.out.println("El total a pagar por los primeros " + prim + "Kw es de: " + (prim*e100));
            System.out.println("El total a pagar por los segundos " + sec + "Kw es de: " + ((kw-prim)*e150));
            System.out.println("El total a pagar es de " + ((prim*e100 + (kw-prim)*e150) + 1));
        } else {
            System.out.println("El total a pagar por los primeros " + prim + "Kw es de: " + (prim*e100));
            System.out.println("El total a pagar por los segundos " + sec + "Kw es de: " + (sec*e150));
            System.out.println("El total a pagar por el resto es de " + ((kw - (prim + sec))*eRes));
            System.out.println("El total a pagar es de " + ((prim*e100 + sec*e150 + (kw - (prim + sec))*eRes) + 1));
        }
    }
}