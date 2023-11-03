import java.util.Scanner;

public class UD4actividad18 {
    public static void main(String[] args) {
    int primernum = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero para saber su primera cifra (hasta 5 dígitos): ");
    int cifra = s.nextInt();

    if (cifra < 10) {
        primernum = cifra;
    } else if (cifra >= 10 && cifra < 100) {
        primernum = cifra / 10;
    } else if (cifra >= 100 && cifra < 1000) {
        primernum = cifra / 100;
    } else if (cifra >= 1000 && cifra < 10000) {
        primernum = cifra / 1000;
    } else if (cifra >= 10000)
        primernum = cifra / 10000;
        
    System.out.print("La primera cifra del número es: " + primernum);

    s.close();
    }
}
