import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value for N: ");
        int n = scanner.nextInt();
        scanner.close();

        double total = 0;

        while(n > 0) {
            total = total + (1.0 / n);
            n--;
        }
        System.out.println("\nSum:\n" + total);
    }
}