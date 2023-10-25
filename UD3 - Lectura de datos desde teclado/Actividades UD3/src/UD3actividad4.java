import java.util.Scanner;
/*
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado
 */


public class UD3actividad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Escriba los dos dígitos separados por un espacio: ");
        double num1 = s.nextDouble();
        double num2 = s.nextDouble();

        double suma = num1 * num2;
        double resta = num1 - num2;
        double multi = num1 * num2;
        double divi = num1 / num2;

        System.out.printf("La suma de " + num1 + " con " + num2 + " es igual a: " + "%.2f \n", suma);
        System.out.printf("La resta de " + num1 + " con " + num2 + " es igual a: " + "%.2f \n", resta);
        System.out.printf("La multiplicación de " + num1 + " con " + num2 + " es igual a: " + "%.2f \n", multi);
        System.out.printf("La división de " + num1 + " con " + num2 + " es igual a: " + "%.2f \n", divi);
        
        s.close();
    }
}
