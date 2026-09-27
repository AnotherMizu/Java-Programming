import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        HashMap<String, Integer> calificaciones = new HashMap<>();
        boolean validation = true;
        float promedio = 0;
        int sumaCalificaciones = 0;
        int calificacionMasAlta = 0;
        int calificacionMasBaja = 0;
        int[] calfNotorias = new int[2];

        Scanner sc = new Scanner(System.in);

        while (validation == true){

            System.out.println("¿Cuantas materias tienes?");
            int cantMaterias = sc.nextInt();    
            
            sc.nextLine();

            promedio = userInput(cantMaterias, sc, promedio, calificaciones);
            System.out.println(promedio);

            showResults(calificaciones, promedio);

            String userAnswer = sc.nextLine();
            if (userAnswer.equals("no")){
                validation = false;
            }
        }
        sc.close();
    }

    public static int[] notorias(HashMap<String, Integer> calificaciones) {  
        int[] calfNotorias = new int[2];
        calfNotorias[0] = Collections.min(calificaciones.values());
        calfNotorias[1] = Collections.max(calificaciones.values());

        return calfNotorias;
    }
    public static void showResults(HashMap<String, Integer> calificaciones, float promedio){

        int[] cantidades = Main.notorias(calificaciones);
        System.out.println("Tus promedios en esta unidad son de: " + promedio);
        System.out.println("Tus calificaciones más altas y más bajas son: " + Arrays.toString(cantidades));
        System.out.println("Do you want to try it again?");
   
    };
    public static float userInput(float cantMaterias,  Scanner sc, float promedio, HashMap<String, Integer> calificaciones ){
        float sumaCalificaciones = 0;
        for (int i = 1; i <= cantMaterias; i += 1) {
            System.out.println("Cual es tu " + i + " materia");
            String materia = sc.nextLine();
            System.out.println("Cuanto sacaste?");
            int calificacion = sc.nextInt();
            sc.nextLine();
            sumaCalificaciones += calificacion; 
            calificaciones.put(materia, calificacion);
        }
        promedio = sumaCalificaciones/cantMaterias;
        return promedio; 
    }
}