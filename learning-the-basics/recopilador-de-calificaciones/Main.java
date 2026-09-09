import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){

        HashMap<Integer, HashMap<String, Integer>> historial = new HashMap<>();
        boolean validation = true;
        float promedio = 0;

        Scanner sc = new Scanner(System.in);

        int numeroUnidad = 1;

        while (validation == true){

            HashMap<String, Integer> calificacionesUnidad = new HashMap<>();

            System.out.println("¿Cuantas materias tienes?");
            int cantMaterias = sc.nextInt();

            sc.nextLine();

            promedio = userInput(cantMaterias, sc, calificacionesUnidad);

            System.out.println(promedio);

            historial.put(numeroUnidad, calificacionesUnidad);

            showResults(calificacionesUnidad, promedio);

            String userAnswer = sc.nextLine();

            if (userAnswer.equals("no")){
                validation = false;
            }

            numeroUnidad++;

        }

        sc.close();
    }


    public static int[] notorias(HashMap<String, Integer> historial) {

        int[] calfNotorias = new int[2];

        calfNotorias[0] = Collections.min(historial.values());
        calfNotorias[1] = Collections.max(historial.values());

        return calfNotorias;
    }


    public static void showResults(HashMap<String, Integer> calificacionesUnidad, float promedio){

        int[] cantidades = Main.notorias(calificacionesUnidad);

        System.out.println(
            "Tus promedios en esta unidad son de: " + promedio
        );

        System.out.println(
            "Tus calificaciones más altas y más bajas son: "
            + Arrays.toString(cantidades)
        );

        System.out.println("Do you want to try it again?");
    }


    public static float userInput(int cantMaterias, Scanner sc, HashMap<String, Integer> calificacionesUnidad){

        float sumaCalificaciones = 0;

        for (int i = 1; i <= cantMaterias; i += 1) {

            System.out.println("Cual es tu " + i + " materia");
            String materia = sc.nextLine();

            System.out.println("Cuanto sacaste?");
            int calificacion = sc.nextInt();

            sc.nextLine();

            sumaCalificaciones += calificacion;

            calificacionesUnidad.put(materia, calificacion);
        }

        float promedio = sumaCalificaciones / cantMaterias;

        return promedio;
    }
}