import java.util.Scanner;

public class UD5actividad26 {
    /*
   * Realiza un programa que pida primero un número y a continuación un dígito.
   * El programa nos debe dar la posición (o posiciones) contando de izquierda a
   * derecha que ocupa ese dígito en el número introducido.
   */
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número que contenga varias cifras: ");
    int numeroIntroducido = s.nextInt();
    System.out.print("Introduce un dígito de ese número para saber en que posición se encuentra: ");
    int digito = s.nextInt();
    
    while (digito >= 10) {
        System.out.print("He pedido un dígito... Vuelva a introducir el dígito: ");
        digito = s.nextInt();
    }

    System.out.print("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroIntroducido + " en las siguientes posiciones: ");
    int numero = numeroIntroducido;
    int volteado = 0;
    int longitud = 0;
    int posicion = 1;

    if (numero == 0) {
        longitud = 1;
    }

    while (numero > 0) {
    volteado = (volteado * 10) + (numero % 10);
    numero /= 10;
    longitud++;
    } 

    while (volteado > 0) {
        if ((volteado % 10) == digito) {
        System.out.print(posicion + " ");
        }
    volteado /= 10;
    posicion++;
    } 

    System.out.println();

    }
}
