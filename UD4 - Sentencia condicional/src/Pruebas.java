import java.util.Scanner;

public class Pruebas {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Adivina el número en el que estoy pensando");
    System.out.print("Introduce un número del 1 al 100: ");
    int n = s.nextInt();

    if (n < 1 || n > 100) {
      System.out.println(
        "El número introducido no está en el intervalo del 1 - 100."
      );
      System.out.print(
        "Vuelve a intentarlo, introduce un número del 1 al 100: "
      );
      n = s.nextInt();
    }

    if (n == 33) {
      System.out.print("LO HAS ACERTADO!!");
    } else {
      System.out.print("Mala suerte... Has fallado");
    }

    s.close();
  }
}
