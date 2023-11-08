import java.util.Scanner;

public class UD5actividad7 {
    /*
     * Realiza el control de acceso a una caja fuerte. La combinación será un
     * número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
     * acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
     * y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
     * Tendremos cuatro oportunidades para abrir la caja fuerte.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Adivina la combinación para abrir la caja fuerte. Es un número de 4 cifras.");
        int contador = 1;
        boolean correcto = false;

        do {
            System.out.print("Introduzca la combinación: ");
            int codigo = s.nextInt();

            if (codigo == 1433) {
                correcto = true;
            } else {
                System.out.println("Lo siento, esa no es la combinación");
            }

            contador ++;

        } while (contador < 5 && correcto != true);

        if (correcto == true) {
            System.out.print("La caja fuerte se ha abierto satisfactoriamente");
        } else
            System.out.print("Se acabaron los intentos. Game Over.");
        
            s.close();
    }
}
