public class UD6actividad2 {

    /*
     * Realiza un programa que muestre al azar el nombre de una carta de la baraja
     * francesa. Esta baraja está dividida en cuatro palos: picas, corazones, diamantes
     * y tréboles. Cada palo está formado por 13 cartas, de las cuales 9 cartas son
     * numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K y A (que sería el
     * 1). Para convertir un número en una cadena de caracteres podemos usar
     * String.valueOf(n).
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa te muestra de manera aleatoria una carta de la baraja francesa.");

        int numeroCarta = (int) (Math.random() * 13) + 1;
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
        } else if (numeroCarta == 8) {
            System.out.print("el 8 de ");
        } else if (numeroCarta == 9) {
            System.out.print("el 9 de ");
        } else if (numeroCarta == 10) {
            System.out.print("el 10 de ");
        } else if (numeroCarta == 11) {
            System.out.print("la J de ");
        } else if (numeroCarta == 12) {
            System.out.print("la Q de ");
        } else if (numeroCarta == 13) {
            System.out.print("la K de ");
        }

        if (paloCarta == 0) {
            System.out.print("Picas.");
        } else if (paloCarta == 1) {
            System.out.print("Corazones.");
        } else if (paloCarta == 2) {
            System.out.print("Diamantes.");
        } else if (paloCarta == 3) {
            System.out.print("Tréboles.");
        }
    }
}
