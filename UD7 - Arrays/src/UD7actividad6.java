import java.util.Scanner;

public class UD7actividad6 {
    /*
     * Escribe un programa que lea 15 números por teclado y que los almacene en un
     * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
     * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
     * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
     * del array.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[15];

        for (int i = 1; i < 16; i++) {
            if (i < 15) {
                System.out.print("Introduzca el número " + i + "º: ");
                num[i] = s.nextInt();
            } else {
                System.out.print("Introduzca el número " + i + "º: ");
                num[0] = s.nextInt();
            }
        }

        System.out.print("Los números introducidos son: ");

        for (int j = 0; j < 15; j++) {
            System.out.print(num[j] + " ");
        }
    
    s.close();
    
    
    }
}
