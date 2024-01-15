import java.util.Scanner;

public class UD7actividad13 {
    /*
     * Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios 
     * comprendidos entre 0 y 500 (ambos incluidos). A continuación
     * el programa mostrará el array y preguntará si el usuario quiere destacar el
     * máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
     * el número destacado entre dobles asteriscos.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[100];
        int i = 0;
        int minimo = Integer.MAX_VALUE;
        int maximo = Integer.MIN_VALUE;

        for (i = 0; i < 100; i++) {
            num[i] = (int) (Math.random()*501);
            System.out.print(num[i] + " ");
            if (num[i] < minimo) {
                minimo = num[i];
            } else if (num[i] > maximo) {
                maximo = num[i];
            }
        }

        int opcion = 0;

        System.out.print("\n¿Qué quiere destacar? (1 - Mínimo, 2- Máximo): ");
        opcion = s.nextInt();

        if (opcion == 1) {
            for (i = 0; i < 100; i++) {
                if (num[i] != minimo) {
                    System.out.print(num[i] + " ");
                } else {
                    System.out.print("**" + num[i] + "**" + " ");
                }
            }
        } else if (opcion == 2) {
            for (i = 0; i < 100; i++) {
                if (num [i] != maximo) {
                    System.out.print(num[i] + " ");
                } else {
                    System.out.print("**" + num[i] + "**" + " ");
                }
            }
        }
    }
}
