import java.util.Scanner;

public class UD4actividad22 {
    public static void main(String[] args) {
    int contador = 0;
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce el día de la semana: ");
    String dia = s.next();
    dia.toLowerCase();

    switch (dia) {
        case "lunes":
            contador = 0;
            break;
        case "martes":
            contador = 1;
            break;
        case "miercoles":
            contador = 2;
            break;
        case "jueves":
            contador = 3;
            break;
        case "viernes":
            contador = 4;
            break;
        default:
            System.out.print("Eso no es un día de la semana...");
    }

    System.out.print("Introduce la hora: ");
    int hora = s.nextInt();

    System.out.print("Introduce los minutos: ");
    int minutos = s.nextInt();

    int minutosfinde = (4 * 24 * 60) + (15 * 60);
    int minutostransc = (contador * 24 * 60) + (hora * 60) + minutos;
    int total = minutosfinde - minutostransc;

    System.out.print("Quedan un total de " + total + " minutos para el fin de semana.");

    s.close();
    }
}
