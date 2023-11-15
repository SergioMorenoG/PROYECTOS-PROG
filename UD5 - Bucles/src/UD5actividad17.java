import java.util.Scanner;

public class UD5actividad17 {
    /*
     * Realiza un programa que sume los 100 números siguientes a un número entero
     * y positivo introducido por teclado. Se debe comprobar que el dato introducido
     * es correcto (que es un número positivo).
     */
    public static void main(String[] args) {
        int total = 0;
        int auxiliar = 0;
        int contador = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber la suma con los 100 siguientes números: ");
        int numero = s.nextInt();

        while (numero <= 0) {
            System.out.print("El número debe ser positivo. Introduce otro número: ");
            numero = s.nextInt();
        }

        do {
            total = numero + auxiliar;
            auxiliar = total;
            numero++;
            contador++;
            
        } while (contador < 100);

        System.out.print("La suma de los 100 siguientes números es igual a " + total);
        s.close();
    }
}
