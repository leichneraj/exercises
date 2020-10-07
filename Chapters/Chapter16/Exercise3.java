import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the capacity of your gas tank in gallons? ");
        int capacity = scanner.nextInt();
        System.out.print("What percentage of gas is left in your gas tank? ");
        int percentageFull = scanner.nextInt();
        System.out.print("What is the MPG of your vehicle? ");
        int mpg = scanner.nextInt();
        scanner.close();

        double miles = mpg * (capacity * (percentageFull / 100.0));
        if(miles >= 200) {
            System.out.println("\nYou're good to go!");
        } else {
            System.out.println("\nGet gas!");
        }
    }
}
