/*
 * - Imprime por pantalla una tabla con muchos colores + unos textos con ejemplos usando "ConsoleColors.java" -
 *
 *  @author Sergio Moreno
 *
 * @version 1.0.0
 */

import java.io.Console;

public class Colores2 {

  // public static void main(String[] args) {
  //     System.out.print("\033[33m mandarina");
  //     System.out.print("\033[32m hierba");
  //     System.out.print("\033[31m tomate");
  //     System.out.print("\033[37m sábanas");
  //     System.out.print("\033[36m cielo");
  //     System.out.print("\033[35m nazareno");
  //     System.out.print("\033[34m mar");
  // }

  public static void main(String[] args) {
    System.out.println("┌────────┬───────────┬────────┬────────────────┐");
    System.out.println("│ Código │   Color   │ Código │      Color     │");
    System.out.println("├────────┼───────────┼────────┼────────────────┤");
    System.out.print("│ 30     │\033[30m  negro\033[39;49m    │");
    System.out.println(" 90     │\033[90m negro claro \033[39;49m   │");
    System.out.print("│ 31     │\033[31m  rojo    \033[39;49m │");
    System.out.println(" 91     │\033[91m rojo claro \033[39;49m    │");
    System.out.print("│ 32     │\033[32m  verde   \033[39;49m │");
    System.out.println(" 92     │\033[92m verde claro \033[39;49m   │");
    System.out.print("│ 33     │\033[33m  amarillo\033[39;49m │");
    System.out.println(" 93     │\033[93m amarillo claro\033[39;49m │");
    System.out.print("│ 34     │\033[34m  azul    \033[39;49m │");
    System.out.println(" 94     │\033[94m azul claro \033[39;49m    │");
    System.out.print("│ 35     │\033[35m  morado  \033[39;49m │");
    System.out.println(" 95     │\033[95m morado claro \033[39;49m  │");
    System.out.print("│ 36     │\033[36m  cian    \033[39;49m │");
    System.out.println(" 9      │\033[96m cian claro \033[39;49m    │");
    System.out.print("│ 37     │\033[37m  blanco  \033[39;49m │");
    System.out.println(" 7      │\033[97m blanco claro \033[39;49m  │");
    System.out.println("└────────┴───────────┴────────┴────────────────┘");

    System.out.println(" ");
    System.out.println(ConsoleColors.PURPLE + "Writting in purple color");
    System.out.println(" ");
    System.out.println(ConsoleColors.BLUE_BOLD + "Color  A  Z  U  L");
    System.out.println(" ");
    System.out.println(ConsoleColors.WHITE_BOLD_BRIGHT + "Hola");
    System.out.println(" ");

    System.out.print(ConsoleColors.RESET);
  }
}
