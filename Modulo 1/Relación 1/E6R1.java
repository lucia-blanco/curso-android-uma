/*
 * Ejercicio 6 | Relacion 1 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E6R1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número real: ");
        double num = Double.parseDouble(teclado.nextLine());

        int entero = (int)(num);
        double decimal = num - entero;
        System.out.println("Parte entera: " + entero);
        System.out.println("Parte decimal: " + decimal);
    }
}