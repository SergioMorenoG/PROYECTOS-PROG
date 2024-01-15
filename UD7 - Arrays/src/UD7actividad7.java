import java.util.Scanner;

public class UD7actividad7 {
    /*
     * Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
     * muestre por pantalla separados por espacios. El programa pedirá entonces por
     * teclado dos valores y a continuación cambiará todas las ocurrencias del primer 
     * valor por el segundo en la lista generada anteriormente. Los números que se
     * han cambiado deben aparecer entrecomillados.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int num[] = new int[100];

        System.out.println("A continuación se muestra una lista con 100 números aleatorios del 0 al 20: ");

        for (int i = 0; i < 100; i++) {
            num[i] = (int) (Math.random() * 21);
            System.out.print(num[i] + " ");
            Thread.sleep(150);
        }

        System.out.print("\n¿Qué número de la lista te gustaría cambiar?: ");
        int numQuitar = s.nextInt();
        System.out.print("¿Por qué valor debemos cambiar ese número?: ");
        int numCambiar = s.nextInt();

        System.out.println("La lista actualizada queda tal que así: ");
        for (int j = 0; j < 100; j++) {
            if (num[j] == numQuitar) {
                num[j] = numCambiar;
                System.out.print("'" + num[j] + "'" + " ");
                Thread.sleep(150);
            } else
                System.out.print(num[j] + " ");
                Thread.sleep(150);
        }

    s.close();
    
    }
}
