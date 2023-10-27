import java.util.Scanner;

public class UD4actividad8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce las 3 notas separadas por un espacio: ");
        float nota1 = s.nextFloat();
        float nota2 = s.nextFloat();
        float nota3 = s.nextFloat();

        float media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("La media de las notas es de %.2f.\n", media);
        
        if (media > 10 || media < 0) {
            System.out.print("No es posible que la media sea mayor de 10 o negativa... ");
        } else if (media >= 9 && media <= 10) {
            System.out.print("Has sacado un SOBRESALIENTE, ¡enhorabuena!");
        } else if (media >= 7 && media < 9) {
            System.out.print("Has sacado un NOTABLE, ¡genial!");
        } else if (media >= 6 && media < 7) {
            System.out.print("Has sacado un BIEN, no está mal");
        } else if (media >= 5 && media < 6) {
            System.out.print("Has sacado un SUFICIENTE, muy mejorable...");
        } else if (media < 5) {
            System.out.print("Has sacado un SUSPENSO, buena suerte en la recuperación");
        }
        s.close();
    }
}
