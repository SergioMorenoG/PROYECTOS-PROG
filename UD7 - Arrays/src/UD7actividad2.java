public class UD7actividad2 {
    /*
     * Define un array de 10 caracteres con nombre simbolo y asigna valores a los
     * elementos según la tabla que se muestra a continuación. Muestra el contenido
     * de todos los elementos del array. ¿Qué sucede con los valores de los elementos
     * que no han sido inicializados?
     */
    public static void main(String[] args) throws Exception {
        char simbolo[] = new char[10];
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';

        for (int i = 0; i < 10; i++) {
            System.out.println("El valor del array número " + (i + 1) + " es: " + simbolo[i]);
        }

    //En este caso al utilizar un array tipo char, deja en blanco los elementos que no inicializamos.
    
    }
}
