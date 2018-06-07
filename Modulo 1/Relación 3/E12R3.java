/*
 * Ejercicio 12 | Relacion 3 | Modulo 1
 * @author Lucia Blanco
 */

import java.util.Scanner;

public class E12R3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cnt = 1;

        System.out.print("Introduce el código: ");
        int cod = teclado.nextInt();

        if (cod < 1000 || cod > 9999){
            System.out.println("ERROR: CODIGO INVALIDO. EL CÓDIGO DEBE TENER 4 DÍGITOS.");
        } else {
            int cont = cod%10;
            int prov = (cod - (cod%1000))/1000;
            int numOp = (cod - (prov*1000 + cont))/10;

            if (numOp%prov != cont){
                System.out.println("ERROR: CODIGO INVALIDO. EL DÍGITO DE CONTROL ES ERRÓNEO.");
            } else {
                System.out.printf("PROVINCIA %13d \n", prov);
                System.out.printf("NUMERO DE OPERACION %3d \n", numOp);
                System.out.printf("DIGITO DE CONTROL %5d \n", cont);
            }
        }

    }
}