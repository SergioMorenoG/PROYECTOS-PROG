public class Lecturanumeros {
    public static void main(String[] args) throws Exception {
        
        String linea;

        System.out.print("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int numero1;
        numero1 = Integer.parseInt(linea);
        
        System.out.print("Introduce otro número: ");
        linea = System.console().readLine();
        int numero2;
        numero2 = Integer.parseInt(linea);

        int sumatorio = numero1 + numero2;
        System.out.println("La suma de " + numero1 + " con " + numero2 + " es igual a: " + sumatorio);
    }
}
