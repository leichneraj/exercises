import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many integer inputs? ");
        int inputs = scanner.nextInt();

        int total = 0;

        while(inputs > 0) {
            System.out.print("Enter an integer: ");
            total = total + scanner.nextInt();
            inputs--;
        }
        scanner.close();

        System.out.println("\nSum of integers: " + total);
    }
}
