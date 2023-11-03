import java.util.Scanner;

public class UD4actividad19 {
    public static void main(String[] args) {
        int contador = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero para saber cuantos dígitos tiene (hasta 5 dígitos, puede ser positivo o negativo): ");
    int cifra = s.nextInt();
    cifra = Math.abs(cifra);

    if (cifra < 10) {
        contador = 1;
    } else if (cifra >= 10 && cifra < 100) {
        contador = 2;
    } else if (cifra >= 100 && cifra < 1000) {
        contador = 3;
    } else if (cifra >= 1000 && cifra < 10000) {
        contador = 4;
    } else if (cifra >= 10000)
        contador = 5;
        
    System.out.print("El número tiene un total de: " + contador + " dígitos.");

    s.close();
    }
}
