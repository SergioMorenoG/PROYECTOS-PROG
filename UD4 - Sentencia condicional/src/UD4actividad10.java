import java.util.Scanner;

public class UD4actividad10 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa te dice tu signo del horóscopo.");
    System.out.print("¿En qué día naciste?: ");
    int dia = s.nextInt();
    System.out.print("¿En qué mes naciste? (del 1 al 12): ");
    int mes = s.nextInt();

    switch (mes) {
      case 1:
        if (dia <= 19) {
          System.out.print("Capricornio");
        } else System.out.print("Acuario");
        break;
      case 2:
        if (dia <= 18) {
          System.out.print("Acuario");
        } else System.out.print("Piscis");
        break;
      case 3:
        if (dia <= 20) {
          System.out.print("Piscis");
        } else System.out.print("Aries");
        break;
      case 4:
        if (dia <= 19) {
          System.out.print("Aries");
        } else System.out.print("Tauro");
        break;
      case 5:
        if (dia <= 20) {
          System.out.print("Tauro");
        } else System.out.print("Géminis");
        break;
      case 6:
        if (dia <= 20) {
          System.out.print("Géminis");
        } else System.out.print("Cáncer");
        break;
      case 7:
        if (dia <= 22) {
          System.out.print("Cáncer");
        } else System.out.print("Leo");
        break;
      case 8:
        if (dia <= 22) {
          System.out.print("Leo");
        } else System.out.print("Virgo");
        break;
      case 9:
        if (dia <= 22) {
          System.out.print("Virgo");
        } else System.out.print("Libra");
        break;
      case 10:
        if (dia <= 22) {
          System.out.print("Libra");
        } else System.out.print("Escorpio");
        break;
      case 11:
        if (dia <= 21) {
          System.out.print("Escorpio");
        } else System.out.print("Sagitario");
        break;
      case 12:
        if (dia <= 21) {
          System.out.print("Sagitario");
        } else System.out.print("Capricornio");
        break;
      default:
        System.out.print("Día o mes erróneo, vuelve a introducirlo.");
        break;
    }

    s.close();
  }
}
