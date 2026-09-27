import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FilePasswordSearcher {

    public static void main(String[] args) {
        String id = "";
        try (Scanner scanner = new Scanner(new File("text.txt"))) {
            while (scanner.hasNextLine()) {
                String content = (scanner.nextLine());
                if (content.contains("id")) {
                    String[] parts = content.split(":");
                    id = parts[1]; 
                }
            }
            System.out.println("your id is:" + id);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}