import java.util.Scanner;

public class Exercise4 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the voltage?");
        int voltage = scanner.nextInt();

        System.out.println("What is the resistance?");
        int resistance = scanner.nextInt();

        double current = (voltage + 0.0) / resistance;
        System.out.println("\nThe current is: " + current);
    }
}