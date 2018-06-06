/*
* Ejercicio 8.2 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio082 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int aux = 1;
    int total = 0;

    System.out.print("Introduce un número: ");
    num = teclado.nextInt();

    int cnt = num;

    do {
      total += aux;
      aux++;
      cnt--;
    } while (cnt > 0);

    System.out.println("La suma de los " + num + " primeros números enteros positivos es: " + total);
  }
}
