/*
 * Ejercicio 9 | Modulo 1 | Relación 4
 * @author Lucía Blanco
 */


public class E9R4 {
    private static char B = 'B';
    private static char N = 'N';
    private static int size = 8;
    public static void main(String[] args) {
        for (int i = 1; i <= size; i++) {
            for (int j =1; j <= size; j++) {
                if (i%2 == 0) {
                    if (j % 2 == 0) {
                        System.out.print(B + " ");
                    } else {
                        System.out.print(N + " ");
                    }
                } else {
                    if (j % 2 == 0) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print(B + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
