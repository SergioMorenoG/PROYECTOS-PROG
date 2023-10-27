import java.util.Scanner;

public class UD4actividad3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un número del 1 al 7 para saber el día de la semana: ");
        int num_semana = s.nextInt();

        switch (num_semana) {
            case 1:
                System.out.print("Lunes");
                break;
            case 2:
                System.out.print("Martes");
                break;
            case 3:
                System.out.print("Miércoles");
                break;
            case 4:
                System.out.print("Jueves");
                break;
            case 5:
                System.out.print("Viernes");
                break;
            case 6:
                System.out.print("Sábado");
                break;
            case 7:
                System.out.print("Domingo");
                break;
            default:
                System.out.print("Número no válido");
                break;
        }
        s.close();
    }
}
