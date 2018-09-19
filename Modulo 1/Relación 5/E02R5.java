/*
 * Ejercicio 2 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E02R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int h = 0;
        do {
            System.out.print("Introduce la altura: ");
            h = teclado.nextInt();
        } while (h < 1);

        int h2 = h/2;
        // Primera mitad
        primeraMitad((h/2)+1);
        // Segunda mitad
        segundaMitad(h/2, h);
    }

    private static void primeraMitad (int h1) {
        for (int fil = 0; fil < h1; ++fil) {
            pintaPrimera(h1-fil-1, "  ");
            pintaPrimera(2*fil+1, " *");
            System.out.println();
        }
    }

    private static void pintaPrimera (int n, String car) {
        for (int col = 0; col < n; ++col) {
            System.out.print(car);
        }
    }

    private static void segundaMitad (int h2, int h) {
        int col = 0;
        for (int fil = 1; fil <= h2; ++fil) {
            col = 1;
            while (col <= fil){
                System.out.print("  ");
                col++;
            }
            int rombo = (h - fil*2);
            for (int i = 1; i <= rombo; i++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
