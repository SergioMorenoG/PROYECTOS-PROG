public class zUD7actividad1 {
    /*
     * ---- AQUÍ EMPIEZAN LOS EJERCICIOS DE ARRAYS BIDIMENSIONALES ------
     * Define un array de números enteros de 3 filas por 6 columnas con nombre num
     * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
     * los elementos del array dispuestos en forma de tabla como se muestra en la
     * figura
     */
    public static void main(String[] args) throws Exception {
    int num[][] = new int[3][6];
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    for (int fila = 0; fila < 3; fila++) {
        System.out.print("Fila: " + fila + ": ");
        for (int columna = 0; columna < 6; columna++) {
            System.out.printf("%10d ", num[fila][columna]);
        }
        System.out.println("");
    }
    }
}
