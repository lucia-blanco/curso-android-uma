/*
 * Ejercicio 3 | Modulo 1 | Relación 5
 * @author Lucía Blanco
 */

import java.util.Scanner;

public class E03R5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int iter = 0;
        boolean esPalindromo = false;
        int i = 0;

        System.out.print("Introduzca el número natural para aplicar la Conjetura del Palíndromo: ");
        int num = teclado.nextInt();
        System.out.print("Introduzca el número máximo de iteraciones (máximo 10): ");
        do {
            iter = teclado.nextInt();
        } while (iter < 1 && iter > 11);

        int numDig = digitos(num);
        int numReves = reves (num, numDig);
        esPalindromo = palindromo(num, numReves, numDig);

        while (!esPalindromo && i < iter){
            num += numReves;
            System.out.println("num = " + num + " y reverso: "+ numReves);

            numDig = digitos(num);
            numReves = reves (num, numDig);
            esPalindromo = palindromo(num, numReves, numDig);


            i++;
        }

        if (esPalindromo) {
            System.out.print("SÍ se cumple la Conjetura del Palíndromo. El Palíndromo es: " + num);
        } else {
            System.out.print("NO se cumple la Conjetura del Palíndromo tras hacer " + iter +  " Siteraciones");
        }
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

    private static boolean palindromo (int num, int numReves, int numDig) {
        boolean palindromo = false;

        int numDerecho = num;
        int cifraDerecho = 0;
        int cifraReves = 0;
        numDig /= 2;
        do{
            cifraDerecho = numDerecho%10;
            cifraReves = numReves%10;
            if (cifraDerecho == cifraReves){
                palindromo = true;
            } else {
                palindromo = false;
            }
            numDerecho /= 10;
            numReves /= 10;
            numDig--;
        } while ((numDig > 0) && palindromo);

        return palindromo;
    }
}
