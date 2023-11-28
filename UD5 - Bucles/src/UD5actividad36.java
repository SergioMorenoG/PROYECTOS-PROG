import java.util.Scanner;

public class UD5actividad36 {
    /*
    * Escribe un programa que diga si un número introducido por teclado es o no
    * capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
    * programa debe aceptar números de cualquier longitud siempre que lo permita
    * el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
    * long en lugar de int ya que el primero admite números más largos.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = s.nextLong();

        while (numeroIntroducido < 0) {
            System.out.print("El número no es positivo, por favor vuelve a introducir otro: ");
            numeroIntroducido = s.nextLong();
        }

        long comprobar = numeroIntroducido;
        long volteado = 0;

        while (comprobar > 0) {
            volteado = (volteado * 10) + (comprobar % 10);
            comprobar /=10;
        }

        if (volteado == numeroIntroducido) {
            System.out.print("El número " + numeroIntroducido + " es capicúa");
        } else
            System.out.print("El número" + numeroIntroducido + " NO es capicúa");

        s.close();
    }        
}
