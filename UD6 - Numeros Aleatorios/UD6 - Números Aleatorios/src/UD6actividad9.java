import java.util.Scanner;

public class UD6actividad9 {
    /*
     * Realiza un programa que vaya generando números aleatorios pares entre 0
     * y 100 y que no termine de generar números hasta que no saque el 33. El
     * programa deberá decir al final cuántos números se han generado.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa va generando números aleatorios y se para cuando toque un 33.");
        int numerosGenerados = 0;
        int contador = 0;

        do {
            numerosGenerados = (int) ((Math.random()*100) + 1);
            System.out.print(numerosGenerados + " ");
            Thread.sleep(200);
            contador++;
        } while (numerosGenerados != 33);

        System.out.println("En total se han generado " + contador + " números");
        s.close();
    }
}
