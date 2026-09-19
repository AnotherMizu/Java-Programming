import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class messageTest {
    public static void main(String[] args) {
        // creo las variables que voy a ocupar despues
        Scanner sc = new Scanner(System.in);
        Random numAleatorio =  new Random();

        //obtengo el nombre de el usuario
        System.out.println("hola, ¿como te llamas?");
        String name = sc.nextLine();
        try {
            //Extraigo del archivo "message.txt" todo lo que tiene y lo meto en "lines"
            List<String> lines = Files.readAllLines(Paths.get("message.txt"));

            //selecciono dentro de "lines" una palabra utilizando un numero generado desde 0 hasta el tamaño de la lista de lines
            String greetings = lines.get(numAleatorio.nextInt(lines.size()));

            //Aplico replace a la variable greetings para poder personalizar el nombre del usuario dentro del mensaje
            System.out.println(greetings.replace("{userName}", name));

        } catch (IOException e) {
            e.printStackTrace();
        }
        //cierro el scanner
        sc.close();
    }
}
    