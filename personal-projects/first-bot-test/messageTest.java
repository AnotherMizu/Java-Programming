import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class messageTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numAleatorio =  new Random();
        System.out.println("hola, ¿como te llamas?");
        String name = sc.nextLine();
        try {
            List<String> lines = Files.readAllLines(Paths.get("message.txt"));
            String greetings = lines.get(numAleatorio.nextInt(lines.size()));
            System.out.println(greetings.replace("{userName}", name));
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
    