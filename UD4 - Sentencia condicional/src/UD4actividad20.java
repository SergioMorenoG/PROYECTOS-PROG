import java.util.Scanner;

public class UD4actividad20 {
    public static void main(String[] args) {
    boolean capicua = false;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número de hasta 5 cifras para saber si es capicúa: ");
    int numero = s.nextInt();

    if (numero < 10) {
        capicua = true;
    } else if (numero >= 10 && numero < 100) {
        if (numero / 10 == numero % 10) {
            capicua = true;
        }
    } else if (numero >= 100 && numero < 1000) {
        if (numero / 100 == numero % 10) {
            capicua = true;
        }
    } else if (numero >= 1000 && numero < 10000) {
        if (numero / 1000 == numero % 10 && (numero/100) % 10 == (numero/10) % 10) {
            capicua = true;
        }
    } else if (numero >= 10000) {
        if (numero / 10000 == numero % 10 && (numero/1000) % 10 == (numero/10) % 10) {
            capicua = true;
        }
    }

    if (capicua) {
        System.out.print("El número introducido SI es capicúa.");
    } else
        System.out.print("El número introducido NO es capicúa.");

    s.close();
    }
}
