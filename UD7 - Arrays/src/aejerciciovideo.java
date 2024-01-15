import java.util.Scanner;

public class aejerciciovideo {

    /*
     * Ejercicio del video: https://www.youtube.com/watch?v=mlyfxG4yCFM
     */

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numeroIntroducido;
        
        do {
            System.out.print("Introduce un número (para salir escriba '0'): ");
            numeroIntroducido = s.nextInt();

            char matriz[][] = new char[numeroIntroducido][numeroIntroducido];

            for (int filas = 0; filas < numeroIntroducido; filas++) {
                for (int columnas = 0; columnas < numeroIntroducido; columnas++) {
                    if (filas == columnas) {
                        matriz[filas][columnas] = 'A';
                        System.out.print(matriz[filas][columnas] + " ");
                    } else {
                        matriz[filas][columnas] = '*';
                        System.out.print(matriz[filas][columnas] + " ");
                    }
                }
            System.out.println("");
            }
        } while (numeroIntroducido != 0);

        System.out.print("Haaasta luego!!");
        
        
    }
}
