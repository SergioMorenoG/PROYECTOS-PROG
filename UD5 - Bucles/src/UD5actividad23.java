import java.util.Scanner;

public class UD5actividad23 {
    /*
     * Escribe un programa que permita ir introduciendo una serie indeterminada
     * de números mientras su suma no supere el valor 10000. Cuando esto último
     * ocurra, se debe mostrar el total acumulado, el contador de los números
     * introducidos y la media.
     */
    public static void main(String[] args) {
        int totalValor = 0;
        int contador = 0;
        int numeroIntroducido;
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa pide números hasta que el valor de la suma de todos supere a 10.000.");

        while (totalValor < 10000) {
            System.out.print("Introduce un número: ");
            numeroIntroducido = s.nextInt();
            contador++;
            totalValor += numeroIntroducido;
        }

        System.out.println("El total acumulado de los números introducidos es de " + totalValor);
        System.out.println("Se han introducido un total de " + contador + " números.");
        System.out.println("La media de los números introducidos es de " + (totalValor/contador));

    }
}
