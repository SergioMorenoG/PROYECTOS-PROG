import java.util.Scanner;

public class UD5actividad13 {
    /*
     * Escribe un programa que lea una lista de diez números y determine cuántos
     * son positivos, y cuántos son negativos.
     */
    public static void main(String[] args) {
        int contadorPos = 0;
        int contadorNeg = 0;
        int contador = 1;
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Introduce el número " + contador + ": " );
            int numero = s.nextInt();
                if (numero < 0) {
                    contadorNeg++;
                } else
                    contadorPos++;
            contador++;
        } while (contador < 11);

        System.out.print("Hay un total de " + contadorPos + " positivos " + "y un total de " + contadorNeg + " negativos.");
        s.close();
    }
}
