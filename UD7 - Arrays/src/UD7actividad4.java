public class UD7actividad4 {
    /*
     * Define tres arrays de 20 números enteros cada una, con nombres numero, cuadrado
     * y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el array
     * cuadrado se deben almacenar los cuadrados de los valores que hay en el array
     * numero. En el array cubo se deben almacenar los cubos de los valores que hay en
     * numero. A continuación, muestra el contenido de los tres arrays dispuesto en tres
     * columnas.
     */
    public static void main(String[] args) throws Exception {
    // Inicializamos los 3 arrays
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];

    // Bucle para darle valor al número aleatorio, a su cuadrado y a su cubo
        for (int i = 0; i < 20; i++) {
            numero[i] = (int) (Math.random() * 100) + 1;
            cuadrado[i] = (int) (Math.pow(numero[i], 2));
            cubo[i] = (int) (Math.pow(numero[i], 3));
        }

    // Muestra los números en una lista de manera ordenada
        for (int j = 0; j < 20; j++) {
            System.out.printf("%5d %10d %10d", numero[j], cuadrado[j], cubo [j]);
            System.out.println();
            Thread.sleep(300);
        }
    
    
    
    
    }
}
