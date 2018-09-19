/*
 * Ejercicio 5 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E05R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int N;

        do {
            System.out.print("Introduce un número: ");
            N = teclado.nextInt();
        } while (N < 1);

        System.out.println("para el número: " + N);
        System.out.print("la salida es: ");
        suma(N);
    }

    private static int digitos (int num){
        int numDig = 0;
        while (num > 0) {
            num /= 10;
            numDig++;
        }
        return numDig;
    }
    private static int reves (int num, int numDig) {
        int numBasura = num;
        int numReves = 0;
        while (numBasura > 0){
            numReves = ((numReves*10) + (numBasura % 10));
            numBasura /=10;
        }
        return numReves;
    }

    private static void suma (int num) {
        int dig = digitos(num);
        int reves = reves(num, dig);

        int cifraDerecho = 0;
        int cifraReves = 0;
        int suma = 0;
        boolean par = (dig%2==0);
        dig /= 2;

        do{
            cifraDerecho = num%10;
            cifraReves = reves%10;
            suma = cifraDerecho+cifraReves;
            num /= 10;
            reves /= 10;
            if (dig > 0) {
                System.out.print(cifraReves +" + " + cifraDerecho + " = " + suma + ", ");
            } else if (dig == 0 && !par){
                System.out.print(cifraReves);
            }
            dig--;
        } while (dig >= 0);

    }
}
