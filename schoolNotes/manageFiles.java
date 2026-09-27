import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class manageFiles {

    public static void main(String[] args) {
        String sCarpAct = System.getProperty("user.dir");
        File carpeta = new File(sCarpAct);
        String identificador = "";
        String direccion = "";
        Path path = Path.get("C:\Users\ederf\OneDrive\Desktop\java-programming\schoolNotes>");
        

        File[] elementos = carpeta.listFiles();
        if (elementos != null) {
            for (File archivo : elementos) {
                String fileType = detectByExtension(archivo.getName());
                if (fileType.equals("txt")) {
                    try {
                        List<String> content = Files.readAllLines(archivo.toPath());
                        


                        if (!content.isEmpty()) {
                            String primeraLinea = content.get(0);

                            
                            String[] parts = primeraLinea.split("!");

                            if (parts.length > 1) {
                                identificador = parts[1];
                            } else {
                                identificador = parts[0];
                            }

                            System.out.println("your id is: " + identificador);
                            
                            String fileName = path + identificador;
                            new File("/path/directory").mkdirs(fileName);

                        }
                    } 
                    catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static String detectByExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');
        if (dotIndex > 0) {
            return filename.substring(dotIndex + 1).toLowerCase();
        }
        return "Unknown";
    }
}