import java.util.Scanner;

public class UD7actividad5 {
    /*
     * Escribe un programa que pida 10 números por teclado y que luego muestre los
     * números introducidos junto con las palabras “máximo” y “mínimo” al lado del
     * máximo y del mínimo respectivamente.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int numero[] = new int[10];
    //Inicializamos las variables de esta manera para asignarle valores inversos y que en el bucle se calcule el min y el max correctamente
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

    // Bucle que pide números y guarda en el array los elementos y en las variables el min y el max
        System.out.println("Este programa te pedirá 10 números y luego lo mostrará indicando cuál es el máximo y cuál es el mínimo.");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca el número " + (i + 1) + "º: ");
            numero[i] = s.nextInt();
            if (maximo < numero[i]) {
                maximo = numero[i];
            }
            if (minimo > numero[i]) {
                minimo = numero[i];
            }
        }

    // Bucle que imprime por pantalla los números introducidos y con un if controlamos cuando escribir "MAX" o "MIN"
        System.out.println("Los numeros son: ");
        for (int j = 0; j < 10; j++) {
            if (numero[j] == maximo) {
                System.out.println(numero[j] + " MÁXIMO");
            } else if (numero[j] == minimo) {
                System.out.println(numero[j] + " MÍNIMO");
            } else if (numero[j] != maximo && numero[j] != minimo ) {
                System.out.println(numero[j] + " ");
            }
        }
        
        s.close();

    }
}
