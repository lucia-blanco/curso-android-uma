/*
* Ejercicio 7 | Modulo 1 | Relación Preliminar de Problemas
* @author Lucía Blanco
*/

import java.util.Scanner;

public class prEjercicio07 {
  private static final int preUn = 100;
  private static final int IVA = 12;
  private static final int preDes = 300;
  private static final int des = 5;
  
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    System.out.print("Introduce el número de unidades: ");
    int unidades = teclado.nextInt();
    
    int total = (preUn*unidades);
    double totalIVA = total + total*((double)(IVA)/100);

    if (totalIVA > preDes) {
      System.out.printf("El total sin IVA es: %30d \n", total);
      System.out.printf("El total con IVA es: %30.2f \n", totalIVA);
      System.out.printf("El total a pagar tras el %d%s de descuento es: %.2f \n", des, "%", (totalIVA*((100-(double)(des))/100)));
    } else if (totalIVA <= preDes) {
      System.out.printf("El total sin IVA es: %6d \n", total);
      System.out.printf("El total con IVA es: %.2f \n", totalIVA);
    }
  }
}
