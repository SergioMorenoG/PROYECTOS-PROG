import java.util.Scanner;

public class UD5actividad20 {
    /*
     * Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura que debe tener la pirámide: ");
        int altura = s.nextInt();
        System.out.print("Qué carácter debe llevar la pirámide: ");
        char pintar = s.next().toCharArray()[0];


        for (int numFilas = 1; numFilas <= altura; numFilas++) {

            for (int espacios = 1; espacios <= (altura-numFilas); espacios++) {
                System.out.print(" ");
            }

            for (int caracter = 1; caracter <= ((2 * numFilas) - 1); caracter++) {
                if (numFilas == 1 || numFilas == altura || caracter == 1 || caracter == ((2*numFilas)-1)) {
                    System.out.print(pintar);
                } else
                    System.out.print(" ");
            }

            System.out.println("");
        }
        s.close();
    }
}
