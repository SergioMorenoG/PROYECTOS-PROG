import java.util.Scanner;

public class UD7actividad11 {
    /*
     * Realiza un programa que pida 10 números por teclado y que los almacene en
     * un array. A continuación se mostrará el contenido de ese array junto al índice
     * (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
     * primos a las primeras posiciones, desplazando el resto de números (los que no
     * son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
     * array resultante.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];
        int primos[] = new int[10];
        int noPrimos[] = new int[10];
        int i = 0;
        int j = 2;
        int conteoPrimos = 0;
        int conteoNoPrimos = 0;
        boolean esPrimo = false;

        for (i = 0; i < 10; i++) {
            System.out.print("Introduce el número " + (i + 1) + "º: ");
            num[i] = s.nextInt();
        }
    
        esPrimo = true;
        for (j = 2; j < num[j] - i; j++) {
            if (num[i] % j != 0) {
                esPrimo = false;
                if (esPrimo) {
                    primos[conteoPrimos++] = num[i];
                } else {
                    noPrimos[conteoNoPrimos++] = num[i];
                }
            }
        }

        System.out.println("\n El array original es este: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        for (i = 0; i < conteoPrimos; i++) {
            num[i] = primos[i];
        }

        for (i = conteoPrimos; i < conteoPrimos + conteoNoPrimos; i++) {
            num[i] = noPrimos[i - conteoPrimos];
        }

        System.out.println("\n La lista con los numeros primos en primera posición queda así: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }

        s.close();
    }
}
