import java.util.Scanner;

public class Exercise3 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double: ");
        double input = scanner.nextDouble();
        scanner.close();

        double base2Log = (Math.log(input) / (Math.log(2)));
        System.out.print("Base 2 log of " + input + "is " + base2Log);
    }
}