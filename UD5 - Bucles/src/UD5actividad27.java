import java.util.Scanner;

public class UD5actividad27 {
    /*
   * Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
   * entre 1 y un número leído por teclado.
   */
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Escribe un número que sea mayor de 1: ");
    int numeroIntroducido = s.nextInt();

    int suma = 0;
    int multiplo = 0;

    for (int i = 1; i < numeroIntroducido; i++) {
        if (i % 3 == 0) {
            System.out.print(i + " ");
            multiplo++;
            suma += i;
        }
    }
    System.out.println("");
    System.out.print("Desde 1 hasta " + numeroIntroducido + " hay un total de " + multiplo + " multiplos de 3 y en total suman " + suma);
    s.close();
    }
}
