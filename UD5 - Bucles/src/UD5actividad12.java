import java.util.Scanner;

public class UD5actividad12 {
    /*
     * Escribe un programa que muestre los n primeros términos de la serie de
     * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
     * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
     * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
     * introducir por teclado.
     */
    public static void main(String[] args) {
        int contador = 0;
        int sumatoria = 1;
        int numAnterior = 0;
        int auxiliar = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuantos números quieres ver de la serie de Fibonacci?: ");
        int serie = s.nextInt();

        //Es necesario meter el if para los dos primeros casos para que el cambio de variables funcione
        while (contador != serie) {
            if (contador == 0) {
                System.out.print("0, ");
                contador++;
            } else if (contador == 1) {
                System.out.print("1");
                contador++;
            } else if (contador >= 2) {
                auxiliar = numAnterior;
                numAnterior = sumatoria;
                sumatoria = auxiliar + numAnterior;
                System.out.print(", " + sumatoria);
                contador++;    
            }
        }
        s.close();
    }
}
