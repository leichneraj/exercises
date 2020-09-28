import java.util.Scanner;

public class Exercise4 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for X: ");
        double x = scanner.nextDouble();
        System.out.print("Enter a value for Y: ");
        double y = scanner.nextDouble();
        scanner.close();

        double arithmeticMean = (x + y) / 2;
        double harmonicMean = 2.0 / ((1.0 / x) + (1.0 / y));

        System.out.println("Arithmetic Mean = " + arithmeticMean);
        System.out.println("Harmonic Mean = " + harmonicMean);
    }
}
