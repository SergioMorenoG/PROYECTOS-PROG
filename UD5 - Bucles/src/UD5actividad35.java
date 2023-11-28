import java.util.Scanner;

public class UD5actividad35 {
        /*
       * Realiza un programa que pinte una X hecha de asteriscos. El programa debe
       * pedir la altura. Se debe comprobar que la altura sea un número impar mayor o
       * igual a 3, en caso contrario se debe mostrar un mensaje de error.
       */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura de la X: ");
        int altura = s.nextInt();

        for (int numFilas = 1; numFilas <= altura; numFilas++) {

            for (int espacios = 1; espacios <= (altura-numFilas); espacios++) {
                System.out.print(" ");
            }

            for (int caracter = 1; caracter <= ((2 * numFilas) - 1); caracter++) {
                if (numFilas == 1 || numFilas == altura || caracter == 1 || caracter == ((2*numFilas)-1)) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }

            System.out.println("");
        }
        s.close();
    }
}

