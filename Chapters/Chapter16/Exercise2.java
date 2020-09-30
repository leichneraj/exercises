import java.util.Scanner;

public class Exercise2 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of bolts: ");
        int bolts = scanner.nextInt();
        System.out.print("Number of nuts: ");
        int nuts = scanner.nextInt();
        System.out.print("Number of washers: ");
        int washers = scanner.nextInt();
        scanner.close();

        if((nuts >= bolts) && (washers >= (2 * bolts))) {
            System.out.print("\nTotal cost: " + ((bolts * 5) + (nuts * 3) + washers));
        } else if((nuts < bolts) && (washers < (2 * bolts))) {
            System.out.print("\nOrder error: too few of both washers and nuts.");
        } else if(washers < (2 * bolts)) {
            System.out.print("\nOrder error: too few washers.");
        } else {
            System.out.print("\nOrder error: too few nuts.");
        }
    }
}