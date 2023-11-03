import java.util.Scanner;

public class UD4actividad21 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Nota del primer examen: ");
    float nota1 = s.nextFloat();
    System.out.print("Nota del segundo examen: ");
    float nota2 = s.nextFloat();

    float media = (nota1 + nota2) / 2;
    
    if (media < 5) {
        System.out.print("Cúal ha sido tu resultado en la recuperación? (apto/no apto): ");
        String recuperacion = s.next();
        if (recuperacion.equals("apto")) {
            media = 5;
        }
    }

    System.out.printf("Tu nota de Programación es: %.2f", media );

    s.close();

    }
}
