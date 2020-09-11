import java.util.Scanner;

public class WeekTemp {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a value for Sunday's temperature:");
        int sun = scanner.nextInt();

        System.out.println("Pick a value for Monday's temperature:");
        int mon = scanner.nextInt();

        System.out.println("Pick a value for Tuesday's temperature:");
        int tue = scanner.nextInt();

        System.out.println("Pick a value for Wednesday's temperature:");
        int wed = scanner.nextInt();

        System.out.println("Pick a value for Thursday's temperature:");
        int thur = scanner.nextInt();

        System.out.println("Pick a value for Friday's temperature:");
        int fri = scanner.nextInt();

        System.out.println("Pick a value for Saturday's temperature:");
        int sat = scanner.nextInt();

        scanner.close();
        double avrg = ((sun + mon + tue + wed + thur + fri + sat) / 7.0);

        System.out.println("\nSunday's temperature: " + sun + "\n\nMonday's temperature: " + mon + "\n\nTuesday's temperature: " + tue + "\n\nWednesday's temperature: " + wed + "\n\nThrusday's temperature: " + thur + "\n\nFriday's temperature: " + fri + "\n\nSaturday's temperature: " + sat + "\n\nWeekly Average temperature: " + avrg);
    }
}