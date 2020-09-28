import java.util.Scanner;

public class Exercise1 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter cost per kilowatt-hour  in cents: ");
        double cost = scanner.nextDouble();

        System.out.println("Enter the kilowatt-hours used per year: ");
        double kilowattHoursYearly = scanner.nextDouble();

        scanner.close();

        double costYearly = cost * kilowattHoursYearly;
        System.out.println("Annual cost: " + costYearly);
    }
}