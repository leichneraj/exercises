import java.util.Scanner;

public class Exercise2 {
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many cents?");
        int inC = scanner.nextInt();
        scanner.close();

        int c = (inC % 100);
        int d = ((inC - c) / 100);
        System.out.println("That is " + d + " dollars and " + c + " cents.");
    }
}
