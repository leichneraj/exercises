import java.util.Scanner;
public class AverageRainfall {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Pick a value for April rainfall:");
        String strApril = scanner.next();

        System.out.println("Pick a value for May rainfall:");
        String strMay = scanner.next();

        System.out.println("Pick a value for June rainfall:");
        String strJune = scanner.next();

        int april=Integer.parseInt(strApril);
        int may=Integer.parseInt(strMay);
        int june=Integer.parseInt(strJune);
        int average = ((april + may + june) / 3);
        
        System.out.println("Rainfall for April:  " + april);
        System.out.println("Rainfall for May:  " + may);
        System.out.println("Rainfall for June:  " + june);
        System.out.println("Average rainfall:    " + average);
    }
}
