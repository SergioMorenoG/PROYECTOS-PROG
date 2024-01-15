public class zUD7actividad11 {
    /*
     * Realiza un programa que muestre por pantalla un array de 10 filas por 10
     * columnas relleno con números aleatorios entre 200 y 300. A continuación, el
     * programa debe mostrar los números de la diagonal que va desde la esquina
     * superior izquierda a la esquina inferior derecha, así como el máximo, el mínimo
     * y la media de los números que hay en esa diagonal.
     */

    public static void main(String[] args) throws Exception {
        int num[][] = new int[10][10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int sumatorioDiagonal = 0;

        System.out.println("----------- ARRAY ORIGINAL ------------");
        for (int filas = 0; filas < 10; filas++) {
            for (int columnas = 0; columnas < 10; columnas++) {
                num[filas][columnas] = (int) (Math.random()*101) + 200;
                System.out.print(num[filas][columnas] + " ");
                if (maximo < num[filas][columnas]) {
                    maximo = num[filas][columnas];
                } else if (minimo > num[filas][columnas]) {
                    minimo = num[filas][columnas];
                }
                if (filas == columnas) {
                    sumatorioDiagonal += num[filas][columnas];
                }
            }
        System.out.println("");
        }

        System.out.println("El máximo es el " + maximo + " el mínimo es " + minimo);
        System.out.print("La media de los números de la diagonas es: " + (sumatorioDiagonal/10));
    }
}
