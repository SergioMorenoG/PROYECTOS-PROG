import java.util.Scanner;

public class UD6actividad6 {
    /*
     * Escribe un programa que piense un número al azar entre 0 y 100. 
     * El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
     * Después de cada intento fallido,el programa dirá cuántas oportunidades quedan 
     * y si el número introducido es menor o mayor que el número secreto.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Debes adivinar un número entre el 0 al 100, tienes 5 oportunidades.");
        int oportunidades = 5;
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        int numeroIntroducido = 0;

        do {
            System.out.print("Introduce el número que crees que es: ");
            numeroIntroducido = s.nextInt();
            oportunidades--;
            if (oportunidades > 0) {
                if (numeroIntroducido > numeroAleatorio) {
                System.out.println("Incorrecto, el número introducido es MENOR, te quedan " + oportunidades + " intentos.");
                } else if (numeroIntroducido < numeroAleatorio) {
                    System.out.println("Incorrecto, el número introducido es MAYOR, te quedan " + oportunidades + " intentos.");
                }
            }
        } while ((oportunidades > 0) && (numeroIntroducido != numeroAleatorio));

        if (oportunidades == 0 && numeroIntroducido != numeroAleatorio) {
            System.out.print("Te has quedado sin oportunidades... El número correcto era el " + numeroAleatorio + ". Vuelve a inicar el programa para jugar");
        } else
            System.out.print("Enhorabuena! Has acertado el número correcto, era el " + numeroAleatorio);

        s.close();

    }
}
