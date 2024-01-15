import java.util.Scanner;

public class UD7actividad14 {
    /*
     * Escribe un programa que pida 8 palabras y las almacene en un array. A
     * continuación, las palabras correspondientes a colores se deben almacenar al
     * comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
     * auxiliares como quieras. Los colores que conoce el programa deben estar en
     * otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
     * blanco y morado.
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String palabra[] = new String[8];
        String ordenado[] = new String[8];
        String[] verde = {"verde"};
        String[] rojo = {"rojo"};
        String[] azul = {"azul"};
        String[] amarillo = {"amarillo"};
        String[] naranja = {"naranja"};
        String[] rosa = {"rosa"};
        String[] negro = {"negro"};
        String[] blanco = {"blanco"};
        String[] morado = {"morado"};
        String[] coloresArray = {"verde", "rojo" , "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        int colores = 0;

        int i = 0;

        System.out.println("Este programa te pedirá introducir palabras, ordena las palabras según si son colores detectados, el resultado lo verás luego.");

        for (i = 0; i < 8; i++) {
            System.out.print("Introduzca la palabra " + (i + 1) + "º: ");
            palabra[i] = s.nextLine();
        }
        
        for (i = 0; i < 8; i++) {
            if (palabra[i].equals("verde")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("rojo")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("azul")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("amarillo")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("naranja")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("rosa")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("negro")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("blanco")) {
                ordenado[colores++] = palabra[i];
            } else if (palabra[i].equals("morado")) {
                ordenado[colores++] = palabra[i];
            }
        }

        for (i = 0; i < 8; i++) {
            
        }
        
        System.out.println("Array original: ");
        for (i = 0; i < 8; i++) {
            System.out.print(palabra[i] + " ");
        }

        System.out.println("\nArray original: ");
        for (i = 0; i < 8; i++) {
            System.out.print(ordenado[i] + " ");
        }
    }
}
