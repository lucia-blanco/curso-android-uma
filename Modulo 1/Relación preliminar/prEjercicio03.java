/*
* Ejercicio 3 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio03 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un la nota de la parte de teoría: ");
    double teoria = teclado.nextDouble();
    
    System.out.print("Introduce un la nota de la parte de problemas: ");
    double problemas = teclado.nextDouble();
    
    System.out.println("La nota final es: " + (0.7*teoria + 0.3*problemas));
    teclado.close();
  }
}
