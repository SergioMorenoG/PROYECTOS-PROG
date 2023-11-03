import java.util.Scanner;

public class UD4actividad24 {
    public static void main(String[] args) {
   double sueldobase = 0;
   double porcientoIRPF = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("1. - Programador junior");
    System.out.println("1. - Programador senior");
    System.out.println("1. - Jefe de proyecto");
    System.out.print("Introduzca el cargo del empleado (1 - 3): ");
   double cargo = s.nextInt();

    if (cargo == 1) {
        sueldobase = 950;
    } else if (cargo == 2) {
        sueldobase = 1200;
    } else if (cargo == 3) {
        sueldobase = 1600;
    }
    
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
   double diasviaje = s.nextInt();

   double dietas = 30 * diasviaje;

    System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
   double estado = s.nextInt();

    if (estado == 1) {
        porcientoIRPF = 25;
    } else if (estado == 2) {
        porcientoIRPF = 20;
    }

    double sueldobruto = sueldobase + dietas;
   double retencion = sueldobruto * (porcientoIRPF/100);
   double sueldoneto = sueldobruto - retencion;

    System.out.println("-----------------------------------------");
    System.out.printf("|  Sueldo base               %.2f   |\n", sueldobase);
    System.out.printf("|  Dietas (%.2f viajes)      %7.2f   |\n", diasviaje, dietas);
    System.out.println("| ----------------------------------- |");
    System.out.printf("|  Sueldo bruto          %7.2f   |\n", sueldobruto);
    System.out.printf("|  Retención IRPF (%.0f%%)      %7.2f   |\n", porcientoIRPF, retencion);
    System.out.println("| ---------------------------------------|\n");
    System.out.printf("|  Sueldo neto       %7.2f   |\n", sueldoneto);
    System.out.println("------------------------------------------");
    
    s.close();
    }
}
