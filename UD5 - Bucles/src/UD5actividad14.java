import java.util.Scanner;

public class UD5actividad14 {
    /*
     * Escribe un programa que pida una base y un exponente (entero positivo) y que
     * calcule la potencia. ESTE EJERCICIO UTILIZA LA FUNCIÓN MATH.POW
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = s.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente = s.nextInt();

        while (exponente < 0 ) {
            System.out.print("El exponente es negativo. Introduzca un número positivo: ");
            exponente = s.nextInt();
        }

        //Usamos el casting para que a la hora de escribir el número sea un entero.
        long potencia = (long) Math.pow(base, exponente);

        System.out.print("La potencia de " + base + " elevado a " + exponente + " es igual a " + potencia);
        s.close();
    }
}