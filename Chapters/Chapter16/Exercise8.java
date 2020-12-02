import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your age? ");
        int age = scanner.nextInt();
        System.out.print("What is the time? ");
        int time = scanner.nextInt();
        scanner.close();

        if(time < 1700) {
            if(age >= 13) {
                System.out.println("\nPrice: $5.00");
            } else {
                System.out.println("\nPrice: $2.00");
            }
        } else {
            if(age >= 13) {
                System.out.println("\nPrice: $8.00");
            } else {
                System.out.println("\nPrice: $4.00");
            }
        }
    }
    
}
