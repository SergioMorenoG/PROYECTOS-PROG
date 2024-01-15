import java.util.Scanner;

public class UD7actividad3 {
    /*
     * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
     * elementos según la tabla que se muestra a continuación. Muestra el contenido
     * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
     * que no han sido inicializados?
     */
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int num[] = new int[10];

    System.out.println("Este programa te pedirá 10 números y luego lo mostrará a la inversa.");
    for (int i = 0; i < 10; i++) {
        System.out.print("Introduzca el número " + (i + 1) + "º: ");
        num[i] = s.nextInt();
    }

    System.out.print("Los números a la inversa son: ");
    for (int j = 9; j >= 0; j--) {
        System.out.print(num[j] + " ");
        Thread.sleep(300);
    }
    
    s.close();
    
    
    
    }
}
