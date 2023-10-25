public class UD2actividad6 {
    /*
     * Escribe un programa que calcule el total de una factura a partir de la base
     * imponible (precio sin IVA). La base imponible estará almacenada en una
     * variable.
     */
    public static void main(String[] args) {
        double baseimp = 224.90;
        double iva = baseimp + (baseimp * 0.21);

        System.out.println("El total de la factura es de: " + iva + " euros.");
        System.out.println("");
    
        // De forma bonita
        System.out.println( "               FACTURA             ");
        System.out.println("***************************************");
        System.out.printf("%-10s            %10.2f\n", "Base imponible" , baseimp);
        System.out.printf("%-10s            %14s\n", "IVA" , "21%");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s                %10.2f\n", "TOTAL" , iva);
    }
}
