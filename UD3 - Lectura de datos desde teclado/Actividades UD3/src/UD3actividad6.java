import java.util.Scanner;

public class UD3actividad6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la base del tríangulo: ");
        int base = s.nextInt();

        System.out.print("Introduzca la altura del triángulo: ");
        int altura = s.nextInt();

        double area = ((double) base * (double) altura) / 2;

        System.out.printf("El area de este triángulo es de: %.2f", area);

        s.close();
    }
}
