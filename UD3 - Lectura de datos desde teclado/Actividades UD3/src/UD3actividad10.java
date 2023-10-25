import java.util.Scanner;

public class UD3actividad10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca los Mb que necesites saber la conversión: ");
        int mega = s.nextInt();

        int kilo = mega * 1000;

        System.out.print("La conversión de " + mega + " Mb es de: " + kilo + " Kb.");

        s.close();

    }
}
