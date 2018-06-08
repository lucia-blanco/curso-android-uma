/*
 * Ejercicio 16 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E16R4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Piensa un número e intentaré adivinarlo: ");
        System.out.print("Introduce el primer número del intervalo: ");
        int inter1 = teclado.nextInt();
        System.out.print("Introduce el segundo número del intervalo: ");
        int inter2 = teclado.nextInt();

        int i = 1;
        boolean acertado = false;
        if (inter1 > inter2) {
            inter1 += inter2;
            inter2 = inter1 - inter2;
            inter1 = inter1 - inter2;
        }
        System.out.println("1: " + inter1);
        System.out.println("2: " + inter2);

        while(!acertado){
            int num = inter1 + ((inter2-inter1)/2);
            System.out.println("¿Es el " + num + "?");
            System.out.println("[0] Sí  |  [1] Tu número es mayor  |  [-1] Tu número es menor");
            int opcion = teclado.nextInt();
            switch(opcion){
                case 0:
                    acertado = true;
                    System.out.println("¡Demasiado fácil!");
                    break;
                case 1:
                    inter1 = num+1;
                    break;
                case -1:
                    inter2 = num-1;
                    break;
                default:
                    System.out.println("Comando no disponible");
                    i--;
                    break;
            }
            if ((inter1 > inter2) || (inter2 < inter1)){
                System.out.println("No seas tramposo");
            }
        }
        if (!acertado){
            System.out.println("GG WP");
        }
    }
}
