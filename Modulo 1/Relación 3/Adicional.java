/*
 * Ejercicio Adicional | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class Adicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 2;
        boolean encontrado = false;

        while (!encontrado){
            num++;
            int suma = 0;
            for (int i = 1; i <=(num/2); i++) {
                if (num%i == 0){
                    suma += i;
                }
            }
            if (suma == num) {
                encontrado = true;
            }
        }
        System.out.println(num + " es un número perfecto.");
    }
}