import java.util.Scanner;
/*
 * 
 *  INCOMPLETO - REVISAR EN CASA EL FIN DE SEMANA
 */
public class UD4actividad9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Este programa calcula una ecuación de segundo grado mediante su fórmula");
        System.out.print("Introduce el valor de a: ");
        int a = s.nextInt();
        System.out.print("Introduce el valor de b: ");
        int b = s.nextInt();
        System.out.print("Introduce el valor de c: ");
        int c= s.nextInt();

        double ecuacion1 = (-(double) b + (Math.sqrt(Math.pow((double) b,2) + (4 * (double) a * (double) c))) / (2 * (double) a));
        double ecuacion2 = (-(double) b + (Math.sqrt(Math.pow((double) b,2) - (4 * (double) a * (double) c))) / (2 * (double) a));

        System.out.println("Ecuacion 1 = " + ecuacion1 );
        System.out.println("Ecuacion 2 = " + ecuacion2 );

        if (a == 0) {
            System.out.print("Esa ecuación no tiene solución real.")
        } else if () {
            
        }
    }
}
