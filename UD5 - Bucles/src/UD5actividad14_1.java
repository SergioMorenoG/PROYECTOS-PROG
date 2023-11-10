import java.util.Scanner;

public class UD5actividad14_1 {
    /*
     * Escribe un programa que pida una base y un exponente (entero positivo) y que
     * calcule la potencia. ESTE EJERCICIO UTILIZA UN BUCLE PARA CALCULARLO
     */
    public static void main(String[] args) {
        int potencia = 1;
        int auxiliar = 0;
        int resultado = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        int base = s.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exponente = s.nextInt();
        
        while (potencia <= exponente) {
            auxiliar = base * base;
            resultado *= auxiliar;
            potencia++;
        }
        System.out.print("La potencia de " + base + " elevado a " + exponente + " es igual a " + resultado);
        s.close();
    }
}
