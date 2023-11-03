import java.util.Scanner;

public class UD4actividad15 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa dibuja una pirámide con el caracter introducido.");
    System.out.print("¿Qué caracter debe tener la piramide?: ");
    String car = s.nextLine();

    System.out.println("¿Dé que lado debe estar apuntando la pirámide?");
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Derecha");
    System.out.println("4. Izquierda");
    int opcion = s.nextInt();

    switch (opcion) {
        case 1:
            System.out.println("  " + car);
            System.out.println(" " + car + car + car );
            System.out.println(car + car + car + car + car);
            break;
        case 2:
            System.out.println(car + car + car + car + car);
            System.out.println(" " + car + car + car );
            System.out.println("  " + car);
            break;
        case 3:
            System.out.println(car);
            System.out.println(car + " " + car);
            System.out.println(car + " " + car + " " + car);
            System.out.println(car + " " + car);
            System.out.println(car);
            break;
        case 4:
            System.out.println(" " + " " + " " + " " + car);
            System.out.println(" " + " " + car + " " + car);
            System.out.println(car + " " + car + " " + car);
            System.out.println(" " + " " + car + " " + car);
            System.out.println(" " + " " + " " + " " + car);
        default:
            System.out.print("Número erróneo");
            break;
        }   
        s.close();
    }
}
