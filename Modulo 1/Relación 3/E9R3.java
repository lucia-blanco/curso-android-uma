/*
 * Ejercicio 9 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E09R3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int day;
        int mes;
        int year;

        do {
            System.out.print("Día: ");
            day = teclado.nextInt();
        } while (1 <= day && day >= 31);

        do {
            System.out.print("Mes: ");
            mes = teclado.nextInt();
        } while (1 < mes && mes > 12);

        System.out.print("Año: ");
        year = teclado.nextInt();

        System.out.println();

        System.out.println("Día: " + day);
        System.out.print("Mes: ");
        switch(mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            default:
                System.out.println("Diciembre");
                break;
        }
        System.out.println("Año: " + year);
    }
}