import java.util.Scanner;

public class PentTester {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a size: ");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println(pent(num));
    }

    public static int pent(int num) {
        int amount = 0;

        if(num == 1) {
            amount = 1;
        } else if(num < 1) {
            amount = 0;
        } else {
            amount = 
        }

        return amount;
    }

}
