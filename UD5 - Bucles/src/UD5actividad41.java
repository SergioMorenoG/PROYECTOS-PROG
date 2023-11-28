import java.util.Scanner;

public class UD5actividad41 {
    /*
    * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
    * hay dentro de un número. Se recomienda usar long en lugar de int ya que el
    * primero admite números más largos.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduce un número entero positivo: ");
        long numeroIntroducido = s.nextLong();
        
        //Controla que el número no sea 0 o negativo
        while (numeroIntroducido <= 0) {
            System.out.print("El número no es entero positivo, introduzca otro: ");
            numeroIntroducido = s.nextLong();
        }
        //Declaramos las variables a usar
        long comprobacion = numeroIntroducido;
        int contadorPares = 0;
        int contradorImpares = 0;
        long digito = 0;

        //Con el bucle vamos invirtiendo el numero y reduciendolo para contar todos los dígitos
        // el if controla si el número es par o impar y lleva la cuenta
        while (comprobacion > 0) {
            digito = (digito * 10) + (comprobacion % 10);
            comprobacion /= 10;
            if (digito % 2 == 0) {
                contadorPares++;
            } else
                contradorImpares++;
            digito = 0;
        }
        
        //Imprime al usuario el resultado (está puesto así para que se vea bien en el archivo)
        System.out.print("El número " + numeroIntroducido + " contiene " + contadorPares);
        System.out.print(" dígitos pares y " + contradorImpares + " dígitos impares.");
        s.close();

    }
}
