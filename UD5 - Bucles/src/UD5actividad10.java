import java.util.Scanner;

public class UD5actividad10 {
    /*
     * Escribe un programa que calcule la media de un conjunto de números positivos
     * introducidos por teclado. A priori, el programa no sabe cuántos números se
     * introducirán. El usuario indicará que ha terminado de introducir los datos
     * cuando meta un número negativo.
     */
    public static void main(String[] args) {
        double numerosIntroducidos;
        double media = 0;
        int contador = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula la media de los números que introduzcas.");
        System.out.println("Para salir del programa introduzca un número negativo.");

        do {
            System.out.print("Introduzca el número: ");
            numerosIntroducidos = s.nextFloat();
                if (numerosIntroducidos > 0) {
                    media += numerosIntroducidos;
                    contador++;
                }

        } while (numerosIntroducidos >= 0);

        double totalMedia = media / contador;

        System.out.printf("La media de los números introducidos es de %.2f.", totalMedia);
        s.close();
    }
}
