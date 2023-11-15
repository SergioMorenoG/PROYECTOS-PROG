import java.util.Scanner;

public class UD5actividad19 {
    /*
     * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
     * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
     * pedir por teclado.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la altura que debe tener la pirámide: ");
        int altura = s.nextInt();
        System.out.print("Qué carácter debe llevar la pirámide: ");
        //Con este método obligamos al usuario a introducir solo un caracter
        char pintar = s.next().toCharArray()[0];
        // s.nextLine();
        //String pintar = s.nextLine();

        for (int numFilas = 1; numFilas <= altura; numFilas++) {

            for (int espacios = 1; espacios <= (altura-numFilas); espacios++) {
                System.out.print(" ");
            }

            for (int caracter = 1; caracter <= ((2 * numFilas) - 1); caracter++) {
                System.out.print(pintar);
            }

            System.out.println("");
        }
        s.close();
    }
}
