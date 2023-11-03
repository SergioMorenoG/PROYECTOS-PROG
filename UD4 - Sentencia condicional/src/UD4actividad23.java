import java.util.Scanner;

public class UD4actividad23 {
    public static void main(String[] args) {
    double iva = 0;
    double promo = 1;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    double baseimp = s.nextDouble();

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    String tipoiva = s.next();
    tipoiva.toLowerCase();

    if (tipoiva.equals("general")) {
        iva = 0.21;
    } else if (tipoiva.equals("reducido")) {
        iva = 0.10;
    } else if (tipoiva.equals("superreducido")) {
        iva = 0.04;
    }

    double totaliva = baseimp * iva;
    double biconiva = baseimp + totaliva;

    System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
    String tipopromo = s.next();
    tipopromo.toLowerCase();

    if (tipopromo.equals("nopro")) {
        promo = 1;
    } else if (tipopromo.equals("mitad")) {
        promo = biconiva / 2;
    } else if (tipopromo.equals("meno5")) {
        promo = biconiva - 5;
    } else if (tipopromo.equals("5porc")) {
        promo = biconiva * 0.05;
    }

    double total = biconiva - promo;

    System.out.printf("%-20s    %.2f\n", "Base imponible", baseimp);
    System.out.printf("%-20s    %.2f\n", "IVA", totaliva);
    System.out.printf("%-20s    %.2f\n", "Precio con IVA", biconiva);
    System.out.printf("%-20s    -%.2f\n", "Cód. promo. " + "(" + tipopromo + ")", promo);
    System.out.printf("%-20s    %.2f\n", "TOTAL", total);

    s.close();
    }
}
