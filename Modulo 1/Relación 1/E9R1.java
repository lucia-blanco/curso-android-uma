/*
 * Ejercicio 8 | Relacion 1 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;
public class E9R1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a = 6, b = 14;
        int auxiliar;
        System.out.println("a vale " + a + " y b vale "+ b);
       // ¿Qué hacen estas tres sentencias?
        // Se crea una variable auxiliar que permita guardar el valor de a, de forma que es posible machacar a
        // con el valor que tenga b y poder darle a b el que tenía a.
       /* auxiliar = a;
        a = b;
        b = auxiliar; */

       a = a + b;
       b = a - b;
       a = a - b;

       // Este caso es análogo porque juega con la suma y la resta. Suma a a el valor de b, de forma que
        // para obtener a de la suma, la resta (y lo mismo con b.

        System.out.println("a vale " + a + " y b vale "+ b);

        teclado.close();
    }
}

