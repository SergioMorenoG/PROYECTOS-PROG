import java.util.Scanner;

public class UD4actividad25 {
    public static void main(String[] args) {
    double preciobordado = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    double altura = s.nextDouble();
    System.out.print("Ahora introduzca la anchura: ");
    double anchura = s.nextDouble();

    double bandera = altura * anchura;
    double preciobandera = bandera / 100;

    System.out.print("¿Quiere escudo bordado? (s/n): ");
    boolean bordado = ((s.nextLine()).toLowerCase()).equals("s");

    String escudocadena;

    if (bordado) {
        escudocadena = "Con escudo";
        preciobordado = 2.5;
    } else {
        escudocadena = "Sin escudo";
        preciobordado = 0;
    }

    double gastosenvio = 3.25;
    double total = preciobandera + preciobordado + gastosenvio;

    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.printf("-%20s        %.2f\n", "Bandera de " + bandera + " cm2:", preciobandera);
    System.out.printf("-%20s        %.2f\n",escudocadena, preciobordado);
    System.out.printf("-%20s        %.2f\n","Gastos de envío: ", gastosenvio);
    System.out.printf("-%20s        %.2f\n","TOTAL: ", total );

    s.close();
    }
}
