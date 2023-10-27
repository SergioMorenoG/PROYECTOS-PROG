import java.util.Scanner;

public class UD4actividad5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa resuelve ecucaciones de primer grado del tipo ax + b = 0");
        System.out.print("Introduce el valor de a: ");
        double valor_a = s.nextDouble();
        System.out.print("Introduce el valor de b: ");
        double valor_b = s.nextDouble();

        double valor_x = -valor_b / valor_a;

        if (valor_a == 0) {
            System.out.print("Esa ecuación no tiene solución real.");
        } else 
        System.out.printf("El resultado de la ecuación es x = %.2f", valor_x);
        s.close();
    }
}

