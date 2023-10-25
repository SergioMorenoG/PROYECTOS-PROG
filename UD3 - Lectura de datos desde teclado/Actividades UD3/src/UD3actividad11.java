import java.util.Scanner;

public class UD3actividad11 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca la cantidad de Kb a convertir: ");
    int kilo = s.nextInt();

    double mega = (double) kilo / 1000;

    System.out.printf("La conversión de " + kilo + " Kb es de: %.2f Mb.", mega);

    s.close();
  }
}
