
/*
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado.
 */

import java.util.Scanner;

public class UD3actividad2 {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de euros que quieres convertir en pesetas: ");
        double euros = c.nextDouble();

        // 1 euro equivale a 166.386 pesetas
        double pesetas = euros * 166.386;

        System.out.printf("La cantidad de " + euros + " euros, es igual a " + "%.2f" + " pesetas.", pesetas);

        c.close();
    }
}
