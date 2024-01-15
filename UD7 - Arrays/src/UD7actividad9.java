import java.util.Scanner;

public class UD7actividad9 {
    /*
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes
     * de un determinado año y que muestre a continuación un diagrama de barras
     * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     * de asteriscos o cualquier otro carácter.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[8];

        System.out.println("Este programa te pedirá números enteros y te mostrará el listado poniendo si el num es par o impar");
        
        for (int i = 0; i < 8; i++) {
            System.out.print("Introduzca el número " + (i+1) + "º: ");
            num[i] = s.nextInt();
        }
    
        System.out.println("Estos son los números introducidos:");

        for (int j = 0; j < 8; j++) {
            if (num[j] % 2 == 0) {
                System.out.println(num[j] + " PAR");
            } else
                System.out.println(num[j] + " IMPAR");
        }
    
    s.close();
    
    }
}
