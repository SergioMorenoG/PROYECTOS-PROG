import java.util.Scanner;

public class UD7actividad8 {
    /*
     * Realiza un programa que pida la temperatura media que ha hecho en cada mes
     * de un determinado año y que muestre a continuación un diagrama de barras
     * horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
     * de asteriscos o cualquier otro carácter.
     */
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    int temp[] = new int[12];
    String mes [] = {
        "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
    };
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String azul = "\033[34m";
    String morado = "\033[35m";
    String blanco = "\033[37m";


    System.out.println("Este programa muestra de manera más visual las temperaturas del año.");

    for (int i = 0; i < 12; i++) {
        System.out.print("Introduzca la temperatura de " + mes[i] + ": ");
        temp[i] = s.nextInt();
    }

    System.out.print("\nEl gráfico queda tal que así:\n");
    
    for (int j = 0; j < 12; j++) {
        System.out.printf(azul + "%12s " + verde + "│", mes[j]);
        for (int k = 0; k < temp[j]; k++) {
            System.out.print(morado + "*");
        }
        System.out.println(naranja + " " + temp[j] + "ºC" + blanco);
    }

    s.close();
    
    }
}
