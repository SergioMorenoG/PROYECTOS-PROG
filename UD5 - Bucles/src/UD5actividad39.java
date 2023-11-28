import java.util.Scanner;

public class UD5actividad39 {
    /*
    * Escribe un programa que pida un número entero positivo por teclado y que
    * muestre a continuación los números desde el 1 al número introducido junto
    * con su factorial..
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        int numeroIntroducido = s.nextInt();

        while (numeroIntroducido <= 0) {
            System.out.print("El número introducido no es entero positivo, introduzca otro: ");
            numeroIntroducido = s.nextInt();
        }
    
        int factorial = 1;

        for (int i = 1; i < numeroIntroducido + 1; i++) {
            factorial *= i;
            System.out.println(i + "!" + " = " + factorial);
        }
        s.close();
    }
}
