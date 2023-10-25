import java.util.Scanner;

public class UD3actividad8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("¿Cuántas horas ha trabajado el empleado esta semana?: ");
        int horas = s.nextInt();
        int total = 12 * horas;

        System.out.print("El salario de este semana es de: " + total + " euros.");

        s.close();
    }
}
