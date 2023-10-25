import java.util.Scanner;

/*
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 */

public class UD3actividad1 {
    public static void main(String[] args) throws Exception {
        Scanner m = new Scanner(System.in);

        System.out.print("Introduce dos números (separados por un espacio) para saber su multiplicacion: ");
        double num1 = m.nextDouble();
        double num2 = m.nextDouble();

        double mult = num1 * num2;

        System.out.printf("El resultado de la multiplicación de los números es: " + "%.2f", mult);

        m.close();
    }
}
