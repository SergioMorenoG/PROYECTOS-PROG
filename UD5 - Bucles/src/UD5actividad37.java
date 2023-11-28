import java.util.Scanner;

public class UD5actividad37 {
    /*
    * Realiza un conversor del sistema decimal al sistema de “palotes”.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numeroIntroducido = s.nextLong();

        //Comprueba que el num introducido no es negativo
        while (numeroIntroducido < 0) {
            System.out.print("El número no es entero positivo, introduce otro: ");
            numeroIntroducido = s.nextLong();
        }

        long comprobar = numeroIntroducido;
        long volteado = 0;

        //Primera parte de la frase
        System.out.print("El número " + numeroIntroducido + " en decimal es");

        //Da la vuelta al número introducido y lo guarda en la variable "volteado"
        while (comprobar > 0) {
            volteado = (volteado * 10) + (comprobar % 10);
            comprobar /= 10;
        }    

        //Hacemos el mismo proceso pero al contrario, volteamos el núm volteado para comprobarlo 1 a 1 correctamente
        long digito = 0;
        long comprobar2 = volteado;

        //Comprobamos 1 a 1 los dígitos, con el if controlamos cuantos palotes poner según el dígito
        while (comprobar2 > 0) {
            digito = (digito * 10) + (comprobar2 % 10);
            comprobar2 /= 10;
                if (digito == 0) {
                    System.out.print(" ");
                } else if (digito == 1) {
                    System.out.print(" | ");
                } else if (digito == 2) {
                    System.out.print(" | | ");
                } else if (digito == 3) {
                    System.out.print(" | | | ");
                } else if (digito == 4) {
                    System.out.print(" | | | | ");
                } else if (digito == 5) {
                    System.out.print(" | | | | | ");
                } else if (digito == 6) {
                    System.out.print(" | | | | | | ");
                } else if (digito == 7) {
                    System.out.print(" | | | | | | | ");
                } else if (digito == 8) {
                    System.out.print(" | | | | | | | | ");
                } else if (digito == 9) {
                    System.out.print(" | | | | | | | | | ");
                }
            
            //Imprimimos el "-" y damos valor 0 al digito para que solo guarde el siguiente
            System.out.print("-");
            digito = 0;
        }

        //Imprimimos el final de la frase una vez finalizada la comprobación
        System.out.print(" en el sistema de palotes.");
        s.close();
    }
}
