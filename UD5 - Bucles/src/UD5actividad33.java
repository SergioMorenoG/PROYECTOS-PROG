import java.util.Scanner;

public class UD5actividad33 {
        /*
       * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
       * programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
       * dos asteriscos menos en la base para simular la curvatura de las esquinas
       * inferiores.
       */
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Introduzca la altura de la U: ");
            int altura = s.nextInt();

            for (int i = 1; i < altura; i++) {
                System.out.print("* ");
                for (int j = 0; j < altura - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("*\n");
            }

            System.out.print("  ");
            for (int k = 0; k < altura - 2; k++) {
                System.out.print("* ");
            }
    }
}
