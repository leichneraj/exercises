import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start: ");
        int start = scanner.nextInt();
        start++;
        System.out.print("Enter end: ");
        int end = scanner.nextInt();
        scanner.close();

        while(start <= end) {
            System.out.println(start);
            start++;
        }
    }
}
