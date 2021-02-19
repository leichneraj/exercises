import java.util.Scanner;

public class LogTester {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Select a value: ");
        int num = scanner.nextInt();

        scanner.close();

        System.out.println(log(num));
    }

    public static int log(int num) {
        int amount = 0;

        if(num == 1 || num == 0) {
            amount = 0;
        } else if(num < 0) {
            amount = -1;
        } else {
            amount = 1 + log(num/2);
        }

        return amount;
    }

}
