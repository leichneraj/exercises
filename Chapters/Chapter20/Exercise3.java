import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a value for N: ");
        int n = scanner.nextInt();

        double nDivider = n;
        double avg = 0;
        double avgSquare = 0;

        while(n > 0) {
            System.out.print("Enter integer value: ");
            double input = scanner.nextDouble();
            avg = avg + input;
            avgSquare = avgSquare + (input * input);
            n--;
        }
        avg = avg / nDivider;
        avgSquare = avgSquare / nDivider;
        double standardDeviation = Math.sqrt( avgSquare - (avg * avg));

        System.out.println("\nAverage: " + avg);
        System.out.println("Standard deviation: " + standardDeviation);
    }
}
