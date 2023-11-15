import java.util.Scanner;

public class UD5actividad21 {
    /*
     * Realiza un programa que vaya pidiendo números hasta que se introduzca un
     * numero negativo y nos diga cuantos números se han introducido, la media de
     * los impares y el mayor de los pares. El número negativo sólo se utiliza para
     * indicar el final de la introducción de datos pero no se incluye en el cómputo
     */
    public static void main(String[] args) {
        int numeroIntroducido;
        int contador = 0;
        int numeroImpar = 0;
        int totalNumImpar = 0;
        int numeroPar = 0;
        int numeroParMayor = 0;
        int contadorNumImpar = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("El programa te va a ir pidiendo número para hacer cálculos, introduce un num negativo para salir.");

        do {
            //Primero pedimos el número al usuario y sumamos 1 al contador
            System.out.print("Introduce un número: ");
            numeroIntroducido = s.nextInt();
            contador++;
            //Con este if controlamos los números impares y dentro la suma y cantidad que se ha introducido
            if (numeroIntroducido % 2 != 0 && numeroIntroducido > 0) {
                numeroImpar = numeroIntroducido;
                totalNumImpar += numeroImpar;
                contadorNumImpar++;
            //Con este if controlamos los números pares y con otro if somos capaces de dar valor al núm par más grande
            } else if (numeroIntroducido % 2 == 0 && numeroIntroducido > 0) {
                if (numeroPar < numeroIntroducido) {
                    numeroPar = numeroIntroducido;
                }
            }
        //Dejamos de pedir num cuando el usuario introduce un num menor que 0, es decir, negativo
        } while (numeroIntroducido > 0);
    
        System.out.println("Has introducido un total de " + contador + " números.");
        System.out.println("La media de los números impares introducidos es de " + (totalNumImpar/contadorNumImpar));
        System.out.println("El número par más grande que has introducido es el " + numeroPar);
    
    s.close();
    }
}
