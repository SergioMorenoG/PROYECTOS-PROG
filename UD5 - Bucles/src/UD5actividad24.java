import java.util.Scanner;

public class UD5actividad24 {

  /*
   * Escribe un programa que lea un número n e imprima una pirámide de números
   * con n filas como en la siguiente figura:
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int alturaIntroducida = s.nextInt();

    int altura = 1;
    int i = 0;
    int espacios = alturaIntroducida - 1;

    while (altura <= alturaIntroducida) {
      for (i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }
      for (i = 1; i < altura; i++) {
        System.out.print(i);
      }
      for (i = altura; i > 0; i--) {
        System.out.print(i);
      }
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
