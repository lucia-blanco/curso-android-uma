/*
 * Ejercicio 8 | Relacion 1 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E8R1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce una cantidad de segundos: ");
        double sec = Double.parseDouble(teclado.nextLine());

        double week = (double)(sec)/(60*60*24*7);
        double aux = week - (int)(week);
        week = (int)week;
        double day = aux * 7;
        aux = day - (int)day;
        day = (int)day;
        double hour = aux * 24;
        aux = hour - (int)hour;
        hour = (int)hour;
        double min = aux * 60;
        aux = min - (int)min;
        min = (int)min;
        sec = aux * 60;

        System.out.println("Week: " + week + " day: " + day + " hour: " + hour + " min: " + min + " sec: " + sec);

    }
}