public class UD2actividad1 {
    /**
 * 
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 *  los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 *  el valor de cada variable, la suma, la resta, la división y la multiplicación.
 */

    public static void main(String[] args) {
        int x = 144;
        int y = 999;

        int sum = x + y;
        int res = x - y;
        float div = (float)x / (float)y;
        int mul = x * y;

        System.out.println("Los datos de las variables son: " + x + " y " + y);
        System.out.println("La suma de las variables es: " + sum);
        System.out.println("La resta de las variables es: " + res);
        System.out.println("La división de las variables es: " + div);
        System.out.println("La multiplicación de las variables es: " + mul);
    }
}
