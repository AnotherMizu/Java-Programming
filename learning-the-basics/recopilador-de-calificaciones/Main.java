import java.util.Scanner;
import java.util.HashMap;


public class Main {

    public static void main(String[] args){

        HashMap<String, Integer> calificaciones = new HashMap<>();
        boolean validation = true;
        float promedio = 0;
        int sumaCalificaciones = 0;

        Scanner sc = new Scanner(System.in);
        while (validation == true){


            System.out.println("¿Cuantas materias tienes?");
            int materias = sc.nextInt();
            
            sc.nextLine();

            for (int i = 1; i <= materias; i += 1) {
                System.out.println("Que materia es?");
                String materia = sc.nextLine();
                System.out.println("Cuanto sacaste?");
                int calificacion = sc.nextInt();
                sc.nextLine();
                sumaCalificaciones = sumaCalificaciones + calificacion ;
                calificaciones.put(materia, calificacion);
            }

            for (int i : calificaciones.values()){
                promedio = sumaCalificaciones / materias;
                System.out.println("Tu promedio es de: " + promedio);

            }

            System.out.println("Do you want to try it again?");
            String userAnswer = sc.nextLine();

            if (userAnswer.equals("no")){
                validation = false;
            }
        }
            

        sc.close();
    }
        
}