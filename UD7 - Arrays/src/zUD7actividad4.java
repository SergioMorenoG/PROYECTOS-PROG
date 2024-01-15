public class zUD7actividad4 {
    /*
     * Modifica el programa anterior de tal forma que las sumas parciales y la suma
     * total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
     * que el ordenador se queda “pensando” antes de mostrar los números
     */
    public static void main(String[] args) throws Exception {
        int num[][] = new int[4][5];
        int sumaFilas[] = new int [4];
        int sumaColumnas[] = new int [5];
        int sumatoria = 0;

        System.out.println("Este programa generará números del 100 al 999 y hara la suma como si fuese un Excel.");

        for (int filas = 0; filas < 4; filas++) {
            for (int columnas = 0; columnas < 5; columnas++) {
                num[filas][columnas] = (int) (Math.random() * 900) + 100;
                sumaFilas[filas] += num[filas][columnas];
                sumaColumnas[columnas] += num[filas][columnas];
            }
        }
    
        for  (int i = 0; i < 4; i++) {
            System.out.print("Fila " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.printf("%8d", num[i][j]);
                if (j == 4) {
                    Thread.sleep(1600);
                    System.out.printf("%8d", sumaFilas[i]);
                    sumatoria += sumaFilas[i];
                }
            }
            System.out.println("");
            if (i == 3) {
                System.out.printf("%8s", "TOTALES:");
                for (int k = 0; k < 5; k++) {
                    Thread.sleep(1000);
                    System.out.printf("%8d", sumaColumnas[k]);
                    sumatoria += sumaColumnas[k];
                }
                Thread.sleep(1000);
                System.out.printf("%8d", sumatoria);
            }
        }
    }
}

