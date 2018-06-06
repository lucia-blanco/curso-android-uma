/*
* Ejercicio 4 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio04 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double mb, kb, aux;
    
    System.out.print("Introduce un número de bytes: ");
    double bytes = teclado.nextDouble();

    mb = bytes /(1024*1024);
    aux = mb - (int)mb;
    mb = (int)mb;
    kb = aux * 1024;
    aux = kb - (int)kb;
    kb = (int)kb;
    bytes = aux * 1024;

    System.out.println((int)(mb) + "Mb, " + (int)(kb) + "Kb, " + (int)(bytes) + "bytes.");
  }
}
