import java.util.Scanner;

public class UD3actividad9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Introduzca el radio del cono: ");
        double radio = s.nextDouble();

        System.out.print("Introduzca la altura del cono: ");
        double altura = s.nextDouble();

        double volumen = (Math.PI * Math.pow(radio, 2) * altura) / 3;

        System.out.printf("El volumen del cono es igual a: %.3f \n", volumen);

        s.close();
    }
}
