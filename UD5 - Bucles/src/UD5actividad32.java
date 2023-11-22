import java.util.Scanner;

public class UD5actividad32 {
    /*
   * Escribe un programa que, dado un número entero positivo, diga cuáles son y
   * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
   * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
   * números largos.
   */
    public static void main(String[] args) {
        int longitud = 0;
        long volteado = 0;
        int digito = 0;
        int sumatorio = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introzca un número entero positivo: ");
        long numeroIntroducido = s.nextInt();

        long numero = numeroIntroducido;

        while (numero < 0) {
            System.out.print("El número no es positivo, introduzca otro: ");
            numeroIntroducido = s.nextInt();
        }

        if (numero == 0) {
            longitud = 1;
        }
        while (numero > 0) {
            volteado = (volteado * 10) + (numero % 10);
            numero /= 10;
            longitud++;
        }

        System.out.print("Dígitos pares: ");

        for (int i = 0; i < longitud; i++) {
            digito = (int)(volteado % 10);
            if (digito % 2 == 0) {
                System.out.print(digito + " ");
                sumatorio += digito;
            }
            volteado /= 10;
        }
        System.out.print("\nSuma de los dígitos pares: " + sumatorio);

    }
}
