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
            
        long volteado3 = volteado1;

        while (numero2 > 0) {
            volteado2 = (volteado2 * 10) + (numero2 % 10);
            numero2 /= 10;
            longitud2++;
        }

        long volteado4 = volteado2;

        long normal1 = 0;
        long normal2= 0;
        long soloDigito1 = 0;
        long soloDigito2= 0;


        System.out.print("El número formado por los dígitos pares es ");
        for (int i = 0; (i < longitud1 || i < longitud2); i++) {
            if (i < longitud1) {
                normal1 = (normal1 * 10) + (volteado1 % 10);
                volteado1 /= 10;
                soloDigito1 = normal1;
                if (soloDigito1 > 10) {
                    soloDigito1 = (soloDigito1 % 10);
                }
                if (soloDigito1 % 2 == 0) {
                    System.out.print(soloDigito1);
                    }
            if (i < longitud2) {
                normal2 = (normal2 * 10) + (volteado2 % 10);
                volteado2 /= 10;
                soloDigito2 = normal2;
                if (soloDigito2 > 10) {
                    soloDigito2 = (soloDigito2 % 10);
                }
                if (soloDigito2 % 2 == 0) {
                    System.out.print(soloDigito2);
                }
            }
            }
        }

        long normal3 = 0;
        long normal4= 0;
        long soloDigito3 = 0;
        long soloDigito4= 0;

        System.out.print("\nEl número formado por los dígitos impares es ");
        for (int j = 0; (j < longitud1 || j < longitud2); j++) {
            if (j < longitud1) {
                
                normal3 = (normal3 * 10) + (volteado3 % 10);
                volteado3 /= 10;
                soloDigito3 = normal3;
                if (soloDigito3 > 10) {
                    soloDigito3 = (soloDigito3 % 10);
                }
                if (soloDigito3 % 2 != 0) {
                    System.out.print(soloDigito3);
                }
            if (j < longitud2) {
                normal4 = (normal4 * 10) + (volteado4 % 10);
                volteado4 /= 10;
                soloDigito4 = normal4;
                if (soloDigito4 > 10) {
                }
                    soloDigito4 = (soloDigito4 % 10);
                if (soloDigito4 % 2 != 0) {
                    System.out.print(soloDigito4);
                }
            }
        }
        s.close();
    }
    }
}
