import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*         Scanner s = new Scanner(System.in);
        System.out.print("Introduce cuantos números quiere generar: ");
        int numeroIntroducido = s.nextInt();

        for (int i = 1; i < numeroIntroducido; i++) {
            System.out.println((int)(Math.random()*11 + 50) + "  ");
        }

        s.close(); */


        Scanner s = new Scanner(System.in);
        System.out.println("Vamos a jugar a piedra, papel o tijera: ");
        int juego = 0;

        for (int i = 1; i < 11; i++) {
            juego = (int)(Math.random()*3);
            System.out.println(juego);
                if (juego == 0) {
                    System.out.println("Piedra");
                } else if (juego == 1) {
                    System.out.println("Papel");
                } else if (juego == 2) {
                    System.out.println("Tijera");
               }
        }
    }
}
