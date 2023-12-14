import java.util.Scanner;

public class UD5actividad43 {

  /*
   * Escribe un programa que permita partir un número introducido por teclado en
   * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
   * el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
   * el número introducido tiene dos dígitos como mínimo y la posición en la que
   * se parte el número está entre 2 y la longitud del número. No se permite en
   * este ejercicio el uso de funciones de manejo de String (por ej. para extraer
   * subcadenas dentro de una cadena).
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = s.nextInt();

    //Controlamos que el número no sea negativo
    while (numeroIntroducido < 0) {
      System.out.print("El número no es entero positivo, introduzca otro: ");
      numeroIntroducido = s.nextInt();
    }

    System.out.print(
      "Introduzca la posición a partir de la cual quiere partir el número: "
    );
    int longitudIntroducida = s.nextInt();

    int volteado = s.nextInt();
    int comprueba = s.nextInt();
    int longitudNumero = s.nextInt();

    while (comprueba > 0) {
      volteado = (volteado % 10) + (comprueba * 10);
      comprueba /= 10;
      longitudNumero++;
    }

    int digitos = s.nextInt();

    System.out.print("Los números partidos son el ");
    for (int i = 0; i < longitudIntroducida; i++) {
      digitos = (digitos % 10) + (volteado * 10);
      volteado /= 10;
    }

    System.out.print(digitos);
    digitos = 0;

    for (int j = 0; j < (longitudNumero - longitudIntroducida); j++) {
      digitos = (digitos % 10) + (volteado * 10);
      volteado /= 10;
    }

    System.out.print(" y el " + digitos + ".");
    s.close();


  }
}
