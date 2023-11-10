import java.util.Scanner;

public class UD5actividad17 {
    /*
     * Realiza un programa que sume los 100 números siguientes a un número entero
     * y positivo introducido por teclado. Se debe comprobar que el dato introducido
     * es correcto (que es un número positivo).
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber la suma: ");
        int numero = s.nextInt();

        while (numero < 0) {
            System.out.print("El número debe ser positivo. Introduce otro número: ");
            numero = s.nextInt();
        }

        for(int i = numero; i+=100; i++)
            int total +=
    }
}
