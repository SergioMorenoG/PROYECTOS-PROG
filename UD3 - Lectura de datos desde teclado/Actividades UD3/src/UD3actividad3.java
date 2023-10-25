import java.util.Scanner;

public class UD3actividad3 {
    
    /*
     * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
     * convertir debe ser introducida por teclado.
     */
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Introduzca la cantidad de pesetas que quieres convertir en euros: ");
        int pesetas = c.nextInt();

        // 1 peseta equivale a 0,00601012 euros
        double euros = (double) pesetas * 0.00601012;

        System.out.printf("La cantidad de " + pesetas + " pesetas, es igual a " + "%.2f" + " euros.", euros);

        c.close();
    }
}

