public class UD2actividad5 {
    /*
     * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
     * convertir deberá estar almacenada en una variable.
     */
    public static void main(String[] args) {
        int pesetas = 4500000;
        // Sabemos que 1 peseta es igual a 0,00601012
        double euros = (double) (pesetas * 0.00601012);

        System.out.println("La conversión de " + pesetas + " pesetas es " + euros + " euros.");





    }
}
