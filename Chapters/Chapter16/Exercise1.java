import java.util.Scanner;

public class Exercise1 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter non-discounted value of purchases: ");
        double inputPrice = scanner.nextDouble();
        scanner.close();

        if(inputPrice > 10) {
            double discountedPrice = inputPrice - ((inputPrice / 100.0) * 10.0);
            System.out.println("Discounted price = " + discountedPrice);
        } else {
            System.out.println("No discount.");
        }
    }
}