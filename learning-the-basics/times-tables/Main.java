public class Main {

    public static void main(String args[]){

        for (int multiplicando=1; multiplicando<=10; multiplicando+=1){

            System.out.println("Ahora con el "+ multiplicando);
        
            for (int multiplicador=1; multiplicador<=10; multiplicador+=1){
                
                System.out.println(multiplicando + "x" + multiplicador + " = " + multiplicador * multiplicando);
            }
        }
    }

}