import java.util.Scanner;

public class UD4actividad17 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero para saber cual es última cifra: ");
    int numero = s.nextInt();

    int ultcifra = numero % 10;

    System.out.print("La última cifra del número introducido es : " + ultcifra);

    s.close();
    }
}
