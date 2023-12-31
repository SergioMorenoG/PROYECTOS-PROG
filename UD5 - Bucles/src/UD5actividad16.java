import java.util.Scanner;

public class UD5actividad16 {
    /*
     * Escribe un programa que diga si un número introducido por teclado es o no
     * primo. Un número primo es aquel que sólo es divisible entre él mismo y la
     * unidad.
     */
    public static void main(String[] args) {
        boolean esPrimo = true;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber si es primo o no: ");
        int numero = s.nextInt();

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                esPrimo = false;
            }
        }

        if (esPrimo) {
            System.out.print("El numero introducido es un número primo.");
        } else {
            System.out.print("El número introducido NO es un número primo.");
        }

        s.close();
    }
}
