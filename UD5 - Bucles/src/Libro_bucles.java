import java.util.Scanner;

public class Libro_bucles {

  public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para saber los 10 siguientes: ");
    int i = s.nextInt();

    System.out.println("Con bucle for:");
    int x = i + 11;

    for (i = i + 1; i < x; i++) {
      System.out.println(i);
    }

  };
}
