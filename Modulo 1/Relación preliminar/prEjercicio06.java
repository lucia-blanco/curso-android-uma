/*
* Ejercicio 6 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio06 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Introduce un número: ");
    int num1 = Integer.parseInt(teclado.nextLine());

    System.out.print("Introduce otro número: ");
    int num2 = Integer.parseInt(teclado.nextLine());

    System.out.print("Introduce otro número más: ");
    int num3 = Integer.parseInt(teclado.nextLine())
    
    if (num1 > num2 && num1 > num3) {
      System.out.println(num1 + " es el mayor estricto.");
    } else if (num2 > num1 && num2 > num3) {
      System.out.println(num2 + " es el mayor estricto.");
    } else if (num3 > num2 && num3 > num1) {
      System.out.println(num3 + " es el mayor estricto.");
    } else if (num1 == num2 && num1 == num3) {
      System.out.println("Los tres números son iguales, no hay mayor estricto.");
    } else if (num1 == num2 || num1 == num3 || num2 == num3) {
      System.out.println("Hay números iguales por parejas, así que no hay mayor estricto.");
    }
  }
}
