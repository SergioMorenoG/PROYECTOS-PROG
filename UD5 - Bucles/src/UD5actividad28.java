import java.util.Scanner;

public class UD5actividad28 {
   /*
   * Escribe un programa que calcule el factorial de un número entero leído por teclado
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca un número para saber su factorial: ");
    int numeroIntroducido = s.nextInt();

    while (numeroIntroducido < 0) {
        System.out.print("Eso no es un número entero, vuelva a escribirlo: ");
        numeroIntroducido = s.nextInt();
    }

    int factorial = numeroIntroducido;


    for (int i = 1; i < numeroIntroducido; i++) {
        factorial *= i;
    }

    System.out.print(numeroIntroducido + "! = " + factorial);

    }
}

