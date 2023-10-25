import java.util.Scanner;

public class UD3actividad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca la longitud de los lados del cuadrado: ");
        int lado = s.nextInt();
        int area = lado * lado;

        System.out.print("El área del cuadrado es: " + area);

        s.close();
    }
}
