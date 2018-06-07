/*
* Ejercicio 3 | Relacion 1 | Modulo 1
* @author Lucia Blanco
*/

import java.util.Scanner;

public class E3R1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduce otro número: ");
        int num2 = teclado.nextInt();

        System.out.print("La suma de los dos números es: " + (num1 + num2));

        /* Si lo ejecutamos con los datos  de entrada 1 y 3000000000 no funciona, ya que
        el tipo int es demasiado pequeño. Necesitaríamos usar el tipo long */
    }
}
