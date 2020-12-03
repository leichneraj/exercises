import java.util.Scanner;

public class Exercise3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean overThree = false;
        int minutes = 0;

        System.out.print("Number of items: ");
        int items = scanner.nextInt();
        System.out.print("Time for one item: ");
        int seconds = scanner.nextInt();
        
        if(items > 3) {
            System.out.println("Only three items allowed.");
            overThree = true;
        } else if(items == 3) {
            seconds = seconds * 2;
        } else if(items == 2) {
            seconds = seconds + (seconds / 2);
        }

        if(seconds > 60) {
            minutes = seconds / 60;
            seconds = seconds - (minutes * 60);
        }

        if(overThree == false) {
            System.out.println("\nHeat for " + minutes + " minute(s) and " + seconds + " seconds.");
        }
    }
}