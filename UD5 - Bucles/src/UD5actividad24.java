import java.util.Scanner;

public class UD5actividad24 {
    /*
     * Escribe un programa que lea un número n e imprima una pirámide de números
     * con n filas como en la siguiente figura:
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = s.nextInt();

        for (int numFilas = 1; numFilas <= altura; numFilas++) {

            for (int espacios = 1; espacios <= (altura-numFilas); espacios++) {
                System.out.print(" ");
            }

            for (int numero = 1; numero <= ((2 * numFilas) - 1); numero++) {

            }
            
            System.out.println("");

        }
    
    
    
    }
}
