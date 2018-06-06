/*
* Ejercicio 8.1 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio081 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int aux = 1;
    int total = 0;

    System.out.print("Introduce un número: ");
    num = teclado.nextInt();

    int cnt = num;

    while (cnt > 0) {
      total += aux;
      aux++;
      cnt--;
    }

    System.out.println("La suma de los " + num + " primeros números enteros positivos es: " + total);
  }
}
