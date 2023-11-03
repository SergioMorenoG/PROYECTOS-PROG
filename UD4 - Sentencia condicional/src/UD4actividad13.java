import java.util.Scanner;

public class UD4actividad13 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce 3 números separados por un espacio: ");
    int num1 = s.nextInt();
    int num2 = s.nextInt();
    int num3 = s.nextInt();
    
    if (num1<num2 && num1<num3) {
        System.out.print("Los números ordenados quedan: " + num1 + ", " + num2 + " y " + num3);
    } else if (num1<num2 && num3<num2) {
        System.out.print("Los números ordenados quedan: " + num1 + ", " + num3 + " y " + num2);
    } else if (num2<num1 && num1<num3) {
        System.out.print("Los números ordenados quedan: " + num2 + ", " + num1 + " y " + num3);
    } else if (num2<num1 && num3<num1) {
        System.out.print("Los números ordenados quedan: " + num2 + ", " + num3 + " y " + num1);
    } else if (num3<num1 && num1<num2) {
        System.out.print("Los números ordenados quedan: " + num3 + ", " + num1 + " y " + num2);
    } else
        System.out.print("Los números ordenados quedan: " + num3 + ", " + num2 + " y " + num1);   

    s.close();
    }
}
