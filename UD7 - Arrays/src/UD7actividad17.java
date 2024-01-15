import java.util.Scanner;

public class UD7actividad17 {
    /*
     * Escribe un programa que muestre por pantalla un array de 10 números enteros
     * generados al azar entre 0 y 100. A continuación, el programa debe pedir un
     * número al usuario. Se debe comprobar que el número introducido por teclado
     * se encuentra dentro del array, en caso contrario se mostrará un mensaje por
     * pantalla y se volverá a pedir un número; así hasta que el usuario introduzca uno
     * correctamente. A continuación, el programa rotará el array hacia la derecha
     * las veces que haga falta hasta que el número introducido quede situado en la
     * posición 0 del array. Por último, se mostrará el array rotado por pantalla
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[10];
        int i = 0;

        System.out.println("Este programa genera 10 números aleatorios del 0-100.");
        for (i = 0; i < 10; i++) {
            num[i] = (int) (Math.random() * 101);
            System.out.print(num[i] + " ");
        }

        int opcion = 0;
        boolean numEnArray = false;

        do {
        System.out.print("\nIntroduce un número del array: ");
        opcion = s.nextInt();
        for (i = 0; i < 10; i++) {
            if (opcion == num[i]) {
                numEnArray = true;
            }
        }
        if (!numEnArray) {
            System.out.println("Ese número no se encuentra en el array. Vuelve a introducir uno");
        }
        } while (!numEnArray);

        while (num[0] != opcion) {
            int aux = num[9];
            for (i = 9; i > 0; i--) {
                num[i] = num[i-1];
            }
            num[0] = aux;
        }

        System.out.println("El array resultante queda tal que así: ");
        for (i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
        
        s.close();
    }
}
