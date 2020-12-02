import java.util.Scanner;
import java.lang.Math;

public class Exercise6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the temperature? ");
        int temperature = scanner.nextInt();
        System.out.print("What is the wind speed? ");
        int windSpeed = scanner.nextInt();
        scanner.close();

        double windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);

        if(windSpeed < 3 || temperature > 50) {
            System.out.println("\nWind chill = " + temperature);
        } else {
            System.out.println("\nWind chill = " + windChill);
        }
    }
}