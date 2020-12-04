import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter low: ");
        int low = scanner.nextInt();
        System.out.print("Enter high: ");
        int high = scanner.nextInt();
        scanner.close();
        
        int n = high - low;

        int total = (n * (n + 1)) / 2;
        System.out.println("\nTotal: " + total);
    }
}
