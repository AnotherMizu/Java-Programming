import static javax.swing.JOptionPane.*;
import java.util.Random;

public class diceGame {

    public static void main(String[] args){
        int diceMax = Integer.parseInt(showInputDialog("¿Cuál es el valor máximo del dado?")); 

        if (dice < 1) {
            return console.log("numero de caras invalido");
        }

        showMessageDialog(null, generarMensajeResultado(diceMax));
    }

    public static String generarMensajeResultado(int diceMax){
        
        // Aqui utilizo final (porque leí que así se aplica algo similar a const)
        final int PUNTOS_GANAR = 50, VALOR_MINIMO = 1, PUNTOS_PERDER = 25;

        Random random = new Random();
        int dice = VALOR_MINIMO + random.nextInt(diceMax);
        String specialMessage = "";

        // Mensaje especial
        if (dice == diceMax){
            specialMessage = "\n¡¡¡Felicidades, obtuviste el número máximo!!!";
        } else if (dice == VALOR_MINIMO){
            specialMessage = "\n¡Qué mala suerte, obtuviste el número mínimo!";
        }

        int puntos;
        String accion;

        // utilizo una funcion que se llama "esPar" para comprobar si es par
        if (esPar(dice)){
            puntos = PUNTOS_GANAR;
            accion = "ganaste ";
        } else {
            puntos = PUNTOS_PERDER;
            accion = "perdiste ";
        }

        //retorno el mensaje
        return "Obtuviste un: " + dice + specialMessage + "\n" + accion + puntos + " puntos.";
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}