import java.util.Scanner;

public class UD3actividad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la base imponible de la factura: ");
        double baseimp = s.nextDouble();
        double iva = 0.21;
        double total = baseimp + (baseimp * iva);


        System.out.println( "               FACTURA             ");
        System.out.println("***************************************");
        System.out.printf("%-10s            %10.2f\n", "Base imponible" , baseimp);
        System.out.printf("%-10s            %14s\n", "IVA" , "21%");
        System.out.println("-----------------------------------------");
        System.out.printf("%-10s                %10.2f\n", "TOTAL" , total);

        s.close();
    }
}
