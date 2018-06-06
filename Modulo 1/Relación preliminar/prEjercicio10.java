/*
* Ejercicio 10 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio10 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int sec;
    boolean isHere = false;
    
    do {
      System.out.print("Introduce un número (distinto de 0): ");
      num = teclado.nextInt();
    } while (num == 0);

    do {
      System.out.print("Introduce un número de la secuencia: ");
      sec = teclado.nextInt();
      if (sec == num) {
        isHere = true;
      }
    } while (sec != 0);

    if (isHere) {
      System.out.println("El número " + num + " se encuentra en la secuencia.");
    } else {
      System.out.println();
      System.out.println("El número " + num + " no se encuentra en la secuencia.");
    }
  }
}
