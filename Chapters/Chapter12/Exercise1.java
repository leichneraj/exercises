import java.util.Scanner;

public class Exercise1 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a radius:");
        int r = scanner.nextInt();
        scanner.close();

        double a = (Math.PI * (r * r));
        System.out.println("Area of the circle = " + a);
    }
}
