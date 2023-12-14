public class UD6actividad1 {
    /*
     * Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
     * también la suma total (los puntos que suman entre los tres dados).
     */
    public static void main(String[] args) throws Exception {
    
        int dado = 0;
        int sumaDado = 0;

        for (int i = 1; i < 4; i++) {
            dado = ((int)(Math.random() * 6) + 1);
            sumaDado += dado;
            System.out.println("Tirada número " + i + " = " + dado);
        }

        System.out.println("La suma total de los puntos de los dados es de: " + sumaDado);
    }
}
