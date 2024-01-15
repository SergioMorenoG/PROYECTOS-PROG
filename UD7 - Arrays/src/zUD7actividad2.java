import java.util.Scanner;

public class zUD7actividad2 {
    /*
     * Escribe un programa que pida 20 números enteros. Estos números se deben
     * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
     * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
     * tratara. La suma total debe aparecer en la esquina inferior derecha.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[][] = new int[4][5];
        int sumaFilas[] = new int [4];
        int sumaColumnas[] = new int [5];
        int sumatoria = 0;

        System.out.println("Este programa te pedirá números y hara la suma como si fuese un Excel.");

        for (int filas = 0; filas < 4; filas++) {
            System.out.print("Fila " + (filas + 1) + "\n");
            for (int columnas = 0; columnas < 5; columnas++) {
                System.out.print("Columna " + (columnas + 1) + ": ");
                num[filas][columnas] = s.nextInt();
                sumaFilas[filas] += num[filas][columnas];
                sumaColumnas[columnas] += num[filas][columnas];
            }
        }
    
        for  (int i = 0; i < 4; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%8d", num[i][j]);
                if (j == 4) {
                    System.out.printf("%8d", sumaFilas[i]);
                    sumatoria += sumaFilas[i];
                }
            }
            System.out.println("");
            if (i == 3) {
                System.out.printf("%8s", "TOTALES:");
                for (int k = 0; k < 5; k++) {
                    System.out.printf("%8d", sumaColumnas[k]);
                    sumatoria += sumaColumnas[k];
                }
                System.out.printf("%8d", sumatoria);
            }
        }
        s.close();
    }
}
