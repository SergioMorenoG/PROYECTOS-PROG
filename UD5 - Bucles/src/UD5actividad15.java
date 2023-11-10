import java.util.Scanner;

public class UD5actividad15 {
    /*
     * Escribe un programa que dados dos números, uno real (base) y un entero
     * positivo (exponente), saque por pantalla todas las potencias con base el
     * numero dado y exponentes entre uno y el exponente introducido. No se deben
     * utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
     * se deberá mostrar 2^1, 2^2, 2^3, 2^4 y 2^5
     */
    public static void main(String[] args) {
        int contador = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = s.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente = s.nextInt();

        while (contador <= exponente) {
            if (contador == 1) {
                System.out.print(base + "^" + contador);
            } else if (contador >= 2)
                System.out.print(", " + base + "^" + contador);
                contador++;
        }
        s.close();
    }
}
