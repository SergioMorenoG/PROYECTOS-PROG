public class intento {

  public static void main(String[] args) {
    System.out.println(ConsoleColors.GREEN_BOLD + "     *     ");
    System.out.println("    * *");
    System.out.println("   *   *");
    System.out.println("  *     *");
    System.out.println(" *       *");
    System.out.println("* * * * * *");
    System.out.println("*         *");
    System.out.println(" *       *");
    System.out.println("  *     *");
    System.out.println("   *   *");
    System.out.println("    * *");
    System.out.println("     *     ");
    System.out.println(ConsoleColors.RESET);

    System.out.printf("Este num: %d no tiene decimales, este si: %5f \n", 15, 24.0);
    System.out.println("");

    System.out.println(" Artículo     Precio/caja     Nº cajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s     %8.2f       %6d\n", "manzanas", 4.5, 10);
    System.out.printf("%-10s     %8.2f       %6d\n", "peras", 2.75, 120);
    System.out.printf("%-10s     %8.2f       %6d\n", "aguacates", 10.0, 6);
  }
}
