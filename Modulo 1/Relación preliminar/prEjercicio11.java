/*
* Ejercicio 11 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio11 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int sum = 0;
    boolean esPrimo = true;

    do {
      System.out.print("Introduce un número: ");
      num = teclado.nextInt();
      for (int i = 2; i < num; i++) {
        if ((num % i) == 0) {
          esPrimo = false;
        }
      }
      if (esPrimo) {
        sum += num;
      }
      esPrimo = true;
    } while (num != 0);

    System.out.println("La suma de los números primos introducidos es " +  sum);
  }
}
