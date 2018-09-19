/*
 * Ejercicio 1 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E01R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h = 0;
        do {
            System.out.print("Introduce la altura: ");
            h = teclado.nextInt();
        } while (h < 1 && h > 10);

        for (int fil = 0; fil <= h; ++fil) {
            pintaEspacios(fil, h);
            int num = fil-1;
            pintaNumeros(fil, num);
            System.out.println();
        }
    }
    private static void pintaEspacios (int fil, int h){
        for (int col = 0; col <= h-fil-1; ++col) {
            System.out.print(" ");
        }
    }
    private static void pintaNumeros(int fil, int num){
        for (int col = 1; col < 2*fil; ++col) {
            if (col <= fil){
                System.out.print(col);
            }
            if (col > fil){
                System.out.print(num);
                num--;
            }
        }
    }
}