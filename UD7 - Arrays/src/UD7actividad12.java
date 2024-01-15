import java.util.Scanner;

public class UD7actividad12 {
    /*
     * Realiza un programa que pida 10 números por teclado y que los almacene en
     * un array. A continuación se mostrará el contenido de ese array junto al índice
     * (0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
     * “inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
     * números están entre 0 y 9. El programa deberá colocar el número de la posición
     * inicial en la posición final, rotando el resto de números para que no se pierda
     * ninguno. Al final se debe mostrar el array resultante.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];
        int cambio[] = new int[10];
        int i = 0;
        boolean valido;

        for (i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + "º: ");
            num[i] = s.nextInt();
        }
        
        int inicial = 0;
        int finale = 0;

        do {
            valido = true;
            System.out.print("Introduzca una posición del array a cambiar: ");
            inicial = s.nextInt();
            System.out.print("Introduzca la posición por la que se deba de cambiar: ");
            finale = s.nextInt();
            if (inicial > finale) {
                System.out.println("El incial no puede ser mayor al final...");
                valido = false;
            } else if (finale < inicial) {
                System.out.println("El final no puede ser menor que el inicial...");
                valido = false;
            } else if (inicial < 0 || inicial > 9) {
                System.out.println("El inicial debe estar comprendido entre 0 y 9...");
                valido = false;
            } else if (finale < 0 || finale > 9) {
                System.out.println("El final debe estar comprendido entre 0 y 9... ");
                valido = false;
            }
        } while (valido = false);

        for (i = 0; i < 10; i++) {
            cambio[i] = num[i];
        }

        cambio[finale] = num[inicial];

        for (i = finale + 1; i < 10; i++) {
            cambio[i] = num [i - 1];
        }

        cambio[0] = num[9];

        for (i = 0; i < inicial; i++) {
            cambio[i + 1] = num [i];
        }

        System.out.println("\n El array original es este: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        System.out.println("\n El array con el cambio queda así:");
        for (i = 0; i < 10; i++) {
            System.out.print(cambio[i] + " ");
        }
    }
}
