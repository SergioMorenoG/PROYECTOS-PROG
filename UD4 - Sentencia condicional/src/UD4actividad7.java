import java.util.Scanner;

public class UD4actividad7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce las 3 notas separadas por un espacio: ");
        float nota1 = s.nextFloat();
        float nota2 = s.nextFloat();
        float nota3 = s.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La media de las notas es de %.2f.", media);
        s.close();
    }
}
