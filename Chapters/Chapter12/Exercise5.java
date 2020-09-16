import java.util.Scanner;

public class Exercise5 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String inputString = scanner.next();

        System.out.println("Enter the beginning index:");
        int beginningIndex = scanner.nextInt();

        System.out.println("Enter the ending index:");
        int endingIndex = scanner.nextInt();

        scanner.close();

        if(beginningIndex < 0 || endingIndex < 0 || beginningIndex > inputString.length() || endingIndex > inputString.length()) {
            System.out.println("That is/those are not a valid index input(s).");
        } else {
            String outputString = inputString.substring(beginningIndex, endingIndex);
            System.out.println("\nOutput: \n" + outputString);
        }
    }
}
