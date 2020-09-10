import java.util.Scanner;

public class Quadratic {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pick a value for X:");


        String strX = scanner.next();
        int x=Integer.parseInt(strX);
        int Y = (3 * (x * x) - (8 * x) + 4);
        System.out.println(Y);
    }
}
// Note: I did not do what the exercise asked but actually went further than that and made it possible to get
// the Y value for almost any X value (provided the X value is not too large).