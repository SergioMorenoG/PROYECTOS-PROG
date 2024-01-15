import java.util.Scanner;

public class UD7actividad15 {
    /*
     * Un restaurante nos ha encargado una aplicación para colocar a los clientes en
     * sus mesas. En una mesa se pueden sentar de 0 (mesa vacía) a 4 comensales
     * (mesa llena). Cuando llega un cliente se le pregunta cuántos son. De momento
     * el programa no está preparado para colocar a grupos mayores a 4, por tanto, si
     * un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje
     * “Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
     * como máximo e intente de nuevo”. Para el grupo que llega, se busca
     * siempre la primera mesa libre (con 0 personas). Si no quedan mesas libres, se
     * busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es de
     * dos personas, se podrá colocar donde haya una o dos personas. Inicialmente,
     * las mesas se cargan con valores aleatorios entre 0 y 4. Cada vez que se sientan
     * nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se
     * pueden romper aunque haya huecos sueltos suficientes
     */
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int mesas[] = new int[10];
        int i = 0;

        System.out.println("A continuación se muestra las mesas y el nº de ocupantes:");

        for (i = 0; i < 10; i++) {
            mesas[i] = (int) (Math.random()*5);
        }

        int personas = 0;

        do {
            for (i = 0; i < 10; i++) {
                System.out.print("Mesa nº " + (i + 1) + ": " + mesas[i] + "\n");
            }            
            System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
            personas = s.nextInt();
            if (personas > 4) {
                System.out.println("Lo siento, no admito grupos de " + personas + ", haga grupos de 4 personas como máximo e intente de nuevo");
            } else if (personas <= 4) {
                int mVacia = 0;
                boolean hayMesaVacia = false;
                for (i = 9; i >= 0 ; i--) {
                    if (mesas[i] == 0) {
                        mVacia = i;
                        hayMesaVacia = true;
                    }
                }
                if (hayMesaVacia) {
                    mesas[mVacia] = personas;
                    System.out.print("Por favor, siéntense en la mesa número " + (mVacia + 1) + ".\n");
                } else {
                    int mHueco = 0;
                    boolean hayHueco = false;
                    for (i = 9; i >= 0; i--) {
                        if (personas <= (4 - mesas[i])) {
                            mHueco = i;
                            hayHueco = true;
                        }
                    }
                    if (hayHueco) {
                        mesas[mHueco] += personas;
                        System.out.print("Tendrán que compartir mesa. " + "Por favor, siéntense en la mesa número " + (mHueco + 1) + ".\n");
                    } else {
                        System.out.print("Lo siento, en estos momentos no queda sitio.\n");
                    }
                }
            }
        } while (personas != -1);
    
        System.out.print("Gracias. Hasta pronto.");
        s.close();   
    }
}
