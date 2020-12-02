import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many years old are you? ");
        int years = scanner.nextInt();
        System.out.print("How many months past your most recent birthday? ");
        int months = scanner.nextInt();
        System.out.print("How many days since the start of the month? ");
        int days = scanner.nextInt();
        scanner.close();

        int allSeconds = ((((years * 365) * 24) * 60) * 60) + ((((months * 31) * 24) * 60) * 60) + (((days * 24) * 60) * 60);
        System.out.println("\n" + allSeconds + " seconds.");
    }
}
