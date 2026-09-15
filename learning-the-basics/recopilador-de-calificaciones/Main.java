import java.util.Scanner;
import java.util.HashMap;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args){
        //Aqui creo el diccionario que nos serviria para llevar el historial de las unidades
        HashMap<Integer, HashMap<String, Integer>> historial = new HashMap<>();

        //En este bloque inicializamos las variables con las que controlaremos el resto del programa
        boolean validation = true;
        float promedio = 0;
        Scanner sc = new Scanner(System.in);
        int numeroUnidad = 0;

        //empezamos el while principal que llevara todo el codigo hasta que la validación sea falsa
        while (validation == true){
            //aqui creamos el segundo diccionario en el que almacenaremos las calificaciones de unidad por separado
            HashMap<String, Integer> calificacionesUnidad = new HashMap<>();

            //Movemos el numero de unidad a el numero correcto segun la repeticion en la que va
            numeroUnidad++;

            //En esta linea preguntamos la cantidad de materias que posteriormente se usara para sacar promedios y saber cuantas veces iterar sobre las preguntas
            System.out.println("¿Cuantas materias tienes?");
            int cantMaterias = sc.nextInt();

            //cerramos la llamada de datos
            sc.nextLine();

            //llamamos a la funcion userinput con la que sacaremos el promedio, y crearemos algunos datos
            promedio = userInput(cantMaterias, sc, calificacionesUnidad);
            
            //Mostramos el resultado de promedio
            System.out.println(promedio);
            //Agregamos al diccionario historial lo que sería la primera unidad
            historial.put(numeroUnidad, calificacionesUnidad);

            //mostramos los resultados en general y preguntamos si se quiere reintentar
            showResults(calificacionesUnidad, promedio);

            String userAnswer = sc.nextLine();

            if (userAnswer.equals("no")){
                validation = false;
            }


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


        //muestra los promedios de esta unidad
        System.out.println(
            "Tus promedios en esta unidad son de: " + promedio
        );


        //muestra las calificaciones más baja y más alta y utilizamos .toString para convertir a los variables en texto sin caracteristicas de array
        System.out.println(
            "Tus calificaciones más baja y más alta son: "
            + Arrays.toString(cantidades)
        );

        //Hacemos la pregunta sobre si quiere reiniciar el programa para introducir más información
        System.out.println("Do you want to try it again?");
    }


    public static float userInput(int cantMaterias, Scanner sc, HashMap<String, Integer> calificacionesUnidad){
        //Ponemos en 0 la variable por si tiene datos se borren 
        float sumaCalificaciones = 0;

        //creamos un for que se repetira segun la cantidad de materias que tengas
        for (int i = 1; i <= cantMaterias; i += 1) {
            //pregunta cual es tu materia segun el punto del ciclo en el que estes    
            System.out.println("Cual es tu " + i + " materia");
            String materia = sc.nextLine(); 
        
            //pregunta la calificacion
            System.out.println("Cuanto sacaste?");
            int calificacion = sc.nextInt();

            sc.nextLine();

            //Suma las calificaciones, para luego utilizarla al promediar
            sumaCalificaciones += calificacion;
            
            //añade al segundo diccionario la materia y calificación unidos para que queden con una estructura del estilo clave:"Matematicas", valor:
            calificacionesUnidad.put(materia, calificacion);
        }

        float promedio = sumaCalificaciones / cantMaterias;

        return promedio;
    }
}