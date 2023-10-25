import java.util.Scanner;

public class UD3actividad12 {
    /*
     * Realiza un programa que calcule la nota que hace falta sacar en el segundo
     * examen de la asignatura Programación para obtener la media deseada. Hay
     * que tener en cuenta que la nota del primer examen cuenta el 40% y la del
     * segundo examen un 60%.
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la nota del primer examen: ");
        double exam1 = s.nextDouble();

        System.out.print("¿Qué nota quieres sacar en el trimestre?: ");
        double nota = s.nextDouble();

        double exam2 = (nota - exam1 * 0.4) / 0.60;

        System.out.printf("Para tener un " + nota + " en el trimestre necesitas sacar un %.2f en el segundo examen", exam2);

        s.close();
    }
}
