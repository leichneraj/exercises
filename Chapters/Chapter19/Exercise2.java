import java.util.Scanner;

public class Exercise2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;
        int formulaSum = 0;
        int formulaN = n;

        while(n > 0) {
            sum = sum + n;
            n--;
        }
        System.out.println("\nLoop sum: " + sum);

        formulaSum = (formulaN * (formulaN + 1)) / 2;
        System.out.println("Formula sum: " + formulaSum);
    }
}
