import java.util.Scanner;

public class TriangleTester {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many rows of pins? ");
        int rows = scanner.nextInt();

        scanner.close();

        System.out.println("The amount of pins in " + rows + "rows: " + Triangle(rows));
    }

    public static int Triangle(int row) {
        int total = 0;

        if(row == 1) {
            total = 1;
        } else if(row < 1) {
            total = 0;
        } else {
            total = row + Triangle(row - 1);
        }

        return total;
    }

}