import java.util.Scanner;

public class Exercise4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your weight? ");
        int weight = scanner.nextInt();
        scanner.close();

        if(weight >= 220 && weight <= 280) {
            System.out.println("\nYou may enter.");
        } else {
            System.out.println("\nSorry, but you may not enter this competition.");
        }
    }
}