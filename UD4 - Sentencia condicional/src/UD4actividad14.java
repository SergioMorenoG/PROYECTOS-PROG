import java.util.Scanner;

public class UD4actividad14 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un número entero para saber si es par y/o divisible entre 5: ");
    int num = s.nextInt();

    if ((num % 2) == 0) {
        System.out.print("El número introducido es par");
    } else
        System.out.print("El número introducido es impar");
    
    if ((num % 5) == 0) {
        System.out.print(" y es divisible entre 5.");
    } else
        System.out.print(" y no es divisible entre 5.");

    s.close();
    }
}
