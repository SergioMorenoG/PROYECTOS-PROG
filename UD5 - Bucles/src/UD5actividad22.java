public class UD5actividad22 {
    /*
     * Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.
     */
    public static void main(String[] args) {
        System.out.print("Los números primos entre 2 y 100 son: ");

        boolean esPrimo = true;
        int n = 0;
        for(n = 2; n <= 100; n++) {
            esPrimo = true;
            for(int i = 2; i < n; i++) {
                if (n % i == 0) {
                    esPrimo = false;
                }
            }
        }
    
        if (esPrimo) {
            System.out.print(n + " ");
        }
    
        System.out.println("");
    }
}
