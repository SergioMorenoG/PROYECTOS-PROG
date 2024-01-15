public class zUD7actividad5 {
    /*
     * Realiza un programa que rellene un array de 6 filas por 10 columnas con
     * números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
     * continuación, el programa deberá dar la posición tanto del máximo como del
     * mínimo.
     */
    public static void main(String[] args) throws Exception {
        int num[][] = new int[6][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                num[filas][columnas] = (int) (Math.random()*1001);
                if (minimo > num[filas][columnas]) {
                    minimo = num[filas] [columnas];
                } else if (maximo < num[filas][columnas]) {
                    maximo = num[filas][columnas];
                }
            }
        }
    
        for (int filas = 0; filas < 6; filas++) {
            System.out.println("----------------------------------------------------------------------------------------");
            System.out.print("Fila " + (filas + 1) + ":");
            for (int columnas = 0; columnas < 10; columnas++) {
                System.out.printf("%8d", num[filas][columnas]);
            }
            System.out.println(" ");
        }
        System.out.println("----------------------------------------------------------------------------------------");
        
        for (int filas = 0; filas < 6; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                if (num[filas][columnas] == maximo) {
                    System.out.println("El número máximo es el " + maximo + " y se encuentra en la fila " + (filas + 1) + ", columna " + (columnas + 1));
                } else if (num[filas][columnas] == minimo) {
                    System.out.println("El número mínimo es el " + minimo + " y se encuentra en la fila " + (filas + 1) + ", columna " + (columnas + 1));
                }
            }
        }
    }
}
