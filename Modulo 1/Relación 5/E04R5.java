/*
 * Ejercicio 4 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E04R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N, i, pos;

        do {
            System.out.print("Introduce un número: ");
            N = teclado.nextInt();
        } while (N < 1);
        do {
            System.out.print("Introduce otro número");
            i = teclado.nextInt();
        } while (i < 0);

        if (i > digitos(N)){
            pos = -1;
        } else {
            pos = posicion(N, i);
        }
        System.out.println("En la posición " + i + " del número " + N + ", se encuentra el " + pos);

    }

    private static int digitos (int num){
        int numDig = 0;
        while (num > 0) {
            num /= 10;
            numDig++;
        }
        return numDig;
    }

    private static int reves (int num, int numDig) {
        int numBasura = num;
        int numReves = 0;
        while (numBasura > 0){
            numReves = ((numReves*10) + (numBasura % 10));
            numBasura /=10;
        }
        return numReves;
    }

    private static int posicion (int num, int i) {
        int reves = reves(num, digitos(num));
        i++;
        while (i > 0) {
            reves /= 10;
            i--;
        }
        return reves%10;
    }

}
