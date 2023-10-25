public class UD2actividad4 {

  /*
   * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
   * convertir deberá estar almacenada en una variable.
   */

  public static void main(String[] args) {
    double euros = 6.00;
    //Sabemos que 1 euro = 	166.386 pesetas
    int pesetas = (int) (euros * 166.386);

    System.out.println("La conversión de " + euros + " es de: " + pesetas + " pesetas." );

  }
}
