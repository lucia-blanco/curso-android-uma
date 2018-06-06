/*
* Ejercicio 9 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio09 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num;
    int cntNeg = 0;
    int cnt = 0;
      
    do {
      System.out.print("Introduce un número: ");
      num = teclado.nextInt();
        if (num < 0) {
          cntNeg++;
        }
        cnt++;
    } while (num != 0);
    
    System.out.println("Números leídos: " + (cnt-1));
    System.out.println("Números negativos encontrados: " + cntNeg);
  }
}
