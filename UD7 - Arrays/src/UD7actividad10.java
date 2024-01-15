public class UD7actividad10 {
    /*
     * Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
     * y que los almacene en un array. El programa debe ser capaz de pasar todos
     * los números pares a las primeras posiciones del array (del 0 en adelante) y
     * todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
     * necesario.
     */
    public static void main(String[] args) throws Exception {
        int numAleatorios[] = new int[20];
        int numOrdenados[] = new int[20];
        int conteo = 0;

    // Este bucle genera los números aleatorios y los muestra por pantalla
        System.out.println("Lista de veinte números aleatorios:");
        for (int i = 0; i < 20; i++) {
            numAleatorios[i] = (int) (Math.random()*101);
            System.out.print(numAleatorios[i] + " ");
            Thread.sleep(100);
        }
    
    // Este bucle añade en un nuevo array, los números pares de manera ordenada en las primeras posiciones
        for (int j = 0; j < 20; j++) {
            if (numAleatorios[j] % 2 == 0) {
                numOrdenados[conteo++] = numAleatorios[j];
            }
        }

    // Este bucle escribe los elementos restantes con los números impares en el nuevo array
        for (int k = 0; k < 20; k++) {
            if (numAleatorios[k] % 2 != 0) {
                numOrdenados[conteo++] = numAleatorios[k];
            }
        }
        
    // Este bucle imprime por pantalla los números con la lista de pares primeros, impares después
        System.out.println("\nLa lista con los pares primero y los impares después: ");
        for (int l = 0; l < 20; l++) {
            System.out.print(numOrdenados[l] + " ");
            Thread.sleep(100);
        }
    }
}
