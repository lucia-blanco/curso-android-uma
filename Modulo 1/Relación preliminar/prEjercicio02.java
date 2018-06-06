/*
* Ejercicio 2 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

// Al introducir un número entero, el programa se ejecuta correctamente y lo lee
// Si introducimos un caracte que no es int, salta un error java.util.InputMismatchException

import java.util.Scanner;

public class prEjercicio02 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = teclado.nextInt();
    
    teclado.close();
    }
}
