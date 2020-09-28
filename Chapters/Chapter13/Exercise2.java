import java.util.Scanner;

public class Exercise2 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gravity = 32.174;

        System.out.println("Pick a value for the time in seconds for the fall:");
        double time = scanner.nextInt();
        scanner.close();

        double distance = 0.5 * (gravity * (time * time));
        System.out.println("\nThe distance traveled is: " + distance);
    }
}