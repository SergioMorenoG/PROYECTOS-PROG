import java.util.Scanner;

public class UD5actividad29 {
    /*
   * Escribe un programa que muestre por pantalla todos los números enteros
   * positivos menores a uno leído por teclado que no sean divisibles entre otro
   * también leído de igual forma. FALTA REVISARLO
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número para ver cuantos números menores a ese son divisibles por otro num: ");
    int numeroIntroducido = s.nextInt();

    System.out.print("¿Por qué número debe ser divisible?: ");
    int numeroDivisible = s.nextInt();

    System.out.print("Los números que no son divisibles son: "  );

    for (int i = 1; i < numeroIntroducido; i++) {
      if (i % numeroDivisible != 0) {
        System.out.print(i + " ");
      }
    }
    s.close();
  }
}
