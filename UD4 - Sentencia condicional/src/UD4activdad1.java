import java.util.Scanner;

public class UD4activdad1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un día de la semana para saber que asignatura toca a primera: ");
        String asignatura = s.nextLine();
        asignatura.toLowerCase();

        switch (asignatura) {
            case "lunes":
            case "martes":
                System.out.print("Sistemas Informáticos");
                break;
            case "miercoles":
            case "viernes":
                System.out.print("Bases de Datos");
                break;
            case "jueves":
                System.out.print("Lenguaje de Marcas");
                break;
            default:
                System.out.print("Eso no es un día de la semana...");
                break;
        }
        s.close();  
    }
}
