public class UD6actividad5 {
    /*
     * Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
     * separados por espacios. Muestra también el máximo, el mínimo y la media
     * de esos números
     */
    public static void main(String[] args) throws Exception {
    
        int numeroAleatorio = 0;
        int maximo = 0;
        int minimo = 200;
        int media = 0;

        for (int i = 1; i < 51; i++) {
            numeroAleatorio = ((int) (Math.random()*100) + 100);
            System.out.print(numeroAleatorio + " ");
            Thread.sleep(200);
            media += numeroAleatorio;
            if (numeroAleatorio > maximo) {
                maximo = numeroAleatorio;
            }
            if (numeroAleatorio < minimo) {
                minimo = numeroAleatorio;
            }
        }
        
        media = media / 50;

        System.out.print("\nLa media es de " + media + ", el núm máximo ha sido " + maximo + " y el mínimo " + minimo + ".");
    }    
}
