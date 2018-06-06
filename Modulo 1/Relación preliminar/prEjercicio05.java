/*
* Ejercicio  | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio05 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(teclado.nextLine());

    System.out.print("Introduce otro número: ");
    int num2 = Integer.parseInt(teclado.nextLine());
    
    if (num2 % num1 == 0) {
      System.out.println("El primer número es divisor del segundo número");
    } else {
      System.out.println("El primer número no es divisor del segundo número.");
    }
    
    if (num1 % num2 == 0) {
      System.out.println("El segundo número es divisor del primer número.");
    } else {
      System.out.println("El segundo número no es divisor del primer número.");
    }
  }
}
