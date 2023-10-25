import java.util.Scanner;

public class Lecturascanner {
    public static void main(String[] args) throws Exception {
        Scanner y = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = y.nextLine();

        System.out.print("Introduce tu edad: ");
        int edad = Integer.parseInt(y.nextLine());

        System.out.println("Tu nombre es " + nombre + " y tu edad es " + edad);

        //Modo más sencillo, lectura en la misma línea separada con un espacio

        Scanner s = new Scanner(System.in);

        System.out.print("Introduce tu nombre y edad separados por un espacio: ");
        String name = s.next();
        int age = s.nextInt();

        System.out.println("Tu nombre es " + name + " y tienes " + age + " años.");

        y.close();
        s.close();
    }
}
