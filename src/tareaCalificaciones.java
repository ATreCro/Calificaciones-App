
import java.util.Scanner;

public class tareaCalificaciones {

    public static void main(String args[]) {
        Scanner consola = new Scanner(System.in);
        System.out.println("Introduzca su puntuación numerica: ");

        var puntuacion = consola.nextInt();
        var calificacion = "Desconocida";

        if (puntuacion <= 10 && puntuacion >= 9) {
            calificacion = "A";
        } else if (puntuacion < 9 && puntuacion >= 8) {
            calificacion = "B";
        } else if (puntuacion < 8 && puntuacion >= 7) {
            calificacion = "C";
        } else if (puntuacion < 7 && puntuacion >= 6) {
            calificacion = "D";
        } else if (puntuacion < 6 && puntuacion >= 0) {
            calificacion = "F";
        }else 
            calificacion = "Valor desconocido"; 
        System.out.println("calificacion = " + calificacion);
    }
}
