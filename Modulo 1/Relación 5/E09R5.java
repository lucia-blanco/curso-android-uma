/*
 * Ejercicio 9 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E09R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = 0;
        do {
            System.out.print("Introduce la altura: ");
            N = teclado.nextInt();
        } while (N < 1);

        for (int fil = 0; fil <= N; ++fil) {
            pintaEspacios(fil, N);

            pintaNumeros(fil);
            System.out.println();
        }
    }
    private static void pintaEspacios (int fil, int h){
        for (int col = 0; col <= h-fil-1; ++col) {
            System.out.print(" ");
        }
    }
    private static void pintaNumeros(int fil){
        int num = fil;
        for (int col = 1; col < 2*fil; ++col) {
            if (num > 9){
                System.out.print(num - (num/10)*10);
            } else {
                System.out.print(num);
            }

            if (col < fil){
                num++;
            } else {
                num--;
            }
        }
    }
}
