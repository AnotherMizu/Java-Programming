/*
    Estructuras repetitivas(ciclos).
    En java existen 3 ciclos:
        1. for(rango){
            codigo
        }

        2. while (condition){
            codigo
        }

        3.do {
            // Código a ejecutar al menos una vez
        } while (condición);
*/
/*

    public class EstructurasRepetitivas{
    public static void main(){
        
        mostrarNumeros(1, 20, 1);
        mostrarNumeros(1, 100, 5);
        System.out.println("ahora del 100 al 1 de 2 en 2");
        for (int i = 100; i >= 1; i = i - 2){
            System.out.println(i);
        }
    }
    static void mostrarNumeros(int inicialNumber, int finalNumber, int paso){
        for (int i = inicialNumber; i <= 1; i = i + paso) {
            System.out.println(i);
        }
        
    }
}

*/

public class EstructurasRepetitivas {
    public static void main(String[] args) { // O 'public static void main()' si usas BlueJ
        
        System.out.println("del 1 al 20");
        mostrarNumeros(1, 20, 1);
        
        System.out.println("ahora del 1 al 100 de 5 en 5");
        mostrarNumeros(1, 100, 5);
        
        System.out.println("ahora del 100 al 1 de 2 en 2");
        mostrarNumeros(100, 1, 2);
    }
    
    static void mostrarNumeros(int inicialNumber, int finalNumber, int paso) {  
        if (inicialNumber<finalNumber) {
            for (int i = inicialNumber; i <= finalNumber; i = i + paso) {
                System.out.println(i);
            }
        }
        else {
            for (int i = inicialNumber; i >= finalNumber; i = i - paso){
                System.out.println(i);
            }
        }
    }
}