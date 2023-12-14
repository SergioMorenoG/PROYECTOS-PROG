public class UD6actividad3 {

    /*
     * Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
     * de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa te muestra de manera aleatoria una carta de la baraja española.");

        int numeroCarta = (int) (Math.random() * 12) + 1;
        int paloCarta = (int) (Math.random() * 4);

        System.out.print("Has sacado ");
        if (numeroCarta == 1) {
            System.out.print("el As de ");
        } else if (numeroCarta == 2) {
            System.out.print("el 2 de ");
        } else if (numeroCarta == 3) {
            System.out.print("el 3 de ");
        } else if (numeroCarta == 4) {
            System.out.print("el 4 de ");
        } else if (numeroCarta == 5) {
            System.out.print("el 5 de ");
        } else if (numeroCarta == 6) {
            System.out.print("el 6 de ");
        } else if (numeroCarta == 7) {
            System.out.print("el 7 de ");
        } else if (numeroCarta == 10) {
            System.out.print("la Sota de ");
        } else if (numeroCarta == 11) {
            System.out.print("el Caballo de ");
        } else if (numeroCarta == 12) {
            System.out.print("el Rey de ");
        }


        if (paloCarta == 0) {
            System.out.print("Oros.");
        } else if (paloCarta == 1) {
            System.out.print("Espadas.");
        } else if (paloCarta == 2) {
            System.out.print("Copas.");
        } else if (paloCarta == 3) {
            System.out.print("Bastos.");
        }
    }
}

