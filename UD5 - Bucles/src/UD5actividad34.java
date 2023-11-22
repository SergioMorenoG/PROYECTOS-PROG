import java.util.Scanner;

public class UD5actividad34 {
        /*
       * Escribe un programa que pida dos números por teclado y que luego mezcle en
       * dos números diferentes los dígitos pares y los impares. Se van comprobando los
       * dígitos de la siguiente manera: primer dígito del primer número, primer dígito
       * del segundo número, segundo dígito del primer número, segundo dígito del
       * segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
       * podemos suponer que el usuario introducirá dos números de la misma longitud
       * y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
       * int donde sea necesario para admitir números largos. REVISARLO MAÑANA
       */

       REVISAR EJERCICIO
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número: ");
        long primerNumero = s.nextInt();
        System.out.print("Introduzca otro número: ");
        long segundoNumero = s.nextInt();

        
        long numero1 = primerNumero;
        long numero2 = segundoNumero;
        int longitud1 = 0;
        int longitud2 = 0;
        long volteado1 = 0;
        long volteado2 = 0;

        while (numero1 > 0) {
            volteado1 = (volteado1 * 10) + (numero1 % 10);
            numero1 /= 10;
            longitud1++;
        }
        
        while (numero2 > 0) {
            volteado2 = (volteado2 * 10) + (numero2 % 10);
            numero2 /= 10;
            longitud2++;
        }
    

    }
}
