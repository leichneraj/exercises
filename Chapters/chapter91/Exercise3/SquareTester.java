import java.util.Scanner;

public class SquareTester {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value: ");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println(square(num));
    }

    public static int square(int num) {
        int amount = 0;

        if(num == 1) {
            amount = 1;
        } else if(num < 1) {
            amount = 0;
        } else {
            amount = square(num-1) + (2 * num) -1;
        }

        return amount;
    }

}
