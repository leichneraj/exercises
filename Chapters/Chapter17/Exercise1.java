import java.util.Scanner;

public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deliveryFee = 0.00;

        System.out.print("What is the name of the item? ");
        String name = scanner.next();
        System.out.print("What is the item price? ");
        double price = scanner.nextDouble();
        System.out.print("Would you like overnight delivery? (y == 1/n == 2) ");
        int overnight = scanner.nextInt();
        scanner.close();

        if(price < 10.00) {
            deliveryFee = 2.00;
        }

        System.out.println("\nInvoice:\n    " + name + "    $" + price);
        if(overnight == 1) {
            deliveryFee = deliveryFee + 3.00;
        }
        System.out.println("    Delivery    $" + deliveryFee + "\n    Total    $" + (1.00 * (deliveryFee + price)));
    }
}
