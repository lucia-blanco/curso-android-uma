/*
 * Ejercicio 12 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E12R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un valor n: ");
        int N = teclado.nextInt();

        int media = N;
        int mayor = N;
        int menor = N;

        for (int i = 1; i < N; i++) {
            System.out.print("Introduce un valor: ");
            int num = teclado.nextInt();
            media += num;
            if (num < menor){
                menor = num;
            } else if (num > mayor) {
                mayor = num;
            }
        }
        System.out.println("La media es: " + (media/N));
        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);
    }
}
