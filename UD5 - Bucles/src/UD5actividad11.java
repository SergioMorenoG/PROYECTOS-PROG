import java.util.Scanner;

public class UD5actividad11 {
    /*
     * Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
     * los 5 primeros números enteros a partir de uno que se introduce por teclado.
     */
    public static void main(String[] args) {
        double cuadrado = 1;
        double cubo = 1;
        int contador = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número para saber el cuadrado y el cubo de los siguientes 5 números: ");
        double numeroIntroducido = s.nextDouble();

        System.out.println("Número     Cuadrado     Cubo ");

        while (contador < 5) {
            cuadrado = Math.pow(numeroIntroducido, 2);
            cubo = Math.pow(numeroIntroducido, 3);
            System.out.printf("%3.0f     ",numeroIntroducido);
            System.out.printf("%7.0f     ",cuadrado);
            System.out.printf("%6.0f     \n",cubo);
            contador++;
            numeroIntroducido++;
            
            s.close();
        }

    }
}
