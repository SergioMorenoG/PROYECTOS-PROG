import java.util.Scanner;

public class UD5actividad31 {
    /*
   * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
   * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
   * mitad (división entera entre 2) de la altura más uno.
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la L: ");
    int altura = s.nextInt();

    for (int i = 1; i < altura; i++) {
        System.out.println("* ");
    }

    int base = (altura/2) + 1;
    
    for (int j = 1; j <= base; j++) {
        System.out.print("* ");
    }
    }
}
