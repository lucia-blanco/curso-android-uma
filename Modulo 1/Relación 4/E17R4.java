/*
 * Ejercicio 17 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E17R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int objetos = 0;
        boolean pierde = false;
        int num;

        do {
            System.out.print("Introduce el número de objetos: ");
            objetos = teclado.nextInt();
        } while (objetos < 1);


        if (objetos%2 == 0) {
            while (!pierde) {
                do {
                    System.out.print("Introduce el número de objetos a retirar (1 - 2  - 3): ");
                    num = teclado.nextInt();
                } while (num > 3 || num < 1);
                objetos -= num;
                System.out.println("T Quedan " + objetos + " objetos");

                if (objetos % 2 == 0 && objetos >= 4) {
                    System.out.println("La máquina retira: " + 3 + " objetos.");
                    objetos -= 3;
                } else if (objetos <=4 ){
                    System.out.println("La máquina retira: " + (objetos - 1) + " objetos.");
                    objetos -= (objetos - 1);
                } else {
                    System.out.println("La máquina retira: " + 2 + " objetos.");
                    objetos -= 2;
                }
                System.out.println("M Quedan " + objetos + " objetos");
                do {
                    System.out.print("Introduce el número de objetos a retirar (1 - 2  - 3): ");
                    num = teclado.nextInt();
                } while (num > 3 || num < 1);
                objetos -= num;
                System.out.println("T Quedan " + objetos + " objetos");

                if (objetos <= 0) {
                    pierde = true;
                    System.out.println("Game Over");
                }

            }
        } else {

        }
        System.out.println("Game Over");
    }
}
