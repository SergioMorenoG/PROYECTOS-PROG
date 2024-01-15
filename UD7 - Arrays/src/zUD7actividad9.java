public class zUD7actividad9 {
    /*
     * Realiza un programa que sea capaz de rotar todos los elementos de una matriz
     * cuadrada una posición en el sentido de las agujas del reloj. La matriz debe tener
     * 12 filas por 12 columnas y debe contener números generados al azar entre 0 y
     * 100. Se debe mostrar tanto la matriz original como la matriz resultado, ambas
     * con los números convenientemente alineados.
     */
    public static void main(String[] args) throws Exception {
        int original[][] = new int[12][12];

        for (int filas = 0; filas < 12; filas++) {
            for (int columnas = 0; columnas < 12; columnas++) {
                original[filas][columnas] = (int) (Math.random() * 101);
            }
        }
        
        System.out.println("                   ------------- Matriz original -------------");
        for (int filas = 0; filas < 12; filas++) {
            System.out.println("---------------------------------------------------------------------------------");
            if (filas < 9) {
                System.out.print("Fila " + (filas + 1) + ": ");
            } else if (filas >= 9) {
                System.out.print("Fila " + (filas + 1) + ":");
            }
            for (int columnas = 0; columnas < 12; columnas++) {
                    System.out.printf("%6d", original[filas][columnas]);
            }
            System.out.println("");
        }
        System.out.print("--------------------------------------------------------------------------------");
    
    
    }
}
