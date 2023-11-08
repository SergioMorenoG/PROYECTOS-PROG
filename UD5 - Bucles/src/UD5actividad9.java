import java.util.Scanner;

public class UD5actividad9 {
    /*
     * Realiza un programa que nos diga cuántos dígitos tiene un número introducido
     * por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
     * la salvedad de que el anterior estaba limitado a números de 5 dígitos como
     * máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
     * esta manera, la única limitación en el número de dígitos la establece el tipo de
     * dato que se utilice (int o long).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber los dígitos que contiene: ");
        long numero = s.nextLong();
        numero = Math.abs(numero);
        int contador = 0;
        long i = numero;

        while (i > 1) {
            i /= 10;
            contador++;
        }

        // Con bucle while
        System.out.print("El número " + numero + " contiene un total de " + contador + " dígito/s.\n");

        s.close();
    }
}
