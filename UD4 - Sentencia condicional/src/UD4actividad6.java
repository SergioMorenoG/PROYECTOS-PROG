import java.util.Scanner;

public class UD4actividad6 {
    final static double g = 9.81;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Este programa calcula el tiempo que tarda en caer un objeto desde una altura. ");
        System.out.println("Para esto se utiliza la fórmula t = raiz cuadrada de 2h/g");
        System.out.print("Introduce la altura (h) en metros: ");
        double h_altura = s.nextDouble();

        double time = Math.sqrt((2*h_altura)/g);

        System.out.printf("El objeto va a tardar en caer %.3f segundos", time);

        s.close();
    }
}
