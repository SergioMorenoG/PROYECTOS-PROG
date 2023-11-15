import java.util.Scanner;

public class UD5actividad18 {
    /*
     * Escribe un programa que obtenga los números enteros comprendidos entre dos
     * números introducidos por teclado y validados como distintos, el programa debe
     * empezar por el menor de los enteros introducidos e ir incrementando de 7 en
     * 7.
     */
    public static void main(String[] args) {
        int auxiliar;
        Scanner s = new Scanner(System.in);
        System.out.print("Introduzca el primer número: ");
        int num1 = s.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = s.nextInt();

        while (num1 == num2) {
            System.out.println("Los dos números no pueden ser iguales, vuelve a introducirlos");
            System.out.print("Introduce el primer número: ");
                num1 = s.nextInt();
            System.out.print("Introduce el segundo número: ");
                num2 = s.nextInt();
        } 

        if (num1<num2) {
            System.out.print("Los números de 7 en 7 son: " + num1);
            auxiliar = num1;
            while (auxiliar < num2) {
                auxiliar += 7;
                if (auxiliar < num2) {
                    System.out.print(", " + auxiliar);
                }
                
            }
        } else if (num1>num2) {
            System.out.print("Los números de 7 en 7 son: " + num2);
            auxiliar = num2;
            while (auxiliar < num1) {
                auxiliar += 7;
                if (auxiliar < num1) {
                    System.out.print(", " + auxiliar);
                }
                
            }
        }
        s.close();
    }
}
