import java.util.Scanner;

public class UD5actividad42 {
    /*
    * Escribe un programa que pida un número entero positivo por teclado y que
    * muestre a continuación los 5 números consecutivos a partir del número
    * introducido. Al lado de cada número se debe indicar si se trata de un primo
    * o no.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numeroIntroducido = s.nextInt();

        //Controlamos que el número no sea negativo
        while (numeroIntroducido < 0) {
            System.out.print("El número no es entero positivo, introduzca otro: ");
            numeroIntroducido = s.nextInt();
        }

        //Con esta variable controlamos si es primo o no
        boolean esPrimo = true;

        //Hacemos el bucle para que se ejecute 5 veces
        for (int i = 0; i < 5; i++) {
            System.out.print(numeroIntroducido);

            //Ningún número par es primo, así que nos lo quitamos de en medio
            //para no ejectuar todo
            if (numeroIntroducido % 2 == 0) {
                esPrimo = false;
            }

            //Ejecutamos un bucle para comprobar desde 3 los números impares
            //que sean divisibles por el número
            if (esPrimo) {
                for (int j = 3; j < numeroIntroducido; j+=2) {
                    if (numeroIntroducido % j == 0) {
                        esPrimo = false;
                    }
                }
            }

            //Imprimimos si es primo o no, en el caso de no ser primo
            //reseteamos el booleano para que no de errores
            if (esPrimo) {
                System.out.println(" es primo");
            } else
                System.out.println(" no es primo");
                esPrimo = true;

            //Incrementamos 1 el número para que compruebe el siguiente
            numeroIntroducido++;
        }
        s.close();
    }
}
