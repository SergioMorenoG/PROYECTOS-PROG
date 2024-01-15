import java.util.Scanner;

public class aprendiendoarrays {
    public static void main(String[] args) throws Exception {
/*         Scanner s = new Scanner(System.in);
    

        int n[] = {100, 300, 33, 542, 1000};

        n[0] = 100;
        n[1] = 300;
        n[2] = 33;
        n[3] = 542;
        n[4] = 1000; 

        System.out.print("Introduzca el elemento del array que quieras ver (tiene 5 elementos): ");
        int elemento = s.nextInt();
        System.out.print("El elemento que se encuentra en la posición " + elemento);
        System.out.println(" es el " + n[elemento]); */

        int[][] n = new int[3][2]; // array de 3 filas por 2 columnas
        n[0][0]=20;
        n[1][0]=67;
        n[1][1]=33;
        n[2][1]=7;

        int fila, columna;

        for(fila = 0; fila < 3; fila++) {
            System.out.print("Fila: " + fila);
                for(columna = 0; columna < 2; columna++) {
                    System.out.printf("%10d ", n[fila][columna]);
                    Thread.sleep(1000); // retardo de un segundo
                }
            System.out.println();
        }
    }
}
