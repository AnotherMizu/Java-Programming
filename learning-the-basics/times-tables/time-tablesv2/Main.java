import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String validation = "yes";

        while (validation.equals("yes")) {

            System.out.println("Tell me a number to give you the multiplication table of it");
            int number = sc.nextInt();

            for (int i = 1; i <= 10; i += 1) {
                System.out.println(number * i);
            }

            sc.nextLine();

            System.out.println("Do you want to try again? yes or no");
            validation = sc.nextLine();
        }

        sc.close();
    }
}
