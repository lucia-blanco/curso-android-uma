/*
 * Ejercicio 5 | Relacion 1 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E5R1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la velocidad a la que se desplaza el vehículo (km/h): ");
        double speed = Double.parseDouble(teclado.nextLine());
        System.out.print("Introduce el tiempo que ha circulado (h): ");
        double time = Double.parseDouble(teclado.nextLine());

        System.out.print("El vehículo ha recorrido: " + (speed*time) + "km.");
    }
}
