import java.util.Scanner;

public class UD5actividad25 {
    /*
   * Realiza un programa que pida un número por teclado y que luego muestre ese
   * número al revés.
   */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber como es del revés: ");
        int numeroIntroducido = s.nextInt();

        int invertido = 0;
        int resto = 0;
        while (numeroIntroducido > 0) {
            resto = numeroIntroducido % 10;
            invertido = invertido * 10 + resto;
            numeroIntroducido /= 10;
        }
        System.out.print("Número invertido: " + invertido);

    }
}
