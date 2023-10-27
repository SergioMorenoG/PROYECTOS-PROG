import java.util.Scanner;

public class UD4actividad2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca una hora en forma de número entero (desde la 0 a las 23) y sin minutos: ");
        int hora = s.nextInt();

        if (hora >= 6 && hora <= 12) {
            System.out.print("Buenos días");
        } else if (hora >= 13 && hora <= 20) {
            System.out.print("Buenas tardes");
        } else if (hora >= 21 && hora < 24 || hora <=5 && hora >= 0){
            System.out.print("Buenas noches");
        } else if (hora < 0 || hora >=24) {
            System.out.print("Hora no válida");
        }
    
        s.close();
    }
}
