import java.util.Scanner;

public class PowTester {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a value: ");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println(pow(num));
    }

    public static int pow(int num) {
        int amount = 0;

        if(num == 0) {
            amount = 1;
        } else if(num < 0) {
            amount = 0;
        } else {
            amount = 2 * pow(num - 1);
        }

        return amount;
    }

}
