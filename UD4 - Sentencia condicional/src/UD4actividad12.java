import java.util.Scanner;

public class UD4actividad12 {
    public static void main(String[] args) {
        int contador = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Vamos a hacer un cuestionario sobre la F1, a ver cuanto sabes!");
        System.out.println("¿Quién es el actual campeón del mundo?: ");
        System.out.println("a) Fernando Alonso");
        System.out.println("b) Lewis Hamilton");
        System.out.println("c) Lance Strulovich");
        System.out.println("d) Maximilian Verstappen");
        String res1 = s.nextLine();

        if (res1.equals("d")) {
            contador ++;
        }

        System.out.println("¿Cuántos mundiales tiene el expiloto alemán Sebastian Vettel?: ");
        System.out.println("a) 3");
        System.out.println("b) 4");
        System.out.println("c) 6");
        System.out.println("d) 1");
        String res2 = s.nextLine();

        if (res2.equals("b")) {
            contador ++;
        }

        System.out.println("¿Cuántas victorias tiene Fernando Alonso?: ");
        System.out.println("a) 32");
        System.out.println("b) 33");
        System.out.println("c) 42");
        System.out.println("d) 36");
        String res3 = s.nextLine();

        if (res3.equals("a")) {
            contador ++;
        }

        System.out.println("¿Cuál de estas opciones contiene la trayectoria correcta de Carlos Sainz VdC?: ");
        System.out.println("a) Toro Rosso, Renault, Mclaren y Ferrari");
        System.out.println("b) Toro Rosso, Red Bull, Renault, Mclaren y Ferrari");
        System.out.println("c) Williams, Mclaren y Ferrari");
        System.out.println("d) Alpha Tauri, Mclaren, Renault y Ferrari");
        String res4 = s.nextLine();

        if (res4.equals("a")) {
            contador ++;
        }

        System.out.println("¿Cuántos pilotos han pasado por Alpha Tauri este año? ");
        System.out.println("a) 5");
        System.out.println("b) 3");
        System.out.println("c) 4");
        System.out.println("d) 2");
        String res5 = s.nextLine();

        if (res5.equals("c")) {
            contador ++;
        }

        System.out.print("Has obtenido " + contador + " respuestas correctas.");

        s.close();

    }
}
