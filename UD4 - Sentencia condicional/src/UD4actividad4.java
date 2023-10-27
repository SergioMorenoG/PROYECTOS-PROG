import java.util.Scanner;

public class UD4actividad4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("¿Cuántas horas ha trabajado el empleado?: ");
        int horas = s.nextInt();
        int hnormal = horas * 12;
        int hextra = horas * 16;

        if (horas < 0) {
            System.out.print("El trabajador no puede trabajar horas negativas...");
        } else if (horas > 40) {
            System.out.print("El sueldo semanal que le corresponde al trabajador es de: " + hextra + " euros.");
        } else if (horas <= 40) {
            System.out.print("El sueldo semana que le corresponde al trabajador es de: " + hnormal + " euros.");
        }
        s.close();
    }
}

