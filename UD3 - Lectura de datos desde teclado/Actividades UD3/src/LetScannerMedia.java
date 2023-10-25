import java.util.Scanner;

public class LetScannerMedia {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        System.out.println("Este programa calcula la media de tres números (pueden contener decimales).");
        System.out.print("Escribe los tres números separados por un espacio: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();
        double num3 = s.nextDouble();

        double media = (num1 + num2 + num3) / 3;

        System.out.printf("La media de " + num1 + ", " + num2 + ", " + num3 + " es igual a: " + "%.2f", media);

        //La siguiente línea cierra el scanner 
        s.close();
    }
}
