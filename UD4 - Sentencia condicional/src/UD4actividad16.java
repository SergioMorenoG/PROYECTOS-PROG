import java.util.Scanner;

public class UD4actividad16 {
    public static void main(String[] args) {
    int puntuacion = 0;
    String respuesta;
    Scanner s = new Scanner(System.in);
    System.out.println("Este programa detecta si hay probabilidad de que tu pareja te haya sido infiel en base a ciertas preguntas de verdadero y falso.");
    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer)\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("5. No te deja que mires la agenda de su teléfono móvil\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("9. Has notado que últimamente se perfuma más\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }

    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo\n  - (V)erdadero o (F)also: ");
    respuesta = s.nextLine();
    respuesta.toLowerCase();

    if (respuesta.equals("v")) {
        puntuacion += 3;
    }


    if (puntuacion <= 10) {
        System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel");
    } else if (puntuacion >= 11 &&  puntuacion <= 22) {
        System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    } else if (puntuacion > 22) {
        System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües que es lo que está pasando por su cabeza.");
    }

    s.close();
    
    }
}
