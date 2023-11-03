import java.util.Scanner;

public class UD4actividad11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la hora (del 1 al 23): ");
        int hora = s.nextInt();
        System.out.print("Introduzca los minutos (del 1 al 59): ");
        int minutos = s.nextInt();

        int segtranscurridos = (hora * 3600) + (minutos * 60);
        int segfaltan = (24 *3600) - segtranscurridos;

        System.out.print("Desde las " + hora + ":" + minutos + " hasta la medianoche, quedan " + segfaltan + " segundos.");

        s.close();

    }
}
