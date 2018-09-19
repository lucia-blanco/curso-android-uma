/*
 * Ejercicio 10 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E10R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N = 0;
        do {
            System.out.print("Introduce la altura: ");
            N = teclado.nextInt();
        } while (N%2 != 0 && N < 20);

        //Triangulo Invertido
        for (int fil = 0; fil < N/2; ++fil) {
            pintaEspacios(fil-1);
            pintaNumerosInv(N, fil);
            if (fil != (N/2)-1){
                System.out.println();
            }
        }
        //Triangulo
        for (int fil = 0; fil <= N/2; ++fil) {
            pintaEspacios((N/2)-fil-1);
            pintaNumeros(fil, N);
            System.out.println();

        }
    }

    private static void pintaEspacios (int esp){
        for (int col = 0; col <= esp; ++col) {
            System.out.print(" ");
        }
    }

    private static void pintaNumeros(int fil, int h){
        int num = (h/2)-fil+1;
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

    private static void pintaNumerosInv(int h, int fil){
        int num = fil+1;
        for (int col = 1; col < h-(fil*2); ++col) {
            if (num > 9){
                System.out.print(num - (num/10)*10);
            } else {
                System.out.print(num);
            }

            if (col < h/2){
                num++;
            } else {
                num--;
            }
        }
    }

}
