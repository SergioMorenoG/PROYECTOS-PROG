import java.util.Scanner;

public class UD5actividad8 {
    /*
     * Muestra la tabla de multiplicar de un número introducido por teclado.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber la tabla de multiplicar: ");
        int numero = s.nextInt();
        
        for (int i = 1; i < 11; i++)
            System.out.println(numero + " x " + i + " = " + (numero * i));

        s.close();
    }
}
